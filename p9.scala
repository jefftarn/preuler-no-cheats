import math._

// A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

// a2 + b2 = c2
// For example, 32 + 42 = 9 + 16 = 25 = 52.

// There exists exactly one Pythagorean triplet for which a + b + c = 1000.
// Find the product abc.

object PeP9 {
	def main(args: Array[String]) {

		val candidateRange = 1 to 997
		val combo2 = candidateRange.combinations(2).toList
		val combo2LimMax = combo2.filter {x => x(0) + x(1) <= 999 } //  999 b/c the 3rd num would be at least 1
		val combo3 = combo2LimMax.map {x => List(x(0), x(1), 1000 - (x(0)+x(1)))}.map {y => y.sorted}
		val pythagoreanList = combo3.filter {x => sqrForInt(x(0)) + sqrForInt(x(1)) == sqrForInt(x(2))}.distinct
		val pythagoreanListProduct = pythagoreanList.map {x => x.foldLeft(1)((m: Int, n: Int) => m * n)}
		println(pythagoreanListProduct(0))

		// val a = x.map {x:Int => x * x}
		// val b = a.combinations(3).toList
		// val aa = b.filter {x => x(0) + x(1) == x(2)}
		// val cc = aa.map {y => y.map { z => sqrt(z).toInt}}
		// val dd = cc.map {x => x.foldLeft(0)((m: Int, n: Int) => m + n)}
		// dd.contains(1000) //check


	}

	def sqrForInt(x: Int): Int = {
		x  * x
	}
}