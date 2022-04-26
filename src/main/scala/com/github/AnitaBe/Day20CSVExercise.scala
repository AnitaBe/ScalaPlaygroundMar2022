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

  //extra credit challenge get average price for lettuce by year
  //two approaches - one is simply hardcode starting and ending years and filter by those
  //you might not even need to extract year simply lexicographical filering should work
  val lettuce2017price = lettuce.filter(_.date.contains("2017")).map(_.price)
  val lettuce2018price = lettuce.filter(_.date.contains("2018")).map(_.price)
  val lettuce2019price = lettuce.filter(_.date.contains("2019")).map(_.price)
  val lettuce2020price = lettuce.filter(_.date.contains("2020")).map(_.price)
  val lettuce2021price = lettuce.filter(_.date.contains("2021")).map(_.price)
  val lettuce2022price = lettuce.filter(_.date.contains("2022")).map(_.price)
  val averagelettuce2017 = MyUtil.myRound(lettuce2017price.sum/lettuce2017price.length,2)
  val averagelettuce2018 = MyUtil.myRound(lettuce2018price.sum/lettuce2018price.length,2)
  val averagelettuce2019 = MyUtil.myRound(lettuce2019price.sum/lettuce2019price.length,2)
  val averagelettuce2020 = MyUtil.myRound(lettuce2020price.sum/lettuce2020price.length,2)
  val averagelettuce2021 = MyUtil.myRound(lettuce2021price.sum/lettuce2021price.length,2)
  println(s"Average lettuce price in 2017 $averagelettuce2017")
  println(s"Average lettuce price in 2018 $averagelettuce2018")
  println(s"Average lettuce price in 2019 $averagelettuce2019")
  println(s"Average lettuce price in 2020 $averagelettuce2018")
  println(s"Average lettuce price in 2021 $averagelettuce2021")

  //even better approach use groupBy
  // hint: use groupBy but first you would need to modify case class with Year field(value)
  //alternative to creating a Year entry would be to split date field while grouping and group by first portion
  // https://alvinalexander.com/scala/how-to-split-sequences-subsets-groupby-partition-scala-cookbook/

  def getAverage(veggies: Array[Veggie], item: String="", year: Int=0, precision:Int=2):Double = {
    //    val filteredItems = veggies.filter(_.variety == item).filter(_.date.contains(year.toString)) //before we had year value
    val filteredItems = if (item != "" && year != 0) veggies.filter(_.item == item).filter(_.year == year) else veggies
    MyUtil.myRound(filteredItems.map(_.price).sum/filteredItems.length,precision)
  }

  val minDate = veggies.map(_.date).min
  val maxDate = veggies.map(_.date).max
  println(s"Data coverage starts at $minDate ends $maxDate")

  val minYear = veggies.map(_.year).min
  val maxYear = veggies.map(_.year).max
  println(s"Data coverage starts at $minYear ends $maxYear")

  val lettuceAverages = (for (year <- minYear to maxYear) yield {
    val avg = getAverage(veggies, "lettuce", year)
    println(s"Average for year: $year is $avg") //a side effect while we are making an array, generally we avoid sideeffects
    avg
  }
    ).toArray

  println(getAverage(veggies, "cucumbers", 2021))
  println(getAverage(veggies, "lettuce", 2021))

  val lettuceGroupedByYear = veggies.filter(_.item == "lettuce").groupBy(_.year)
  for ((key,value) <- lettuceGroupedByYear) {
    println(s"For year $key the lettuce average is ${getAverage(value)}")
  }

  }

