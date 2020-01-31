package com.atguigu.bigdata.scala.chapter01

object Hello {
  def main(args: Array[String]): Unit = {
    //    println("Hello World")

    //    val Int = 12.5
    //    print(Int)

    //    for(i <- Range(1,6,4)) {
    //      println(s"i=${i}")
    //    }

    //    for(i <- 1 to 3;j <- 1 to 3) {
    //      println(s"i=${i}===j=${j}")
    //    }

    //    var s : Short  = 5
    //    s = s-2
    //    var b : Byte  = 3
    //    b = b + 4
    //    b = (b + 4).toByte
    //    var c : Char  = 'a'
    //    var  i : Int = 5
    //    var d : Float = .314F
    //    var result : Double = c+i+d
    //    var b : Byte  = 5
    //    var s : Short  = 3
    //    var t : Short = s + b
    //    var t2 = s + b


    //    def test = "Hello"
    //    test

    //    def f1 = "Hello"
    ////    print(f1)
    //
    //    def f2():String={
    //      "Hello"
    //    }
    //    print(f2)


    //    def f1 = "venassa"
    //    println(f1) //

    //    def test1(x:Double)={
    //        (y: Double) => x*x*y
    //    }
    //
    //    val value = test1(2.0)(3.0)
    //    print(value)

    //    def f():Unit={
    //      println("function")
    //    }
    //
    //    def f0()={
    //      f _
    //    }
    //
    //    f0()


    //    def f1(i : Int)={
    //      def f2(j : Int):Int={
    //        i * j
    //      }
    //
    //    }

    //    println(f1(2))


    //    implicit val name : String = "gutianle"
    //    implicit val age : Int = 22
    //
    //    def test(implicit name : String = "zhangjiahui")={
    //      println(s"Hello ${name}")
    //    }
    //
    //    test

//    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)
//
//    println(map.get("e").)


//    val list: List[Int] = List(1, 2, 54, 6)
//    def a(x:Int):Int={
//      val aa = 1/x
//      aa
//    }
//    val ints = list.sortBy()
//    println(ints.mkString(","))

//    val ints = list.sortWith((a,b)=>a>b)
//    println(ints.mkString(","))

    val a = new V();
    val v = new V();

    println(a.name)
    println(v.name)


  }
}

class A {
  val name:Int = 10
}

class V extends A{
  override val name:Int = 20
}
