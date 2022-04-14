package com.github.AnitaBe

object Day18ReadingWebPages extends App {
  val url = "https://gutenberg.org/files/61262/61262-0.txt"
  val text = MyUtil.getTextFromWeb(url) //we make get request to the wed resource
println(text.take(300))
  val dst = "src/resources/ChristieA_Poirot_Investigates.txt"
  MyUtil.saveText(dst, text)

}
