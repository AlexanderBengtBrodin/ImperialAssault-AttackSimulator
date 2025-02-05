package ImAs

import scala.compiletime.ops.double
import ImAs.Weapons


@main
def main() = 
    def test(weapon: Weapon, defender: Vector[Dice], amount: Int): Float =
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
    // lightSaber.Attachments = Vector(Attachment.balancedHilt))
    // test(lightSaber, Vector(Dice.White), 1000000)
    // println()

    // println("Testing vibroAxe w Balanced hilt: ")
    // vibroAxe.Attachments = Vector(Attachment.balancedHilt))
    // test(vibroAxe, Vector(Dice.White), 1000000)
    // println()

    // println("Testing force pike: ")
    // //vibroAxe.Attachments = Vector(Attachment.balancedHilt)
    // test(forcePike, Vector(Dice.White), 1000000)
    // println()

    // println("Testing force pike w Balanced Hit: ")
    // forcePike.Attachments = Vector(Attachment.balancedHilt)
    // test(forcePike, Vector(Dice.White), 1000000)
    // println()

    // println("Testing force pike with high impact guard: ")
    // vibroAxe.Attachments = Vector(Attachment.balancedHilt)
    // test(guardPike, Vector(Dice.White), 1000000)
    // println()

    // println("Testing A280: ")
    // test(A280, Vector(Dice.White), 1000000)
    // println()

    
    // println("Testing A280 with tactical Display: ")
    // A280.Attachments = Vector(Attachment.balancedHilt)
    // test(A280, Vector(Dice.White), 1000000)
    // println()

    // println("Testing A280 w Disruption cell & Tactical display: ")
    // modA280.Attachments = Vector(Attachment.balancedHilt)
    // test(modA280, Vector(Dice.Black), 1000000)
    // println()


    // println("Testing BD1: ")
    // test(BD1, Vector(Dice.White), 1000000)
    // println()

    // println("Testing balanced BD1: ")
    // BD1.Attachments = Vector(Attachment.balancedHilt))
    // test(BD1, Vector(Dice.White), 1000000)
    // println()

    // println("Testing extended BD1: ")
    // BD1.Attachments = Vector(Attachment((a) => a.addSymbol(symbol.Pierce,1)))
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

    // focusMaul.Attachments = Vector(Attachment.plus1Damage,Attachment.autoCleave2)
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


    // focusMaul.Attachments = Vector(Attachment.plus1Damage,Attachment.autoCleave2)
    // val maulFocusDif = 
    //     for defence <- dice yield
    //         test(focusMaul,defence,1000000) - test(cleaveMaul,defence,1000000)

    // println("Maul: " + maulFocusDif.mkString(", "))
    // println("Droid: " + droidFocusDif.mkString(", "))

    // println(testDice(Vector(Dice.Red,Dice.Blue), 1000000))

    Weapons.lightSaber.Attachments = Vector(Attachment.balancedHilt)
    for defence <- dice do
        println(defence.className)
        println("Balanced Hilt Lightsaber:")
        test(Weapons.lightSaber,defence,1000000)
        println("Guarded Light Saber")
        test(Weapons.guardLightSaber,defence,1000000)
        println()