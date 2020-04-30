package com.part_1

object P13 extends App {
  val data = List(
    ("T-Shirt", "Medium", 10.99),
    ("Polo-Shirt", "Large", 4.99),
    ("Vest", "Small", 5.99),
    ("T-Shirt", "Small", 4.99),
    ("T-Shirt", "Small", 4.99)
  )

  data.foreach {
    case item if item._1 == "T-Shirt" =>
      println(s"${item._1.toUpperCase()} is priced at $$${item._3} for the ${item._2} size.")
    case item =>
      println(s"${item._1.toLowerCase()} is priced at $$${item._3} for the ${item._2} size.")
  }
}
