package ImAs



class SymbolTally(initMap: Map[Symbol, Int] = Map()) {
    val map: Map[Symbol, Int] = initMap

    def apply(sym: Symbol): Int =
        if (map.contains(sym)) {
            return map(sym)
        } else {
            return 0
        }
    
 
    def addSymbol(sym: Symbol, amount: Int): SymbolTally =
        //assert(amount + map(sym) >= 0 || sym == symbol.Strain)

        return SymbolTally(map + (sym -> (apply(sym)+amount)))

    def setSymbol(sym: Symbol, amount: Int): SymbolTally = 
        //assert(amount >= 0 || sym == symbol.Strain)

        return SymbolTally(map + (sym -> amount))


    def spendSurges(table: SurgeTable): SymbolTally =
        return table.spendSurges(this)

    def +(other: SymbolTally): SymbolTally =
        var initmap: Map[Symbol,Int] = Map()

        for sym <- this.map.keySet union other.map.keySet do
            initmap += (sym -> (this(sym)+other(sym)))

        return SymbolTally(initmap)

    override def toString(): String =
        return map.map((sym,int) => s"$int $sym").mkString(",")
}
