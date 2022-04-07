package com.github.AnitaBe

object Day3TypeCasting extends App {
  println("Type Casting different data types")
  //https://docs.scala-lang.org/tour/unified-types.html
  val a = 200 // this is an integer by default
  val b = a.toByte //byte is unsigned and can hold only 256 different values
  println(a, b)

}
