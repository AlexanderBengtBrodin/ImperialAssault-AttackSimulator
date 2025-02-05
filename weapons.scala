package ImAs



object weapons {
    lazy val IfRifle = new Weapon(Vector(Dice.Green, Dice.Blue), surgeTable(Vector(
        (1 -> (1, Symbol.Damage))
    )))
    //IfRifle.attachments = Vector(attachment.balancedHilt))

    lazy val A280 = new Weapon(Vector(Dice.Green, Dice.Blue), surgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))
    //A280.attachments = Vector(attachment.balancedHilt))

    
    lazy val modA280 = new Weapon(Vector(Dice.Green, Dice.Red), surgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))


    lazy val lightSaber = new Weapon(Vector(Dice.Blue,Dice.Red), surgeTable(Vector(
        (1 -> (3, Symbol.Pierce)),
        (1 -> (1, Symbol.Damage))
    )))

    lazy val guardLightSaber = new Weapon(Vector(Dice.Blue,Dice.Red), surgeTable(Vector(
        (1 -> (3, Symbol.Pierce)),
        (1 -> (2, Symbol.Damage)),
        (1 -> (1, Symbol.Damage))
    )))


    lazy val vibroAxe = new Weapon(Vector(Dice.Yellow,Dice.Red), surgeTable(Vector(
        (1 -> (1, Symbol.Pierce))
    )))

    lazy val forcePike = new Weapon(Vector(Dice.Yellow,Dice.Red,Dice.Yellow), surgeTable(Vector(
        //(1 -> (2, symbol.Damage)),
        (1 -> (1, Symbol.Pierce)),
        (1 -> (1, Symbol.Pierce))
    )))
    
    lazy val guardPike = new Weapon(Vector(Dice.Yellow,Dice.Red,Dice.Yellow), surgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (1, Symbol.Pierce)),
        (1 -> (1, Symbol.Pierce))
    )))

    lazy val BD1 = new Weapon(Vector(Dice.Green,Dice.Red), surgeTable(Vector(
        (1 -> (1, Symbol.Damage))
    )))

    lazy val modBD1 = new Weapon(Vector(Dice.Green,Dice.Red), surgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (1, Symbol.Damage)),
    )))

    lazy val cleaveMaul = new Weapon(Vector(Dice.Red,Dice.Yellow), surgeTable(Vector(
        (1 -> (3, Symbol.Pierce))
    )))
    cleaveMaul.attachments = Vector(attachment.plus1Damage, attachment.autoCleave2)

    lazy val focusMaul = new Weapon(Vector(Dice.Red,Dice.Yellow, Dice.Green), surgeTable(Vector(
        (1 -> (3, Symbol.Pierce))
    )))
    focusMaul.attachments = Vector(attachment.plus1Damage)

    lazy val eliteDroid = new Weapon(Vector(Dice.Blue,Dice.Yellow,Dice.Yellow), surgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))

    lazy val focusEliteDroid = new Weapon(Vector(Dice.Blue,Dice.Yellow,Dice.Yellow,Dice.Green), surgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))

}