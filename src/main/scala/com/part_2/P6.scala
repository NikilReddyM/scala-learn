package com.part_2

object P6 extends App {
  val findMagicNumberF: (Int) => Boolean = (i) => i == 77
  val numberSeq = Seq(10, 77, 90, 50, 100, 110)
  val boolMagicNumberExists = numberSeq.exists(findMagicNumberF)
  println(s"Does magic number 77 exist within the numerical value of ${numberSeq.mkString(",")}? ${boolMagicNumberExists.toString.toUpperCase()}")
}
