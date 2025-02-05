package ImAs

import scala.util.Random

enum Dice(val sides: Vector[SymbolTally]):
    def roll(): SymbolTally =
         return sides(Random.nextInt(sides.length))

    case Red extends Dice(Vector(
        SymbolTally(Map(Symbol.Damage -> 1)),
        SymbolTally(Map(Symbol.Damage -> 2)),
        SymbolTally(Map(Symbol.Damage -> 2)),
        SymbolTally(Map(Symbol.Damage -> 2, Symbol.Surge -> 1)),
        SymbolTally(Map(Symbol.Damage -> 3)),
        SymbolTally(Map(Symbol.Damage -> 3))
        ))
    case Blue extends Dice(Vector(
        SymbolTally(Map(Symbol.Damage -> 0, Symbol.Surge -> 1)),
        SymbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 0)),
        SymbolTally(Map(Symbol.Damage -> 2, Symbol.Surge -> 0)),
        SymbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 1)),
        SymbolTally(Map(Symbol.Damage -> 2, Symbol.Surge -> 0)),
        SymbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 0))
        ))
    case Green extends Dice(Vector(
        SymbolTally(Map(Symbol.Damage -> 0, Symbol.Surge -> 1)),
        SymbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 1)),
        SymbolTally(Map(Symbol.Damage -> 2, Symbol.Surge -> 0)),
        SymbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 1)),
        SymbolTally(Map(Symbol.Damage -> 2, Symbol.Surge -> 0)),
        SymbolTally(Map(Symbol.Damage -> 2, Symbol.Surge -> 0))
        ))
    case Yellow extends Dice(Vector(
        SymbolTally(Map(Symbol.Damage -> 0, Symbol.Surge -> 1)),
        SymbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 2)),
        SymbolTally(Map(Symbol.Damage -> 2, Symbol.Surge -> 0)),
        SymbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 1)),
        SymbolTally(Map(Symbol.Damage -> 0, Symbol.Surge -> 1)),
        SymbolTally(Map(Symbol.Damage -> 1, Symbol.Surge -> 0))
        ))
    case Black extends Dice(Vector(
        SymbolTally(Map(Symbol.Block -> 1, Symbol.Evade -> 0)),
        SymbolTally(Map(Symbol.Block -> 1, Symbol.Evade -> 0)),
        SymbolTally(Map(Symbol.Block -> 2, Symbol.Evade -> 0)),
        SymbolTally(Map(Symbol.Block -> 2, Symbol.Evade -> 0)),
        SymbolTally(Map(Symbol.Block -> 3, Symbol.Evade -> 0)),
        SymbolTally(Map(Symbol.Block -> 0, Symbol.Evade -> 1))
        ))
    case White extends Dice(Vector(
        SymbolTally(Map(Symbol.Block -> 0, Symbol.Evade -> 0)),
        SymbolTally(Map(Symbol.Block -> 1, Symbol.Evade -> 0)),
        SymbolTally(Map(Symbol.Block -> 0, Symbol.Evade -> 1)),
        SymbolTally(Map(Symbol.Block -> 1, Symbol.Evade -> 1)),
        SymbolTally(Map(Symbol.Block -> 1, Symbol.Evade -> 1)),
        SymbolTally(Map(Symbol.Dodge -> 1))
        ))

