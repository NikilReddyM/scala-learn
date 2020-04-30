package com.part_1
import scala.io.StdIn._
object P3 extends App {
  println(Console.BOLD)
  println("enter name")
  println(Console.UNDERLINED)
  val name:String = readLine()
  println(Console.BOLD)
  println("enter age")
  val age:Int = readInt()
  println(Console.RESET)
  println("name is "+name+", age is "+age)
}
