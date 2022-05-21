package chapter05

object test08 {
  def main(args: Array[String]): Unit = {
    println("main start")
    // 1、
    val fun = (a: Int, b: String, c: Char) => {
      if(a==0 && (b=="" && c=='0')) false else true
    }

    println(fun(0, "", '0'))
    println(fun(0, "", '1'))
    println("main end")
  }
  println("####################################")
  // 2、
  def func(a: Int): String=>(Char=>Boolean) ={
    def f1(b: String): Char=>Boolean ={
      def f2(c: Char): Boolean ={
        if(a==0 && (b=="" && c=='0')) false else true
      }
      return f2
    }
    return f1
  }

  println(func(0)("")('0'))
  println(func(0)("")('3'))

}
