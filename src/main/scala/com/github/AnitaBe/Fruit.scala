package com.github.AnitaBe

case class Fruit(genus: String,
                 name: String,
                 id: Int,
                 family: String,
                 order: String,
                 //i am flattening the nutritions
                 carbohydrates: Double = 0.0,
                   protein: Double = 0.0,
                 fat: Double = 0.0,
                calories: Double = 0.0,
                 sugar: Double = 0.0
                 //add the rest of fields from nutriotions
                ) {
  val nonSugars: Double = carbohydrates - sugar

  def prettyPrint(): Unit = {
    println(s"Fruit genu: $genus, name: $name, family: $family, order: $order\n" +
      s"carbohydrates: $carbohydrates, protein: $protein, fat: $fat, calories: $calories, sugar: $sugar")
  }

  def getJSON(): String = {
    s"""
       |{
       | "genus": "$genus",
       | "name": "$name",
       | "family": "$family",
       | "order": "$order",
       | "carbohydrates": "$carbohydrates",
       | "protein": "$protein",
       | "fat": "$fat",
       | "calories": "$calories",
       | "sugar": "$sugar""
       | }
       | """.stripMargin
  }
}
