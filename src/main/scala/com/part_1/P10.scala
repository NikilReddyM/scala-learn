package com.part_1

object P10 extends App {
  val basket_one = Set("Cake",
    "Milk",
    "Cheese",
    "Toilet Paper")

  val basket_two = Set("Bread",
  "Water",
  "Juice",
  "Milk",
  "Cheese")

  val common_items = basket_one.intersect(basket_two)
  println(s"common items in basket are: ${common_items.mkString(",")}")
}
