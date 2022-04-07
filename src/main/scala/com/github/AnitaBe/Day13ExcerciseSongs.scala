package com.github.AnitaBe

class Song(title: String = "", author: String= "", lyrics:Seq[String]) {

  println(s"New song $title made by $author")
  println(s"The song has ${lyrics.length} lines")


  //  def sing():Unit={
  //    println(s"$title, Author: $author")
  //    for (line <- lyrics) println(line)
  //
  //  }

  def sing(maxLines: Int = -1): Unit = {
    println("-" * 20)
    if (author != "") print(s"$author")
    if (title != "") print(s" - $title\n")
    println("-" * 20)

    if ((maxLines == -1) || (maxLines > lyrics.length)) {
      for (line <- lyrics) {
        println(line)
      }
    } else {
      for (line <- lyrics.take(maxLines)) {
        println(line)
      }
    }
  }

  def yell(maxLines: Int = -1): Unit = {
    println("-" * 20)
    if (author != "") print(s"$author")
    if (title != "") print(s" - $title\n")
    println("-" * 20)

    if ((maxLines == -1) || (maxLines > lyrics.length)) {
      for (line <- lyrics) {
        println(line)
      }
    } else {
      for (line <- lyrics.take(maxLines)) {
        println(line.toUpperCase)
      }
    }
  }

  object Day13SongExerciseSolved extends App {
    println("Let's make and sing some Songs!")
    val lambada = new Song("Lambada",
      "Kaoma",
      Seq("Chorando se foi quem um dia só me fez chorar",
        "Chorando se foi quem um dia só me fez chorar",
        "Chorando estara ao lembrar de um amor",
        "Que um dia não soube cuidar",
        "Chorando estará ao lembrar de um amor",
        "Que um dia não soube cuidar",
        "A recordação vai estar com ele aonde for",
        "A recordação vai estar pra sempre aonde for"))

    val jingleBells = new Song("Jingle Bells",
      "James Pierpont",
      Array("Jingle bells, jingle bells",
        "Jingle all the way",
        "Oh what fun it is to ride",
        "In a one-horse open sleigh, hey!"))

    val journey = new Song("Don't Stop Believin'", "Journey",
      Seq("Just a small town girl",
        "Livin' in a lonely world",
        "She took the midnight train goin' anywhere",
        "Just a city boy",
        "Born and raised in south Detroit",
        "He took the midnight train goin' anywhere", "..."))


    jingleBells.sing(3)

    lambada.sing(2)

    journey.yell(3)
  }
}
//inside constructor method:
//
// print on the screen "New com.github.AnitaBe.Song made" - (try also printing here author and title!)
//
//Minimum:
//
//Write a method sing that prints the song line by line on the screen, first printing the author and title, if any.
//
//Write a method yell that prints the song in capital letters line by line on the screen, first printing the author and title, if any.
//you can write private helper methods if you think code is too similar..

//Bonus: create an additional parameter maxLines that prints only a certain number of lines for both sing and yell. Better do with some default value e.g. -1, at which all rows are then printed.
//
//Create multiple songs with lyrics
//
//Example:
//
//
//ziemelmeita = com.github.AnitaBe.Song("Ziemeļmeita", "Jumprava", Array("Gāju meklēt ziemeļmeitu","Garu, tālu ceļu veicu"))
//
//ziemelmeita.sing(1)
//
// Outputs:
//
//Ziemeļmeita - Jumprava
//
//Gāju meklēt ziemeļmeitu //just one line since I specified sing(1)
//ziemelmeita.sing() //would print all lyrics

//
//
//2. Rap class
//For those feeling comfortable with class syntax, create a Rap class that inherits from com.github.AnitaBe.Song
//
// add a new method breakIt with two default parameters max_lines=-1 and drop equal to "yeah",
// this breakIt which is similar to sing, but adds a drop after each word .
//
//Example:
//
//
//
//zrap = Rap("Ziemeļmeita", "Jumprava", Array("Gāju meklēt ziemeļmeitu"," Garu, tālu ceļu veicu"))
//
//
//
//zrap.breakIt(1, "yah")
//
//Ziemeļmeita - Jumprava
//
//Gāju YAH meklēt YAH ziemeļmeitu YAH

