package com.github.AnitaBe

import scala.io.StdIn.readLine

object Day15WeekdayExercise extends App {
  //write a function getDay(day: Int): String that returns day of the week in English Monday, Tuesday and so on until Sunday
  //Given an index 1 to 7
  //if value is outside you return Unknown Weekday
  def getDay(day: Any): String = day match {
    case 1 => "Monday"
    case 2 => "Tuesday"
    case 3 => "Wednesday"
    case 4 => "Thursday"
    case 5 => "Friday"
    case 6 => "Saturday"
    case 7 => "Sunday"
    case _ => "Invalid day of the week" // the default, catch-all
  }


  //write a function getDayType(day: String): String
  // that returns "Workday" for "Monday" to "Friday" and "Weekend" for "Saturday" and "Sunday"
  // default can be "Groundhog Day" or something equally silly
  def getDayType(day: String): String = day.capitalize match {
    case "Monday" | "Tuesday" | "Wednesday" | "Thursday" | "Friday" => "workday"
    case "Saturday" | "Sunday" => "weekend"
    case _ => "There is no such a day"
  }

  //test the functions with some data!
  val dayNum = readLine("Insert number of weekday:").toInt
  println(getDay(dayNum))

  val dayType = readLine("What day is today?")
  println(s"It is ${getDayType(dayType)}")

  println(getDay(3))
  println(getDay(8))
}
