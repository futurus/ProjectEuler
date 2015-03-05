import scala.collection.mutable._
import scala.util.control.Breaks._
import scala.math._

/**
 * Created by vunguyen on 1/25/15.
 */

object Prob10 {
  def main(args: Array[String]): Unit = {
    var primes = MutableList(2, 3)

    for (i <- 5 to 2000000) {
      var prime = true

      breakable {
        for (p <- primes) {
          if ((p > sqrt(i)) || (i % p == 0)) {
            prime = false
            break
          }
        }
      }

      if (prime) {
        primes += i
      }
      println(primes)
    }

    println(primes.sum)
  }
}