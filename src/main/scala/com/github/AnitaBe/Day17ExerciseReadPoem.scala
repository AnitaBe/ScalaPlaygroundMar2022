package com.github.AnitaBe

import scala.io.Source

case object Day17ExerciseReadPoem extends App{
  //read stopping by poem from src/resources/stopping_by.txt
  val poemPath = "src/resources/stopping_by.txt"
  //get poem name - it is the first line
  val myPoemLines = Source.fromFile(poemPath).getLines.toArray
  val poemName = myPoemLines.head.mkString
  println(s"Name of the poem is $poemName")
  //get poet - it is in the 2nd line but we want just the poet
  val poemAuthor = myPoemLines(1).drop(3).mkString
  println(s"Author of poem $poemAuthor")

  //Get all lines which contain "woods" somewhere in the text
  //so instead of startsWith we use contains
println("Lines that contains woods:")
  val woodLine = myPoemLines.filter(_.contains("woods"))
  woodLine.foreach(println)

}
