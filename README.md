# What is this?

This is a crude tool to simulate the average damage of attacks for the "Star Wars: Imperial Assault" boardgame. 

# How to run?

Currently, this program is not for the faint of heart. In the TestMain.scala file you will find the main method together with 
many core set weapons. All results are printed directly to the terminal. 

# What does it test?
It tests and prints 2 qualities, the average damage dealt and the average amount of strain recovered. 
The average damage done is self explanatory. After factoring the block and evade of the defender, then spending surges, 
how much damage does the attack deal on average?


When an attack has an extra surge that can't be spent, it will add -1 strain used to the attack.
As such, the amount of strain recovered varies from 0 to 1.

# How to add a weapon.

See below for example:

```
val exampleWeapon = new Weapon(
      Vector(Dice.Green, Dice.Blue), //Specify the damage dice pool of the weapon
      surgeTable(Vector(            //Create a surge table containing 
        (1 -> (2, Symbol.Pierce)), //Format is (%surgeCost -> (%symbolAmount, %symbolType))
        (1 -> (1, Symbol.Damage))  //Surges giving several different symbols is not implemented
    )))

exampleWeapon.attachments = Vector(attachment.balancedHilt)) //After creating the weapon, give it an attachment
```
