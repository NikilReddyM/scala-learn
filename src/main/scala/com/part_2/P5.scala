package com.part_2

object P5 extends App {
  val bag1 = Set(99.5, 100.0, 50.0, 55.0, 70.0, 100.0, -1.0)
  val bag2 = Set(10.0, 20.0, 30.0, 40.0, 50.0)
  val bag1_bag2_combined = bag1.union(bag2)
  println(bag1_bag2_combined.min)
  println(bag1_bag2_combined.max)
}
