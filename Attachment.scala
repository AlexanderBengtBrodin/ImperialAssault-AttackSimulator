package ImAs



/**
  * Attatchments are weapon modifiers that apply after rolling attack dice.
  *
  * @param modifier
  */
enum Attachment(modifier: (SymbolTally) => SymbolTally):
    def modify(sym: SymbolTally): SymbolTally =
        return modifier.apply(sym)

    case balancedHilt extends Attachment(a => a.addSymbol(Symbol.Surge,1))
    case tacticalDisplay extends Attachment(a => a.addSymbol(Symbol.Surge,1))
    case smartHilt extends Attachment(a => if a(Symbol.Surge) == 0 then a.addSymbol(Symbol.Surge,1) else a )
    case autoCleave2 extends Attachment((a) => a.addSymbol(Symbol.Damage,2))
    case plus1Damage extends Attachment((a) => a.addSymbol(Symbol.Damage,1))
