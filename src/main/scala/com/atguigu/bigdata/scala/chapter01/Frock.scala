package com.atguigu.bigdata.scala.chapter01

/**
  * Create by fz on 2020/2/1
  */

object TestFrock{
  def main(args: Array[String]): Unit = {
    val frock1 = new Frock
    println(frock1.getSerialNumber)

    val frock2 = new Frock
    println(frock2.getSerialNumber)

    val frock3 = new Frock
    println(frock3.getSerialNumber)
  }
}

object Frock {
  private var currentNum : Int = 100000

  def getNextNum:Int={
    currentNum += 100
    currentNum
  }

}

class Frock{
  var num = Frock.getNextNum
  private var serialNumber:Int=num
  def getSerialNumber:Int={
    serialNumber
  }
}
