package com.github.AnitaBe

object Day8CubeSequence extends App {
  //TODO ask user for starting number
  //TODO ask user for ending numbers
  //Calculate cubes of these integers including start and end AND store results in a sequence
  //Print the saved sequence on screen
  val startNum = readLine("What is your starting number? ").toInt
  val endNum = readLine("What is your end number? ").toInt
  val numbers = startNum to endNum.toInt
  val calcCubes = scala.collection.mutable.ArrayBuffer[Int]()
  for (n <- startNum to endNum) {
    val myCube = n * n * n
    calcCubes += myCube
  }
  println(calcCubes)
  //extra challenge save odd cubes and print them
  val oddCubes = for (calcCubes <- calcCubes if calcCubes % 2 == 0) yield calcCubes
  println(oddCubes)
}
