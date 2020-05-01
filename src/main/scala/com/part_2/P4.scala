package com.part_2

object P4 extends App {
  val bag1 = Set(1, 3, 5, 10, 20)
  val bag2 = Set( 20, 17, 18, 99, 0)

  val output_1 = bag1.diff(bag2).mkString(", ")
  val output_2 = bag2.diff(bag1).mkString(", ")

  println(s"items in bag1 but not in bag2 are $output_1")
  println(s"items in bag2 but not in bag1 are $output_2")

}
