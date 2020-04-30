package com.part_1

object P12 extends App {
  val codes = Seq("A", "BB", "CCC", "DDDD", "EEEEE")
  val codes_mapper_to_new: String=>String = s=>s"${s} - ${s.length}"
  val new_codes = codes.map(codes_mapper_to_new)
  new_codes.foreach(println)
}
