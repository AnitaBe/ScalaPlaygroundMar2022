import java.time.Year
import scala.io.StdIn.readLine

object Day3AgeCalculator extends App {
  //TODO write an application that asks for person's name and their age
  //Greet the person with their name
  //and calculate when they will be 100 years old and print it out
  // val year = 2022 // this would be okay
  val year=Year.now.getValue
  val myName=readLine("What is your name?")
  val MyAge= readLine("What is your Age: ").toInt
  val ThisYear = 2022
  val HundredYears= ThisYear-MyAge+100
  println(s"Dear $myName, You will celebrate Your 100th birthday at $HundredYears")


}
