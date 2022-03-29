import scala.collection.mutable

// add class variables name, animalType, likes, sound- all strings and age which is Int
  class Animal( var animalName: String,
              val animalType:String = "wild",
              var animalLikes: scala.collection.mutable.Set[String],
              var sound: String = "",
              var animalAge: Int=0 ) {
  //  //add class method makeSound which prints sound
  val animalSound: String = animalType match {
    case "dog" => "woof"
    case "dolphin" => "click"
    case "goose" => "cackle"
    case "fox" => "yelp"
    case "kangaroo" => "chortle"
    case "cat" => "meow" }
  def makeSound(animalSound:String): Unit = {
    println(animalSound)
  }

  //  //BONUS
  //  // add class method meet which has a parameter of contact:String
  //this meet should decide whether to greet if they like the contact
  //to run away if they do not like the contact
    def meetOrNot (contact: String): Unit = {
    if (animalLikes(contact)) {
      println("Hello, let's be friends!")
    } else println("I gotta run!")
  }
    def addLikes (newLike:String, animalLikes:scala.collection.mutable.Set[String]):mutable.Set[String]= {
      animalLikes += newLike
      animalLikes
    }
  }
  }
  //
  //
  //
  //}

  object Day12ExerciseAnimals extends App{
    //create some animals objects from Animal class with appropriate properties, dog, cat, mouse etc :)


    //TODO call makeSound method
    //TODO call meet method
}
