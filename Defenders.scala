package ImAs


object Defenders {

    lazy val whiteDice = new Defender(Vector(Dice.White))

    lazy val blackDice = new Defender(Vector(Dice.Black))


    lazy val bobaFett = new Defender(Vector(Dice.Black))
    bobaFett.modifiers = Vector(
        (_.addSymbol(Symbol.Block,1)),
        (_.addSymbol(Symbol.Evade,1))
    )

    //Refers to Shyla Venard using her "Deadly Grace" card
    lazy val evadingShyla = new Defender(Vector(Dice.Black))
    evadingShyla.modifiers = Vector(
        (_.addSymbol(Symbol.Evade,1))
    )

    //Refers to Fenn Signis using his "Take Cover" card
    lazy val coveringFenn = new Defender(Vector(Dice.Black,Dice.White))

    //Refers to Gaarkhan using "Wookie loyalty" card
    lazy val loyalGaarkhan = new Defender(Vector(Dice.Black))
    evadingShyla.modifiers = Vector(
        (_.addSymbol(Symbol.Evade,1))
    )
}