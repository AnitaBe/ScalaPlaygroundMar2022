import scala.io.StdIn.readLine

object TreesAssignment extends App {
  //TODO ask person's name

  val humanName=readLine("What is your name? ")

  //TODO ask for tree height
  val maxHeight = 40
  val minHeight = 3
  val treeHeight = readLine("What is height of your tree? ").toInt
  for ((c, i)<- humanName.zipWithIndex) {
    if (treeHeight < minHeight) {
      println(s"Minimum height should be more than $minHeight")
    }
    else {
      println(" " * (humanName.length - i) + s"${c}" * (i + 2))
    }
  }





  //TODO print a xmas tree (or another tree) by calling printTree function with the correct parameters


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
    //TODO print the tree HINT: check the last entry in Day7Strings
  }
}