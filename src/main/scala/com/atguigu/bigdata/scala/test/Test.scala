package com.atguigu.bigdata.scala.test

/**
  * Create by fz on 2020/2/4
  */
object Test {
  def main(args: Array[String]): Unit = {
    val apple1 = new Apple("red")
    println("apple1: "+apple1.color)
    val apple2 = apple1
    println("apple2: "+apple2.color)
    println("*********")

    apple2.color="black"
    println("apple1: "+apple1.color)
    println("apple2: "+apple2.color)
  }
}

class Apple(col:String) {
  var color: String = col
}
