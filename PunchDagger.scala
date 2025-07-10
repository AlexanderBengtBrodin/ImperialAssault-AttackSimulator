package ImAs

import Dice.* 
import Symbol.*

class PunchDagger extends Weapon(Vector(Blue,Yellow), SurgeTable(Vector(
        (2 -> (3, Symbol.Damage))
    ))) {


    override
     def attack(defence:Vector[Dice]): SymbolTally =
        resolve(
            rerollDice(attackPool.map(_.roll())).reduce(_ + _),
            defence.map(_.roll()).reduce(_ + _)
        )

    override
    def attack(defending: Defender): SymbolTally =
        resolve(
            rerollDice(attackPool.map(_.roll())).reduce(_ + _),
            defending.defend()
        )

    def rerollDice(rolled: Vector[SymbolTally]): Vector[SymbolTally] =
        // println(s"Before rerolls: $rolled")
        var currentRoll = rolled
        if singleFace(currentRoll(1)) then
            currentRoll = currentRoll.updated(1,SymbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 2)))
        else 
            if singleFace(currentRoll(0)) then
                if rolled(1)(Surge) == 1 then
                    currentRoll = currentRoll.updated(0, SymbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 1)))
                else 
                    currentRoll = currentRoll.updated(0, SymbolTally(Map(Symbol.Damage -> 2, Symbol.Surge -> 0)))
        

        // println(s"After rerolls: $currentRoll")
        currentRoll

    def singleFace(face: SymbolTally): Boolean =
        face(Damage) + face(Surge) == 1
}