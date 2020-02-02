package com.atguigu.bigdata.scala.chapter01

/**
  * Create by fz on 2020/2/2
  */
object TestChild {
  def main(args: Array[String]): Unit = {

    var child1:Child = new Child("Louis")
    var child2:Child = new Child("Kobe")
    var child3:Child = new Child("James")

    Child.joinGame(child1)
    Child.joinGame(child2)
    Child.joinGame(child3)

    println("***")

    Child.showTotalChildren

  }

}

class Child(name1 : String){
  var name : String = name1
}

object Child{
  //静态变量
  var total : Int = 0

  def joinGame(child: Child):Unit={
    println(s"${child.name}参加游戏了")
    total += 1
  }

  def showTotalChildren: Unit ={
    println(s"共有${Child.total}名小朋友参加游戏了")
  }

}