package chapter05

class test06 {
  def main(args: Array[String]): Unit = {
    // 高阶函数
    def f(n:Int): Int = {
      println("f调用")
      n+1
    }
    val result = f(123)
    println(result)
  }

}
