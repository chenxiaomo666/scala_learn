package chapter05

object test07 {
  def main(args: Array[String]): Unit = {
    // 对数组进行处理，将操作抽象出来，处理完毕之后的结果返回新的结果
    val arr = Array(1, 2, 3, 4)
    def arrayOperation(array: Array[Int], op: Int=>Int): Array[Int] = {
      for(elem <- array) yield op(elem)     // yield返回数组
    }

    def op(a: Int): Int = {
      a+1
    }
    val result: Array[Int] = arrayOperation(arr, op)
    println(result.mkString(", "))

    val result2 = arrayOperation(arr, (a:Int)=>a*2)
    println(result2.mkString(", "))

  }

}
