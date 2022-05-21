package chapter05

import java.util.concurrent.locks.Condition

object test13 {
  def main(args: Array[String]): Unit = {
    // 实现循环
    var n = 10
    // 常规的
    while (n>0){
      print(n+" ")
      n -= 1
    }
    println()

    // 2、闭包实现一个函数，将代码块作为参数传入，递归调用
    def myWhile(condition: =>Boolean): (=>Unit)=>Unit = {
      // 内层函数需要递归调用，参数是循环体
      def doLoop(op: =>Unit): Unit ={  // 传名参数
        if(condition){
          op
          myWhile(condition)(op)
        }

      }
      doLoop _
    }

    n = 10
    println(myWhile(n>=1))

  }

}
