package ImAs



enum attachment(modifier: (symbolTally) => symbolTally):
    def modify(sym: symbolTally): symbolTally =
        return modifier.apply(sym)

    case balancedHilt extends attachment(a => a.addSymbol(Symbol.Surge,1))
    case smartHilt extends attachment(a => if a(Symbol.Surge) == 0 then a.addSymbol(Symbol.Surge,1) else a )
    case autoCleave2 extends attachment((a) => a.addSymbol(Symbol.Damage,2))
    case plus1Damage extends attachment((a) => a.addSymbol(Symbol.Damage,1))



// class attachment(modifier: (symbolTally) => symbolTally) {
//     def modify(tally: symbolTally): symbolTally =
//         modifier.apply(tally)
// }