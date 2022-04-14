package com.github.AnitaBe

import com.github.AnitaBe.MyUtil.{getLinesFromFile, getTextFromFile}

import scala.io.Source

object Day17ReadingTextFiles extends App {
  println("Let's read some text files!")
println(System.getProperty("user.dir"))

  val absoluteFilePath = "C:\\Users\\anita\\IdeaProjects\\ScalaPlaygroundMar2022\\src\\resources\\two_roads.txt"
  val relativeFilePath = "src/resources/two_roads.txt"
 // for (character <- Source.fromFile(filePath)) println(character)
 // for (line <- Source.fromFile(filePath).getLines) println(line)
 // val myPoem = Source.fromFile(absoluteFilePath).mkString
  val myPoem = Source.fromFile(relativeFilePath).mkString
  println(myPoem)

  val myPoemLines = Source.fromFile(relativeFilePath).getLines.toArray
  println("*"*40)
  println("Printing Poem line by line\n")

  for (line <- myPoemLines) println(line)

  //move to Utilities

  val myText = getTextFromFile(relativeFilePath)
  println(myText)


  //moved to utilities

  val maxLines = 5
  println(s"FIRST $maxLines LINES")
  val myLines=getLinesFromFile(relativeFilePath)
  myLines.slice(0, maxLines).foreach(println)
  //same as above
  println(myLines.slice(0,maxLines).mkString)

}
