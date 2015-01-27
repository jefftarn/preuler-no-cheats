import math._

val x = 3 to 977
val y = x.map {x:Int => x * x}
val z = y.combinations(3).toList
val aa = z.filter {x => x(0) + x(1) == x(2)}

val cc = aa.map {y => y.map { z => sqrt(z).toInt}}

val dd = cc.map {x => x.foldLeft(0)((m: Int, n: Int) => m + n)}

dd.contains(1000)




