package ImAs



object weapons {
    val IfRifle = new Weapon(Vector(Dice.Green, Dice.Blue), surgeTable(Vector(
        (1 -> (1, Symbol.Damage))
    )))
    //IfRifle.attachments = Vector(attachment.balancedHilt))

    val A280 = new Weapon(Vector(Dice.Green, Dice.Blue), surgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))
    //A280.attachments = Vector(attachment.balancedHilt))

    
    val modA280 = new Weapon(Vector(Dice.Green, Dice.Red), surgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))


    val lightSaber = new Weapon(Vector(Dice.Blue,Dice.Red), surgeTable(Vector(
        (1 -> (3, Symbol.Pierce)),
        (1 -> (1, Symbol.Damage))
    )))

    val guardLightSaber = new Weapon(Vector(Dice.Blue,Dice.Red), surgeTable(Vector(
        (1 -> (3, Symbol.Pierce)),
        (1 -> (2, Symbol.Damage)),
        (1 -> (1, Symbol.Damage))
    )))


    val vibroAxe = new Weapon(Vector(Dice.Yellow,Dice.Red), surgeTable(Vector(
        (1 -> (1, Symbol.Pierce))
    )))

    val forcePike = new Weapon(Vector(Dice.Yellow,Dice.Red,Dice.Yellow), surgeTable(Vector(
        //(1 -> (2, symbol.Damage)),
        (1 -> (1, Symbol.Pierce)),
        (1 -> (1, Symbol.Pierce))
    )))
    
    val guardPike = new Weapon(Vector(Dice.Yellow,Dice.Red,Dice.Yellow), surgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (1, Symbol.Pierce)),
        (1 -> (1, Symbol.Pierce))
    )))

    val BD1 = new Weapon(Vector(Dice.Green,Dice.Red), surgeTable(Vector(
        (1 -> (1, Symbol.Damage))
    )))

    val modBD1 = new Weapon(Vector(Dice.Green,Dice.Red), surgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (1, Symbol.Damage)),
    )))

    val cleaveMaul = new Weapon(Vector(Dice.Red,Dice.Yellow), surgeTable(Vector(
        (1 -> (3, Symbol.Pierce))
    )))
    cleaveMaul.attachments = Vector(attachment.plus1Damage, attachment.autoCleave2)

    val focusMaul = new Weapon(Vector(Dice.Red,Dice.Yellow, Dice.Green), surgeTable(Vector(
        (1 -> (3, Symbol.Pierce))
    )))
    focusMaul.attachments = Vector(attachment.plus1Damage)

    val eliteDroid = new Weapon(Vector(Dice.Blue,Dice.Yellow,Dice.Yellow), surgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))

    val focusEliteDroid = new Weapon(Vector(Dice.Blue,Dice.Yellow,Dice.Yellow,Dice.Green), surgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))

}