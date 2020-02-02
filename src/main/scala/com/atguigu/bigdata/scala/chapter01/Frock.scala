package com.atguigu.bigdata.scala.chapter01

/**
  * Create by fz on 2020/2/1
  */



object Frock {
  private var currentNum : Int = 10000

  def getNextNum():Int ={
    currentNum = currentNum + 100
    currentNum
  }

}
