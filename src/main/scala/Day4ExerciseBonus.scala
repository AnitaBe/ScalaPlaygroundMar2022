import scala.io.StdIn.readLine

object Day4ExerciseBonus extends App {
  println("Xmas bonus calculator")
  //TODO
  //Ask for person's name
  val myName=readLine("What is your name?")
  //Ask for how long they have worked at the firm
  val myExperience= readLine("How long have you been working in company? ").toInt
  //Ask for monthly wage
  val myWage = readLine("What is your salary?" ).toInt
  //Calculate Xmas bonus if they have worked at least 2  years otherwise print sorry no bonus
  println("Do you qualify for Christmas bonus?")
  if (myExperience<2) {
    println(s"Sorry, no bonus this year, $myName")
  }
  else {
    val myBonus= (myExperience-2)*(myWage*0.15)
    println(s"Your experience is more than 2 years, you will get $myBonus")
  }
  //Bonus is years worked over 2 years * 15% of monthly wage
  //so 5 years worked, 1000 Euros wage would give 450 Euro bonus (3 years * 150)


}
