package com.github.AnitaBe

case class BookUnit(id:String, author:String, title:String, genre:String, price:Double, date: String, description: String)
//TODO finish the case class with the right fields from books.xml book elemen
def getPriceTitleAuthor():String = s"$$$price -  $title by $author"

  def getXML():Node= {
  <book id={id}>
  <author>{author}</author>
  <title>{title}</title>
  <genre>{genre}</genre>
  <price>{price}</price>
  <publish_date>{publish_date}</publish_date>
  <shortDescription>{description.take(20)}</shortDescription>
  </book>
  }