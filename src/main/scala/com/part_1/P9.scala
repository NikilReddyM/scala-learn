package com.part_1
import scala.collection.immutable.TreeMap
object P9 extends Ordering[String]{

  override def compare(x: String, y: String): Int = y.compareTo(x)//using this function to change the comparator from ascending to descending

  def main(args: Array[String]): Unit = {
    val nametoage_map = TreeMap(
      "Bill"->9,
      "Jonny"->8,
      "Tommy"->11,
      "Cindy"->13
    )(P9)//making use of descending comparator
    println(nametoage_map.mkString(","))
  }
}
