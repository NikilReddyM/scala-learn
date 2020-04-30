package com.part_1

object P2 extends App {

  val json_data =
    """
      |{
      |"donut_name":"Vanilla Donut",
      |"quantity_purchased":"10",
      |"price":2.5
      |}""".stripMargin //multi-line strings, strip margin is used to remove white spaces before and after each line
  println(json_data)
}
