package ImAs

import Dice.* 

object Weapons {
    lazy val IfRifle = new Weapon(Vector(Green, Blue), SurgeTable(Vector(
        (1 -> (1, Symbol.Damage))
    )))
    //IfRifle.Attachments = Vector(Attachment.balancedHilt))

    lazy val A280 = new Weapon(Vector(Green, Blue), SurgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))
    //A280.Attachments = Vector(Attachment.balancedHilt))

    
    val modA280 = new Weapon(Vector(Green, Red), SurgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))

    lazy val lightSaber = new Weapon(Vector(Blue,Red), SurgeTable(Vector(
        (1 -> (3, Symbol.Pierce)),
        (1 -> (1, Symbol.Damage))
    )))

    lazy val guardLightSaber = new Weapon(Vector(Blue,Red), SurgeTable(Vector(
        (1 -> (3, Symbol.Pierce)),
        (1 -> (2, Symbol.Damage)),
        (1 -> (1, Symbol.Damage))
    )))


    lazy val vibroAxe = new Weapon(Vector(Yellow,Red), SurgeTable(Vector(
        (1 -> (1, Symbol.Pierce))
    )))

    lazy val BdVibroAxe = new Weapon(Vector(Green,Red), SurgeTable(Vector(
        // (1 -> (2, Symbol.Damage)),
        (1 -> (1, Symbol.Damage))
    )))


    lazy val forcePike = new Weapon(Vector(Yellow,Red,Yellow), SurgeTable(Vector(
        //(1 -> (2, symbol.Damage)),
        (1 -> (1, Symbol.Pierce)),
        (1 -> (1, Symbol.Pierce))
    )))
    
    lazy val guardPike = new Weapon(Vector(Yellow,Red,Yellow), SurgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (1, Symbol.Pierce)),
        (1 -> (1, Symbol.Pierce))
    )))

    lazy val BD1 = new Weapon(Vector(Green,Red), SurgeTable(Vector(
        (1 -> (1, Symbol.Damage))
    )))

    lazy val modBD1 = new Weapon(Vector(Green,Red), SurgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (1, Symbol.Damage)),
    )))

    lazy val cleaveMaul = new Weapon(Vector(Red,Yellow), SurgeTable(Vector(
        (1 -> (3, Symbol.Pierce))
    )))
    cleaveMaul.Attachments = Vector(Attachment.plus1Damage, Attachment.autoCleave2)

    lazy val focusMaul = new Weapon(Vector(Red,Yellow, Green), SurgeTable(Vector(
        (1 -> (3, Symbol.Pierce))
    )))
    focusMaul.Attachments = Vector(Attachment.plus1Damage)

    lazy val eliteDroid = new Weapon(Vector(Blue,Yellow,Yellow), SurgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))

    lazy val focusEliteDroid = new Weapon(Vector(Blue,Yellow,Yellow,Green), SurgeTable(Vector(
        (1 -> (2, Symbol.Damage)),
        (1 -> (2, Symbol.Pierce))
    )))

    lazy val punchDagger = new PunchDagger

}