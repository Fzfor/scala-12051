package com.atguigu.bigdata.scala.chapter01

/**
  * Create by fz on 2020/2/2
  */
object TestSingle {
  def main(args: Array[String]): Unit = {
    val a1 = AAAA.getInstance
    val a2 = AAAA.getInstance

    println(a1.hashCode())
    println(a2.hashCode())
  }
}

class AAAA private(){
  println("....")//
}

object AAAA{
  private val aaa = new AAAA()
  def getInstance={
    aaa
  }
}
