package com.github.AnitaBe

object Day21ReadingJSONwithUPickle extends App {
  val src = "src/resources/json/fruitFacts.json"

  val rawText = MyUtil.getTextFromFile(src)
  println(rawText.take(100))

  //let's use uPickle library to parse the raw Text into some structure
  val data = ujson.read(rawText)
  println(data)
  //in order for arr method to work I need to know that my top level of data is actually an array (not an object or just a string or number)
  val arrData = data.arr.toArray
  println(arrData.head)
  println(arrData.last)

  //with o I indicate that it is an object
  val fruits = for (o <- arrData) yield {
    Fruit(o("genus").str,
      o("name").str,
      o("id").num.toInt,
      o("family").str,
      o("order").str,
      o("nutritions")("carbohydrates").num, //so Double by default
      o("nutritions")("protein").num,
      o("nutritions")("fat").num,
      o("nutritions")("calories").num,
      o("nutritions")("sugar").num

      //add the rest of the fields proteins etc
    )
  }

  fruits.take(3).foreach(println)

  //find most calorie dense fruit - it looks the data is per 100grams maybe someone can verify this?
  val mostCalFruit = fruits.sortBy(_.calories)
  println(s"Fruit with most calories: ${mostCalFruit.reverse.head}")
  //find top 5 fattiest fruits
  val fattiestFruits = fruits.sortBy(_.fat)
  println("Top 5 fruits with most fat:")
  fattiestFruits.reverse.take(5).foreach(println)
  //find top 5 protein sources for fruits
  val proteinFruits = fruits.sortBy(_.protein)
  println("Top 5 fruits with most protein:")
  proteinFruits.reverse.take(5).foreach(println)
  //find 5 least sugary fruits
  val sugaryFruits = fruits.sortBy(_.sugar)
  println("Top 5 fruits with least sugar:")
  sugaryFruits.take(5).foreach(println)
  //find 5 fruits with most carbohydrates that are not sugars (so difference between carbohydrates and sugar)
  val nonSugarCarbohydrates = fruits.sortBy(_.nonSugars)
  println("Top 5 fruits with most carbohydrates that are not sugars:")
  nonSugarCarbohydrates.reverse.take(5).foreach(_.prettyPrint)
  //you can add some extra conclusions, statistics as well

  val JSONstring = "[" + fruits.map(_.getJSON()).mkString(",\n") + "]"
  val dst = "src/resources/json/fruits.json"
  MyUtil.saveText(dst, JSONstring)

  }
