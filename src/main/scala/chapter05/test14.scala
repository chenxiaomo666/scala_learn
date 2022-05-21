package chapter05

object test14 {
  def main(args: Array[String]): Unit = {
    // 惰性函数: 当函数的返回值被声明成lazy的时候，函数的执行将会被推迟，直至我们首次对此进行取值，该函数才会被执行，
    lazy val result = sum(10, 20)
    val result1 = sum(40, 80)
    println("####################")
    println(s"result: $result")
    println(s"result1: $result1")

//    a: 40, b: 80
//      ####################
//      a: 10, b: 20
//    result: 30
//    result1: 120
  }

  def sum(a: Int, b: Int): Int = {
    println(s"a: $a, b: $b")
    a+b
  }
}
