package ImAs

import scala.util.Random

enum Dice(val sides: Vector[symbolTally]):
    def roll(): symbolTally =
         return sides(Random.nextInt(sides.length))

    case Red extends Dice(Vector(
        symbolTally(Map(Symbol.Damage -> 1)),
        symbolTally(Map(Symbol.Damage -> 2)),
        symbolTally(Map(Symbol.Damage -> 2)),
        symbolTally(Map(Symbol.Damage -> 2, Symbol.Surge -> 1)),
        symbolTally(Map(Symbol.Damage -> 3)),
        symbolTally(Map(Symbol.Damage -> 3))
        ))
    case Blue extends Dice(Vector(
        symbolTally(Map(Symbol.Damage -> 0, Symbol.Surge -> 1)),
        symbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 0)),
        symbolTally(Map(Symbol.Damage -> 2, Symbol.Surge -> 0)),
        symbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 1)),
        symbolTally(Map(Symbol.Damage -> 2, Symbol.Surge -> 0)),
        symbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 0))
        ))
    case Green extends Dice(Vector(
        symbolTally(Map(Symbol.Damage -> 0, Symbol.Surge -> 1)),
        symbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 1)),
        symbolTally(Map(Symbol.Damage -> 2, Symbol.Surge -> 0)),
        symbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 1)),
        symbolTally(Map(Symbol.Damage -> 2, Symbol.Surge -> 0)),
        symbolTally(Map(Symbol.Damage -> 2, Symbol.Surge -> 0))
        ))
    case Yellow extends Dice(Vector(
        symbolTally(Map(Symbol.Damage -> 0, Symbol.Surge -> 1)),
        symbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 2)),
        symbolTally(Map(Symbol.Damage -> 2, Symbol.Surge -> 0)),
        symbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 1)),
        symbolTally(Map(Symbol.Damage -> 0, Symbol.Surge -> 1)),
        symbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 0))
        ))
    case Black extends Dice(Vector(
        symbolTally(Map(Symbol.Block -> 1, Symbol.Evade -> 0)),
        symbolTally(Map(Symbol.Block -> 1, Symbol.Evade -> 0)),
        symbolTally(Map(Symbol.Block -> 2, Symbol.Evade -> 0)),
        symbolTally(Map(Symbol.Block -> 2, Symbol.Evade -> 0)),
        symbolTally(Map(Symbol.Block -> 3, Symbol.Evade -> 0)),
        symbolTally(Map(Symbol.Block -> 0, Symbol.Evade -> 1))
        ))
    case White extends Dice(Vector(
        symbolTally(Map(Symbol.Block -> 0, Symbol.Evade -> 0)),
        symbolTally(Map(Symbol.Block -> 1, Symbol.Evade -> 0)),
        symbolTally(Map(Symbol.Block -> 0, Symbol.Evade -> 1)),
        symbolTally(Map(Symbol.Block -> 1, Symbol.Evade -> 1)),
        symbolTally(Map(Symbol.Block -> 1, Symbol.Evade -> 1)),
        symbolTally(Map(Symbol.Dodge -> 1))
        ))

