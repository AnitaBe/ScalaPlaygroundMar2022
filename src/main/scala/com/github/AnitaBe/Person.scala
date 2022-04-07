package com.github.AnitaBe

case class Person(name: String,
                  relation: String,
                  var topSpeed: Int) {
  println("Person creation started!")

  def increaseSpeed(delta: Int): Int = {
    topSpeed += delta
    topSpeed //in functional style we return the new value in OOP style e would return nothing
  }

  println(s"Person has been created with name $name")
}
