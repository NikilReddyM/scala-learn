package com.part_1

object P14 extends App {
  val list1 = List("pencil", "pen", "sharpener")
  val list2 = List("math book", "french book", "english book")
  val newlist = list1++list2//adding two lists
  val mapper:String=>List[String] = s =>List(s)//mapper function
  val mapper1:String=>String= s=>s+" is required in the classroom."//mapper function
  val new_listoflist = newlist.map(mapper)
  new_listoflist.flatten.map(mapper1).foreach(println)
}
