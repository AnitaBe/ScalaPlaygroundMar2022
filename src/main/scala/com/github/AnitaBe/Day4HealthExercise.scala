package com.github.AnitaBe

import scala.io.StdIn.readLine

object Day4HealthExercise extends App {
  println("Temperature exercise")
  //TODO ask person for name
  //Ask for their temperature
  //if temperature is below 35 print "That is a bit too cold"
  //if temperature is between 35 and 37 (both sides inclusive) then print "You are all right"
  //finally if the temperature is over 37 then print "You have a fever! Consider contacting a doctor"
  val name = readLine("Hello! What is your name?\n")
  println(s"What is your body temperature $name?")
  val temp = readLine().toFloat
  val lowTemp = 35
  val highTemp = 37

  if (temp < lowTemp) {
    println("That is a bit too cold")
  } else if (temp >= lowTemp && temp <= highTemp) {
    println("You are all right")
  } else {
    println("You have a fever! Consider contacting a doctor")
  }


}
