package com.part_2

object P8 extends App {
  val data = Seq(
    "James", 7,
    "Andy", 8,
    "Tommy", 10,
    "Bob", 13,
    "Sam", 10
  )
  val sum_ages = data.collect{
    case age:Int=>age
  }
    .sum

  println(s"sum of ages is: $sum_ages")
}
