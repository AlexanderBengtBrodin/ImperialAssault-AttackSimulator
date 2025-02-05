package ImAs

import scala.compiletime.ops.double
import ImAs.weapons


@main
def main() = 
    def test(weapon: Weapon, defender: Vector[Dice], amount: Int): Float =
        var freq: symbolTally = symbolTally()

        for i <- 1 to amount do
            freq = freq + weapon.attack(defender)

        println("Average Damage: " + s"${freq(Symbol.Damage).toFloat/amount}")
        println("Average Strain Recovered: " + s"${freq(Symbol.Strain).toFloat/amount}")

        return freq(Symbol.Damage).toFloat/amount

    def testDice(dicePool: Vector[Dice], amount: Int): Vector[Float] =
        var freq: symbolTally = symbolTally()

        for i <- 1 to amount do
            freq = freq + dicePool.map(_.roll()).reduce(_ + _) 

        return Vector(freq(Symbol.Damage).toFloat/amount, freq(Symbol.Surge).toFloat/amount)



    
    // println("Testing IfRifle: ")
    // test(IfRifle, Vector(Dice.Black), 1000000)

    // println("Testing A280: ")
    // test(A280, Vector(Dice.Black), 1000000)

    // println("Testing lightSaber: ")
    // test(lightSaber, Vector(Dice.White), 1000000)
    // println()

    // println("Testing vibroAxe: ")
    // test(vibroAxe, Vector(Dice.White), 1000000)
    // println()
    
    // println("Testing lightSaber w Balanced hilt: ")
    // lightSaber.attachments = Vector(attachment.balancedHilt))
    // test(lightSaber, Vector(Dice.White), 1000000)
    // println()

    // println("Testing vibroAxe w Balanced hilt: ")
    // vibroAxe.attachments = Vector(attachment.balancedHilt))
    // test(vibroAxe, Vector(Dice.White), 1000000)
    // println()

    // println("Testing force pike: ")
    // //vibroAxe.attachments = Vector(attachment.balancedHilt)
    // test(forcePike, Vector(Dice.White), 1000000)
    // println()

    // println("Testing force pike w Balanced Hit: ")
    // forcePike.attachments = Vector(attachment.balancedHilt)
    // test(forcePike, Vector(Dice.White), 1000000)
    // println()

    // println("Testing force pike with high impact guard: ")
    // vibroAxe.attachments = Vector(attachment.balancedHilt)
    // test(guardPike, Vector(Dice.White), 1000000)
    // println()

    // println("Testing A280: ")
    // test(A280, Vector(Dice.White), 1000000)
    // println()

    
    // println("Testing A280 with tactical Display: ")
    // A280.attachments = Vector(attachment.balancedHilt)
    // test(A280, Vector(Dice.White), 1000000)
    // println()

    // println("Testing A280 w Disruption cell & Tactical display: ")
    // modA280.attachments = Vector(attachment.balancedHilt)
    // test(modA280, Vector(Dice.Black), 1000000)
    // println()


    // println("Testing BD1: ")
    // test(BD1, Vector(Dice.White), 1000000)
    // println()

    // println("Testing balanced BD1: ")
    // BD1.attachments = Vector(attachment.balancedHilt))
    // test(BD1, Vector(Dice.White), 1000000)
    // println()

    // println("Testing extended BD1: ")
    // BD1.attachments = Vector(attachment((a) => a.addSymbol(symbol.Pierce,1)))
    // test(BD1, Vector(Dice.White), 1000000)
    // println()

    // println("Testing focus Maul against White: ")
    // test(focusMaul, Vector(Dice.White), 1000000)
    // println()

    // println("Testing focus Maul against Black: ")
    // test(focusMaul, Vector(Dice.Black), 1000000)
    // println()

    // println("Testing focus Maul against Black&White: ")
    // test(focusMaul, Vector(Dice.Black,Dice.White), 1000000)
    // println()


    // println("Testing cleave Maul against White: ")
    // test(cleaveMaul, Vector(Dice.White), 1000000)
    // println()

    // println("Testing cleave Maul against Black: ")
    // test(cleaveMaul, Vector(Dice.Black), 1000000)
    // println()

    // println("Testing cleave Maul against Black&White: ")
    // test(cleaveMaul, Vector(Dice.Black,Dice.White), 1000000)
    // println()

    // focusMaul.attachments = Vector(attachment.plus1Damage,attachment.autoCleave2)
    // println("Testing cleave&focus Maul against White: ")
    // test(focusMaul, Vector(Dice.White), 1000000)
    // println()

    // println("Testing cleave&focus Maul against Black: ")
    // test(focusMaul, Vector(Dice.Black), 1000000)
    // println()

    // println("Testing cleave&focus Maul against Black&White: ")
    // test(focusMaul, Vector(Dice.Black,Dice.White), 1000000)
    // println()

    val dice = Vector(Vector(Dice.White),Vector(Dice.Black),Vector(Dice.White,Dice.Black))
    
    // val droidFocusDif =
    //     for defence <- dice yield
    //         test(focusEliteDroid,defence,1000000) - test(eliteDroid,defence,1000000)


    // focusMaul.attachments = Vector(attachment.plus1Damage,attachment.autoCleave2)
    // val maulFocusDif = 
    //     for defence <- dice yield
    //         test(focusMaul,defence,1000000) - test(cleaveMaul,defence,1000000)

    // println("Maul: " + maulFocusDif.mkString(", "))
    // println("Droid: " + droidFocusDif.mkString(", "))

    // println(testDice(Vector(Dice.Red,Dice.Blue), 1000000))

    weapons.lightSaber.attachments = Vector(attachment.balancedHilt)
    for defence <- dice do
        println(defence.className)
        println("Balanced Hilt Lightsaber:")
        test(weapons.lightSaber,defence,1000000)
        println("Guarded Light Saber")
        test(weapons.guardLightSaber,defence,1000000)
        println()