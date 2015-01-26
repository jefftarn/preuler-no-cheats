// A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

// Find the largest palindrome made from the product of two 3-digit numbers.


import scala.util.control._

object PeP4 {
	def main(args: Array[String]) {
		val seqLoop =  (100 to 999).toArray.reverse
		var maxPal = 0
		var n1 = 0
		var n2 = 0


		val loop = new Breaks;


		for (i <- seqLoop) {
			loop.breakable {
				for (j <- seqLoop) {
					val curIteration = i * j

					if (maxPal > curIteration ){
						loop.break
					}

					if (isPalindromeNum(curIteration)){
						maxPal = curIteration
						n1 = i
						n2 = j
					}


				}
			}
		}	

		println(maxPal);
		println(n1);
		println(n2);

	}


	def isPalindromeNum(n : Int): Boolean ={
		val nl = n.toString.toList
		val nlLen = nl.length

		if(nlLen % 2 != 0) {
			return false;
		};

		val splitPoint =  nlLen / 2
		val numPart1 = nl.slice(0,splitPoint).reverse
		val numPart2 = nl.slice(splitPoint,nlLen)

		val v = if (numPart1 == numPart2)
					{
						true
					} else 
					{
						false
					}
		v;

	}



}