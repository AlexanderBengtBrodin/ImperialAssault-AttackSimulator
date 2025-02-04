package ImAs

class Weapon(val dicePool: Vector[Dice], val surgeTable: surgeTable) {

    var attachments: Vector[attachment] = Vector.empty

    def attack(defence:Vector[Dice]): symbolTally =
        val defenceRoll = defence.map(_.roll()).reduce(_ + _) 
        var output: symbolTally = dicePool.map(_.roll()).reduce(_ + _) 

        if (defenceRoll(Symbol.Dodge) > 0) {
            return output.setSymbol(Symbol.Damage,0)
        }
        
        // println("Rolled Attack: " + output.toString())
        // println("Rolled Defence: " + defenceRoll.toString())

        for attch <- attachments do 
            output = attch.modify(output)
        
        output = output.addSymbol(Symbol.Surge, -defenceRoll(Symbol.Evade))
        //println(output.toString())

        output = surgeTable.spendSurges(output)
        //println(output.toString())

        
        output = output.addSymbol(Symbol.Damage, -(defenceRoll(Symbol.Block)-output(Symbol.Pierce).min(0)))
        //println(output.toString())

        return output
        
}


