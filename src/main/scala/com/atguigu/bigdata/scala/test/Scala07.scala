package com.atguigu.bigdata.scala.test

/**
  * Create by fz on 2020/2/4
  */
object Scala07 {

}

//案例:

object Scala07_Trait7 {
  def main(args: Array[String]): Unit = {
    val ff1 = new FF()
    println(ff1) //输出的内容如下：
    //    E...
    //    A...
    //    B....
    //    C....
    //    D....
    //    F....
    println("--------------------------")
    val ff2 = new KK() with CC with DD
    println(ff2) //输出的内容如下：
    //    E...
    //    K....
    //    A...
    //    B....
    //    C....
    //    D....
  }
}
trait AA {
  println("A...")
}
trait BB extends  AA {
  println("B....")
}
trait CC extends  BB {
  println("C....")
}
trait DD extends  BB {
  println("D....")
}
class EE {
  println("E...")
}
class FF extends EE with CC with DD {
  println("F....")
}
class KK extends EE {
  println("K....")
}