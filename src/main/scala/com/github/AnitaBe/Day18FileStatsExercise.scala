package com.github.AnitaBe

object Day18FileStatsExercise extends App {
  //download and save a text file of your choosing from gutenberg.org
  val url = "https://gutenberg.org/cache/epub/67813/pg67813.txt"
  val dst = "src/resources/HenriFabreJ_FieldForestFarm.txt"
  val text = MyUtil.getTextFromWebAndSave(url, dst)
  println(text.take(100))
  //Get Character Count (including whitespace)
  val charCount = MyUtil.getCharacterCount(text.split("/n"))
  println(s"Total characters in text: $charCount")
  //Get Line Count
  val textLines = MyUtil.getLinesFromFile(dst)
  val lineCount = textLines.length
  println(s"Total lines in text: $lineCount")
  //get Word Count
  val wordCount = MyUtil.getWordCountPerLine(textLines).sum
  println(s"This text has $wordCount words")
  //Get average Word Count in each text line
  val avgCount = MyUtil.myRound(wordCount/lineCount,2)
  println(s"Each line has $avgCount words on average")

  //You can use the Util functions or maybe add some of your own if you want

  val textAuthor = MyUtil.getAuthor(textLines,"Author:")
  println(s"Author: $textAuthor")

  val textTitle = MyUtil.getTitle(textLines,"Title:")
  println(s"Title: $textTitle")
}
