package com.atguigu.bigdata.scala.test

/**
  * Create by fz on 2020/2/4
  */

object Scala08_Trait8 {
  def main(args: Array[String]): Unit = {
    println("ok~~")
  }
}
//Exception 就是 java.lang.Exception
trait LoggedException extends Exception{
  def log(): Unit ={
    println(getMessage()) // 方法来自于Exception类
  }
}


