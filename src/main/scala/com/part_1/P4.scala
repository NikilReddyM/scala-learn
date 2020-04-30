package com.part_1

object P4 extends App {
  val data:String = "http://allaboutscala.com"
  val charindex:Int = 7
  val charatindex:Char = data.charAt(charindex)
  println(s"${charindex+1}th character in data is: $charatindex")
}
