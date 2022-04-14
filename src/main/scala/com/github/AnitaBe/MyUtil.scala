package com.github.AnitaBe

import java.io.FileWriter
import scala.annotation.meta.param
import scala.io.Source

object MyUtil {
  //round function
  def myRound(n: Double, precision: Int = 0): Double = {
    //trick is to multiply by some power of 10 then divide by that multiplier
    //so (n*100).round/100 would give us 2 points of precision
    0.0 //
    val multiplier = Math.pow(10, precision)
    (n * multiplier).round / multiplier //we utilize built in round
    //n.round
  }
  /**
   * Utility function to find delta from starting and stop time
   *
   * @param t0 - starting time
   * @param t1 - stop time
   * @return delta in milliseconds
   */
  def deltaMs(t0: Long, t1: Long, precision: Int = 3): Double = {
    myRound((t1 - t0) / 1_000_000.0, precision) //by default it will be 3
  }
  def getLinesFromFile (src: String): Array[String] = {
    val bufferedSource = Source.fromFile(src)
    val lines = bufferedSource.getLines().toArray
    bufferedSource.close()
    lines
  }
  def getTextFromFile(src:String):String = {
    val bufferedSource = Source.fromFile(src)
    val text = bufferedSource.mkString
    bufferedSource.close()
    text
  }
  /**
   *
   * @param dstPath - save Path
   * @param lines - array of Strings to save
   *              overwrites old file by default
   */
  def saveLines(dstPath: String, lines: Array[String], append:Boolean=false, lineEnd:String="\n"):Unit = {
    saveText(dstPath, lines.mkString(lineEnd), append)
  }

  /**
   *
   * @param url - web resource locator
   * @return - we return the whole web page as string
   */
  def getTextFromWeb(url: String):String = {
    val html = Source.fromURL(url) //this gets us BufferedSource stream
    html.mkString
  }
  /**
   *
   * @param dstPath - save Path
   * @param text - string to save
   */
  def saveText(dstPath: String, text: String, append:Boolean=false, verbose:Boolean=false):Unit = {
    //    import java.io.{PrintWriter, File} //explicit import
    if (verbose) println(s"Saving ${text.length} characters to $dstPath")
    //so writing to file can be done either by overwriting the whole file (the default)
    //or by appending to the end of the file
    val fw = new FileWriter(dstPath, append) //so by default old dstPath will be overWritten
    //    val pw = new PrintWriter(new File(dstPath))
    if (append) fw.write("\n") //TODO think about appending custom header
    fw.write(text)
    fw.close() //when writing it is especially important to close as early as possible
  }


  def getTextFromWebAndSave(url:String, dst: String):String = {
    val text = getTextFromWeb(url)
    saveText(dst, text)
    text
  }

}



