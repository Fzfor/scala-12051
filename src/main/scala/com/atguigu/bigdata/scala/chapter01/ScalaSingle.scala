package com.atguigu.bigdata.scala.chapter01

/**
  * Create by fz on 2020/2/4
  */
object ScalaSingle {
  def main(args: Array[String]): Unit = {
    println("***")
    var person1 = Person("james")
    println("***")
    var person2 = new Person("Kurry")
    println("***")
    var person3 = Person.apply("Tomas")
  }
}

class Person(pName:String) {
  var name = pName
}
object Person {
  //增加apply方法，构建伴生类实例  语法：伴生对象（）
  def apply(name:String): Person = {
    println("apply")
    new Person(name)
  }
}
