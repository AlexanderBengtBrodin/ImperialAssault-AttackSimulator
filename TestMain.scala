package ImAs

import scala.compiletime.ops.double
import ImAs.Weapons
import ImAs.Defenders
import Dice.* 
import ImAs.Weapons.IfRifle

/**
  * The main class of this project, write or uncomment code to test average damage and strain recovered.
  * Prints directly to the terminal.
  */
object TestMain {

    def main(args: Array[String]): Unit = 
        def test(weapon: Weapon, defender: Defender, amount: Int): Float =
            var freq: SymbolTally = SymbolTally()

            for i <- 1 to amount do
                freq = freq + weapon.attack(defender)

            println("Average Damage: " + s"${freq(Symbol.Damage).toFloat/amount}")
            println("Average Strain Recovered: " + s"${-freq(Symbol.Strain).toFloat/amount}")

            return freq(Symbol.Damage).toFloat/amount

        def testDice(dicePool: Vector[Dice], amount: Int): Vector[Float] =
            var freq: SymbolTally = SymbolTally()

            for i <- 1 to amount do
                freq = freq + dicePool.map(_.roll()).reduce(_ + _) 

            return Vector(freq(Symbol.Damage).toFloat/amount, freq(Symbol.Surge).toFloat/amount)

        def printingTest(weaponName: String, weapon: Weapon, defender: Defender, amount: Int): Float =
            println("Testing " + weaponName + ":")
            val output = test(weapon, defender ,amount)
            println("")
            output


        //Example probability tests

        // printingTest(
        //     "IfRifle", 
        //     Weapons.IfRifle, 
        //     Defenders.evadingShyla, 
        //     1000000
        //     )

        //Weapons.IfRifle.Attachments = Vector(Attachment.tacticalDisplay) //Override

        // printingTest(
        //     "Tactical Display IfRifle", 
        //     Weapons.IfRifle, 
        //     Defenders.evadingShyla, 
        //     1000000
        //     )

        
        // printingTest(
        //     "Lightsaber",
        //     Weapons.lightSaber,
        //     Defenders.blackDice,
        //     1000000
        // )
        
}