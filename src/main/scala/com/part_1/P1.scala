package com.part_1

object P1 extends App {//can do extends App or write main method function
  val data:String = "hi this is nikil"
  def reverse_string(data: String):String = data.reverse//defining a reverse function
  def upper_string(data: String):String = data.toUpperCase//defining a function
  val reversed_data:String = reverse_string(data)//calling a function
  val uppercase_data:String = upper_string(reversed_data)//calling a function
  println(s"data is -- $data and"+"\n"+"-"*50)//interpolated string
  println(s"reversed data is -- $reversed_data and"+"\n"+"-"*50)//interpolated string
  println(s"uppercase reversed data is -- $uppercase_data")//interpolated string
}
