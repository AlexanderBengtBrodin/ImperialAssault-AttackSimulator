package ImAs

class Weapon(val attackPool: Vector[Dice], val SurgeTable: SurgeTable) {

    var Attachments: Vector[Attachment] = Vector.empty

    def attack(defence:Vector[Dice]): SymbolTally =
        resolve(
            attackPool.map(_.roll()).reduce(_ + _),
            defence.map(_.roll()).reduce(_ + _)
        )

    def attack(defending: Defender): SymbolTally =
        resolve(
            attackPool.map(_.roll()).reduce(_ + _),
            defending.defend()
        )

    def resolve(initAttackTally: SymbolTally, defenceTally: SymbolTally): SymbolTally = 
        var attackTally = initAttackTally

        if (defenceTally(Symbol.Dodge) > 0) {
            return attackTally.setSymbol(Symbol.Damage,0)
        }
        
        // println("Rolled Attack: " + attackTally.toString())
        // println("Rolled Defence: " + defenceRoll.toString())

        for attch <- Attachments do 
            attackTally = attch.modify(attackTally)
        
        attackTally = attackTally.addSymbol(Symbol.Surge, -defenceTally(Symbol.Evade))
        //println(attackTally.toString())

        attackTally = SurgeTable.spendSurges(attackTally)
        //println(attackTally.toString())

        
        attackTally = attackTally.addSymbol(Symbol.Damage, -(defenceTally(Symbol.Block)-attackTally(Symbol.Pierce).min(0)))
        //println(output.toString())

        return attackTally


        

        
}


