package ImAs

class Weapon(val dicePool: Vector[Dice], val SurgeTable: SurgeTable) {

    var Attachments: Vector[Attachment] = Vector.empty

    def attack(defence:Vector[Dice]): SymbolTally =
        val defenceRoll = defence.map(_.roll()).reduce(_ + _) 
        var output: SymbolTally = dicePool.map(_.roll()).reduce(_ + _) 

        if (defenceRoll(Symbol.Dodge) > 0) {
            return output.setSymbol(Symbol.Damage,0)
        }
        
        // println("Rolled Attack: " + output.toString())
        // println("Rolled Defence: " + defenceRoll.toString())

        for attch <- Attachments do 
            output = attch.modify(output)
        
        output = output.addSymbol(Symbol.Surge, -defenceRoll(Symbol.Evade))
        //println(output.toString())

        output = SurgeTable.spendSurges(output)
        //println(output.toString())

        
        output = output.addSymbol(Symbol.Damage, -(defenceRoll(Symbol.Block)-output(Symbol.Pierce).min(0)))
        //println(output.toString())

        return output
        
}


