package com.part_1

object P8 extends App {
  val data = "Vanilla Donut 10 2.25"
  val data_parts = data.split(" ")
  val donut_name = data_parts(0)+" "+data_parts(1)
  val donut_purchased:Int = data_parts(2).toInt//converting string to int
  val donut_price:Double = data_parts(3).toDouble//converting string to double

  val output =
    s"""
      |Donut Name: $donut_name
      |Donut Price: $$$donut_price
      |Donut Purchased: $donut_purchased
      |""".stripMargin//using 3$'s -- 2$'s for printing one dollar and 1$ for getting donut-price

  println(output)
}
