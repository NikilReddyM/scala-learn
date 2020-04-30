package com.part_1

object P11 extends App {
  val basket = Seq("Milk", "Cheese", "Donuts", "Apples", "Bananas")
  val fruitsfilter:(String)=>Boolean = (s) => (s=="Apples" || s=="Bananas")//remember this
  val basket_fruitfiltered = basket.filterNot(fruitsfilter)

  println(basket_fruitfiltered.mkString("<items values= \"", "|", "\"></items>"))


}
