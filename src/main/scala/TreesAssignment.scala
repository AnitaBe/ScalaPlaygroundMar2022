import Day5WhileLoops.{counter, i}

import scala.io.StdIn.readLine

object TreesAssignment extends App {
  // ask person's name

  val humanName = readLine("What is your name?\n ").toUpperCase()

  // ask for tree height
  val maxHeight = 40
  val minHeight = 3
  val treeHeight = readLine("What is height of your tree?\n ").toInt

  // for (c <- 0 to treeHeight) println(" "*(treeHeight-c)+"*"+"**"*c)
  for (c <- 0 to treeHeight-1) {
    print(" " * (treeHeight - c))
    for (b <- 1 to 1 + 2 * c) {
      if (c==0) {print("*")
    } else {print(humanName.charAt((c-1)%humanName.length))}
  }
    println()
}

  //another version
  //for ((c,i)<- humanName.zipWithIndex) {
  //if (treeHeight < minHeight) {
  //println(s"Minimum height should be more than $minHeight")
  // }
 // else { if (i==0) { println(" " * (treeHeight - i) +"*")}
  //   else println(" " * (treeHeight - i) + s"${c}"+ (s"${c}"+s"${c}") * (i))
      //println(" " * (treeHeight - i) + s"${c}" * (i + 2))
   // }
  //}





  //TODOprint a xmas tree (or another tree) by calling printTree function with the correct parameters


  //tree height should be the one assigned
  //simple version for height 3 would be
  //  *
  // ***
  //*****

  //for full points I would like to see the following
  //if user enters name Valdis  and height 9
  //then we should print
  //        *
  //       VVV
  //      AAAAA
  //     LLLLLLL
  //    DDDDDDDDD
  //   IIIIIIIIIII
  //  SSSSSSSSSSSSS
  // VVVVVVVVVVVVVVV
  //AAAAAAAAAAAAAAAAA

  //let's consider maximum height 40 (so person's name letters could repeat many times)

  def printTree(name:String, height:Int, symbol:Char='*', maximumHeight:Int=40):Unit = {
    //for this exercise we are not going to adjust maximumHeight
    // print the tree HINT: check the last entry in Day7Strings

  }
}
