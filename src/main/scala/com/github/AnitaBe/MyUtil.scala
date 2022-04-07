package com.github.AnitaBe

object MyUtil {
  //round function
  def myRound(n: Double, precision: Int = 0): Double = {
    //trick is to multiply by some power of 10 then divide by that multiplier
    //so (n*100).round/100 would give us 2 points of precision
    0.0 //
    val multiplier = Math.pow(10, precision)
    (n * multiplier).round / multiplier //we utilize built in round
    //n.round
  }

  println(myRound(3.1415926))
  println(myRound(3.1415926, precision = 2))
  println(myRound(3.1415926, precision = 4))


}
