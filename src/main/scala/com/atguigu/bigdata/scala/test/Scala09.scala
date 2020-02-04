package com.atguigu.bigdata.scala.test

/**
  * Create by fz on 2020/2/5
  */


object Scala09 {
  def main(args: Array[String]): Unit = {
    val outer1 : ScalaOuterClass = new ScalaOuterClass();
    val outer2 : ScalaOuterClass = new ScalaOuterClass();
    // Scala创建内部类的方式和Java不一样，将new关键字放置在前，使用  对象.内部类  的方式创建
    val inner1 = new outer1.ScalaInnerClass()
    val inner2 = new outer2.ScalaInnerClass()
    //创建静态内部类对象
    val staticInner = new ScalaOuterClass.ScalaStaticInnerClass()
    println(staticInner)
    //调用成员内部类的方法
    inner1.info()
  }
}

class ScalaOuterClass {
  myOuter =>  //这样写，你可以理解成这样写，myOuter就是代表外部类的一个对象.
  class ScalaInnerClass { //成员内部类
    def info() = {
      println("name = " + ScalaOuterClass.this.name
        + " age =" + ScalaOuterClass.this.sal)
      println("-----------------------------------")
      println("name = " + myOuter.name
        + " age =" + myOuter.sal)
    }
  }
  // 当给外部指定别名时，需要将外部类的属性放到别名后.
  var name : String = "scott"
  private var sal : Double = 1.2
}

object ScalaOuterClass {  //伴生对象
class ScalaStaticInnerClass { //静态内部类
}
}
