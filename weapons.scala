package ImAs



object Weapons {
    lazy val IfRifle = new Weapon(Vector(Dice.Green, Dice.Blue), SurgeTable(Vector(
        (1 -> (1, Symbol.Damage))
    )))
    //IfRifle.Attachments = Vector(Attachment.balancedHilt))

    lazy val A280 = new Weapon(Vector(Dice.Green, Dice.Blue), SurgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))
    //A280.Attachments = Vector(Attachment.balancedHilt))

    
    lazy val modA280 = new Weapon(Vector(Dice.Green, Dice.Red), SurgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))


    lazy val lightSaber = new Weapon(Vector(Dice.Blue,Dice.Red), SurgeTable(Vector(
        (1 -> (3, Symbol.Pierce)),
        (1 -> (1, Symbol.Damage))
    )))

    lazy val guardLightSaber = new Weapon(Vector(Dice.Blue,Dice.Red), SurgeTable(Vector(
        (1 -> (3, Symbol.Pierce)),
        (1 -> (2, Symbol.Damage)),
        (1 -> (1, Symbol.Damage))
    )))


    lazy val vibroAxe = new Weapon(Vector(Dice.Yellow,Dice.Red), SurgeTable(Vector(
        (1 -> (1, Symbol.Pierce))
    )))

    lazy val forcePike = new Weapon(Vector(Dice.Yellow,Dice.Red,Dice.Yellow), SurgeTable(Vector(
        //(1 -> (2, symbol.Damage)),
        (1 -> (1, Symbol.Pierce)),
        (1 -> (1, Symbol.Pierce))
    )))
    
    lazy val guardPike = new Weapon(Vector(Dice.Yellow,Dice.Red,Dice.Yellow), SurgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (1, Symbol.Pierce)),
        (1 -> (1, Symbol.Pierce))
    )))

    lazy val BD1 = new Weapon(Vector(Dice.Green,Dice.Red), SurgeTable(Vector(
        (1 -> (1, Symbol.Damage))
    )))

    lazy val modBD1 = new Weapon(Vector(Dice.Green,Dice.Red), SurgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (1, Symbol.Damage)),
    )))

    lazy val cleaveMaul = new Weapon(Vector(Dice.Red,Dice.Yellow), SurgeTable(Vector(
        (1 -> (3, Symbol.Pierce))
    )))
    cleaveMaul.Attachments = Vector(Attachment.plus1Damage, Attachment.autoCleave2)

    lazy val focusMaul = new Weapon(Vector(Dice.Red,Dice.Yellow, Dice.Green), SurgeTable(Vector(
        (1 -> (3, Symbol.Pierce))
    )))
    focusMaul.Attachments = Vector(Attachment.plus1Damage)

    lazy val eliteDroid = new Weapon(Vector(Dice.Blue,Dice.Yellow,Dice.Yellow), SurgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))

    lazy val focusEliteDroid = new Weapon(Vector(Dice.Blue,Dice.Yellow,Dice.Yellow,Dice.Green), SurgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))

}