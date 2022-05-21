package chapter05

object test12 {
  // 控制抽象， 引用传递？值传递？

  def main(args: Array[String]): Unit = {

    // 1、传值参数
    def f1(a: Int): Int ={
      println(s"a: $a")
      12
    }
    f1(10086)


  // 2、名传递->引用传递？
  // 传递的不是具体的值，是一个代码块，代码块有返回值
  def f2(a: =>Int): Unit ={   // 表示a是一个返回值为Int的代码块，类似于匿名函数
    println(s"a: $a")
    println(s"a: $a")
  }
  f2(23)
    f2(f1(56))

  }
}
