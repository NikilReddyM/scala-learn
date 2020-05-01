package com.part_2

object P7 extends App {
  val numberSeq = Seq(2, 8, 19, 20, 25, 50, 100, 10)
  val divByTwoF: (Int) => Boolean = (i) => i % 2 == 0
  println(
    """
      |Starting from left to right, removing items that are factors of two, and will
      |stop execution on the first element that is not divisible by two:
 """.stripMargin)
  numberSeq
    .dropWhile(divByTwoF)
    .foreach(println)
}
