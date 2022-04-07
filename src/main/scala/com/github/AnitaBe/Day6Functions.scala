package com.github.AnitaBe

import com.github.AnitaBe.MyUtil.myRound

object Day6Functions extends App {
  println("Let's go eat something!")

  //println("Let's eat potatoes!")
  // println("Let's eat potatoes!")
  //println("Let's eat potatoes!")

  // for(_ <- 0 until 3) println("Eating tons of potatoes")

  //for (_ <- 1 to 3) {
  // println("Let's sit down at a table")
  // println("Pick up")
  // println("Let's eat potatoes")
  // }

  // def eat(): Unit = {
  // println("Let's sit down at a table")
  //println("Pick up")
  //println("Let's eat potatoes")
  //println("This is cool")
  //}

  //eat() // this calls function
  //println("I do other things")
  //println("I am getting dinner")
  //eat()


  //for (_ <- 0 until 4) eat
  def orderFood(dish: String, waiterName: String): Unit = {
    println(s"$waiterName, I would like to order $dish")
    println(s"${dish.capitalize} is one of my favourites")
  }

  orderFood(dish = "ice cream", "Woldemars")
  orderFood(dish = "beet soup", "Alice")
  orderFood("hamburger", "Anita") //intelliJ tells me what parameter
  orderFood("fish and chips", "Martin")

  def printAdd(a: Int, b: Int): Unit = println(s"Result of $a+$b=${a + b}")

  printAdd(3, 5)
  printAdd(13, -25)

  val a = 500

  def add(a: Int, b: Int): Int = {
    a + b
  }

  val c = add(10, 50)
  println(s"result is $c")

  def multi(a: Int, b: Int): Int = a * b

  val result = multi(add(2, 3), add(5, 10))
  println(s"So (2+3)*(5+10)= $result")

  //round function
  def greetWaiter(name: String = "Joe", isYelling: Boolean = false): Unit = {
    val greeting = s"Hello there $name"
    if (isYelling) {
      println(greeting.toUpperCase)
    } else {
      println(greeting)
    }
    println(s"Hello there $name")
  }

  greetWaiter()
  greetWaiter("Bob")
  greetWaiter("Carol")
  greetWaiter("Dave", isYelling = true)


  println(myRound(3.1415926))
  println(myRound(3.1415926, precision = 2))
  println(myRound(3.1415926, precision = 4))
  println(myRound(3.1415926, precision = 6))

}
