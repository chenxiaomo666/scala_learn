package chapter05

object test05 {
  def main(args: Array[String]): Unit = {
    // 高阶函数
    def f(n:Int): Int = {
      println("f called")
      n+1
    }
    val result = f(123)
    println(result)

    println("################")

    // 1、函数作为值进行传递
    val f1: Int=>Int = f
    val f2 = f _               // 两种方法等同
    println(f1)
    println(f1(111))
    println(f)
    println(f(222))

    println("##################################################")

    // 2、函数作为参数传递
    // 订购一二元计算函数
    def dualEval(op: (Int, Int)=>Int, a: Int, b: Int): Int = {
      op(a, b)
    }

    def add(a:Int, b:Int): Int = {
      a+b
    }

    println(dualEval(add, 4, 5))

    println(dualEval((a:Int, b:Int)=>a+b, 4, 5))  // 匿名函数

    println("###################################################")


    // 3、函数作为返回值
    def f5(): Int=>Unit ={
      def f6(a: Int): Unit ={
        print(s"f6 called ${a}")
      }
      f6  // 将函数直接返回
    }

    f5()(6)



  }
}
