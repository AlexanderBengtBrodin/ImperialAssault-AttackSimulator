package ImAs

/**
  * Represents a weapon card. Contains a attack dice, surgeTable and list of attachments.
  *
  * @param attackPool
  * @param SurgeTable
  */
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

        for attch <- Attachments do 
            attackTally = attch.modify(attackTally)
        
        attackTally = attackTally.evadedBy(defenceTally)

        attackTally = SurgeTable.spendSurges(attackTally)

        return attackTally.blockedBy(defenceTally)


        

        
}


