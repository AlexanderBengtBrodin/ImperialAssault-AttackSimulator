package ImAs



class symbolTally(initMap: Map[Symbol, Int] = Map()) {
    val map: Map[Symbol, Int] = initMap

    def apply(sym: Symbol): Int =
        if (map.contains(sym)) {
            return map(sym)
        } else {
            return 0
        }
    
 
    def addSymbol(sym: Symbol, amount: Int): symbolTally =
        //assert(amount + map(sym) >= 0 || sym == symbol.Strain)

        return symbolTally(map + (sym -> (apply(sym)+amount)))

    def setSymbol(sym: Symbol, amount: Int): symbolTally = 
        //assert(amount >= 0 || sym == symbol.Strain)

        return symbolTally(map + (sym -> amount))


    def spendSurges(table: surgeTable): symbolTally =
        return table.spendSurges(this)

    def +(other: symbolTally): symbolTally =
        var initmap: Map[Symbol,Int] = Map()

        for sym <- this.map.keySet union other.map.keySet do
            initmap += (sym -> (this(sym)+other(sym)))

        return symbolTally(initmap)

    override def toString(): String =
        return map.map((sym,int) => s"$int $sym").mkString(",")
}
