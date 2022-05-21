package chapter05

import scala.annotation.tailrec

object test11 {
  def main(args: Array[String]): Unit = {

    // 尾递归，n结成
    def tailFact(n :Int): Int = {
      @tailrec  // 确保是尾递归，不然会报错
        def loop(n: Int, currRes: Int): Int = {
          if(n==0) return currRes
          loop(n-1, currRes*n)
        }

      loop(n, 1)
    }

    println(tailFact(5))
  }

}
