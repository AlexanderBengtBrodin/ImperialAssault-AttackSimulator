package ImAs
import Dice.* 

object Defenders {

    lazy val whiteDice = new Defender(Vector(White))

    lazy val blackDice = new Defender(Vector(Black))


    lazy val bobaFett = new Defender(Vector(Black))
    bobaFett.modifiers = Vector(
        (_.addSymbol(Symbol.Block,1)),
        (_.addSymbol(Symbol.Evade,1))
    )

    //Refers to Shyla Venard using her "Deadly Grace" card
    lazy val evadingShyla = new Defender(Vector(Black))
    evadingShyla.modifiers = Vector(
        (_.addSymbol(Symbol.Evade,1))
    )

    //Refers to Fenn Signis using his "Take Cover" card
    lazy val coveringFenn = new Defender(Vector(Black,White))

    //Refers to Gaarkhan using "Wookie loyalty" card
    lazy val loyalGaarkhan = new Defender(Vector(Black))
    evadingShyla.modifiers = Vector(
        (_.addSymbol(Symbol.Evade,1))
    )
}