package com.part_2

object P3 extends App {
  val vecNumbers = Vector(0, 10, 20, 47, -2, 99, -98)//we use vector datastructure, when we have so many random access on list items
  println(s"The smallest item in the Vector = ${vecNumbers.min}")
  println(s"The largest item in the Vector = ${vecNumbers.max}")
}
