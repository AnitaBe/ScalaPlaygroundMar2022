package com.github.AnitaBe

import com.github.AnitaBe.Day20ReadingCSVFromFile.{arrayToVeggie, lines, splitLines, src, veggies}

object Day20CSVExercise extends App {

  val src = "src/resources/csv/fruitvegprices-19apr22.csv"
  val lines = MyUtil.getLinesFromFile(src)
  val splitLines = for (line <- lines) yield line.split(",") //same as above

  //  splitLines.take(5).foreach(println) //this will not look good
  splitLines.take(5).foreach(lineItems => println(lineItems.mkString(";"))) //so now we have a semiColon instead
  def arrayToVeggie(arr:Array[String]):Veggie = {
    //in real life scenarios we would want a library to handle bad cases
    //we would want to check if we have some bad data
    //    Veggie("","","","",0.0,"") //FIXME
    Veggie(arr(0), arr(1), arr(2), arr(3),arr(4).toDouble, arr(5))
  }
  val veggies = splitLines.tail.map(arrayToVeggie) //so same as above two lines
  veggies.take(5).foreach(println)
  //get the top 5 most expensive apple entries
  val apples = veggies.filter(_.item=="apples")
  apples.take(10).foreach(println)
  val sortedApples = apples.sortBy(_.price)
  println("5 most expensive apples:")
  sortedApples.reverse.take(5).foreach(println)
  //get the least expensive 5 apple entries
  println(("5 least expensive apples:"))
  sortedApples.take(5).foreach(println)
  //get average price for lettuce
  val lettuce = veggies.filter(_.item=="lettuce")
  val lettuceAvgPrice = MyUtil.myRound(lettuce.map(_.price).sum/lettuce.map(_.price).length,2)
  println(s"Average price of lettuce is $lettuceAvgPrice")
  //get cherry tomatoes pricing min, max, mean for year 2022
  val cherryTomatoes2021 = veggies.filter(_.variety =="cherry").filter(_.date.contains("2021"))
  val cherryTomatoes2021prices = cherryTomatoes2021.map(_.price)
  println(s"Max price for Cherry Tomatoes in 2021 is ${cherryTomatoes2021.map(_.price).max}")
  println(s"Min price for Cherry Tomatoes in 2021 is ${cherryTomatoes2021.map(_.price).min}")
  val cherryTomatoes2021mean = MyUtil.myRound(cherryTomatoes2021.map(_.price).sum/cherryTomatoes2021.map(_.price).length,2)
  println(s"Mean of prices for Cherry Tomatoes in 2021 is $cherryTomatoes2021mean")

  //TODO extra credit challenge get average price for lettuce by year

  //two approaches - one is simply hardcode starting and ending years and filter by those
  //you might not even need to extract year simply lexicographical filering should work

  //even better approach use groupBy
  // hint: use groupBy but first you would need to modify case class with Year field(value)
  //alternative to creating a Year entry would be to split date field while grouping and group by first portion
  // https://alvinalexander.com/scala/how-to-split-sequences-subsets-groupby-partition-scala-cookbook/
}
