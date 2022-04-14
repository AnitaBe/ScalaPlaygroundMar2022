package com.github.AnitaBe

object Day18ReadingWebPages extends App {
  //val url = "https://gutenberg.org/files/61262/61262-0.txt"
  val url = "https://gutenberg.org/files/48320/48320-0.txt"
//  val text = MyUtil.getTextFromWeb(url) //we make get request to the wed resource
// println(text.take(300))
 // val dst = "src/resources/ChristieA_Poirot_Investigates.txt"
 val dst = "src/resources/DoyleAC_Adventures_of_Sherlock_Holmes.txt"
 // MyUtil.saveText(dst, text)
  val text = MyUtil.getTextFromWebAndSave(url, dst)
  println(text.take(500))

}
