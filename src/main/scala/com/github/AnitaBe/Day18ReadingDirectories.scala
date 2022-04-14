package com.github.AnitaBe

object Day18ReadingDirectories extends App {
  val src = "src/resources"
  val files = MyUtil.getListOfFiles(src)
  files.foreach(println)
 val woodsFiles = MyUtil.getListOfFiles(src,regex = "woods*txt")
  woodsFiles.foreach(println)

  println(s"Is ${files.head} there? ${MyUtil.isFileTHere(files.head.toString)}")
  val badFilePath = "notAFile.txt"
  println(s"Is ${badFilePath} there? ${MyUtil.isFileTHere(badFilePath)}")
  val readMePath = "README.md"
  println(s"Is ${readMePath} there? ${MyUtil.isFileTHere(readMePath)}")

  val lines = MyUtil.getLinesFromFile(files.head.toString)
  val wordCountPerLine = MyUtil.getWordCountPerLine(lines)

  val wordCount = wordCountPerLine.sum
  println(s"Total words in ${files.head.toString} are $wordCount")
  val avgCount = wordCount*1.0 / lines.length
  val roundedCount = MyUtil.myRound(avgCount, 2)
  println(s"Average word count in each line is $avgCount")
  println(s"Average word count in each line is $roundedCount")
}
