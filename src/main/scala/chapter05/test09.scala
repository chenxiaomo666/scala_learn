package chapter05

object test09{
  def main(args: Array[String]): Unit = {
    def add(a: Int, b: Int):Int = {
      return a+b
    }

    //考虑固定一个加数的场景
    def addByFour(b: Int): Int = {
      return 4+b
    }
  }

    //固定加数改变
    def addByFive(b: Int): Int = {
      5+b
    }

    // 将固定参数作为另一个参数传入，但是作为‘第一层参数’传入
    def addByFour1(a: Int=4): Int=>Int = {
      def addB(b: Int): Int = {
        a+b
      }
      addB
    }

    println(addByFour1(9)(5))

    // 5、柯里化
    def addCurrying(a: Int)(b: Int): Int = {
      a+b
    }
    println(addCurrying(12)(23))

}
