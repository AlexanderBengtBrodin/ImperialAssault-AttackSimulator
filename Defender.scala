package ImAs


class Defender(val dicePool: Vector[Dice]) {
    assert(dicePool.isEmpty || dicePool.contains(Dice.White) || dicePool.contains(Dice.Black))

    var modifiers: Vector[(SymbolTally) => SymbolTally] = Vector.empty

    def defend() =
        var output = 
            dicePool.map(_.roll())
            .reduce(_ + _)
        
        modifiers.foreach(mod => 
                output = mod.apply(output)
            )

        output
        
}