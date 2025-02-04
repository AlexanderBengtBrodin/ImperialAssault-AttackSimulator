package ImAs

import scala.compiletime.ops.double


class surgeTable(initTable: Vector[(Int,(Int,Symbol))]) {
    val table: Vector[(Int, (Int, Symbol))] = initTable

    def spendSurges(map: symbolTally): symbolTally = 
        var output = map
        var spendable: Int = map(Symbol.Surge)

        for entry <- table do
            val surgeCost = entry._1
            val sym = entry._2._2
            val symAmnt = entry._2._1

            if (spendable >= surgeCost) {
                spendable -= surgeCost
                output = output.addSymbol(sym, symAmnt)
            }
        
        if (spendable >= 1) {
                spendable -= 1
                output = output.addSymbol(Symbol.Strain, -1)
            }
        
        return output.setSymbol(Symbol.Surge, spendable)



}