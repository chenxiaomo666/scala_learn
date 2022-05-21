package chapter06

object test02 {
  def main(args: Array[String]): Unit = {
    println(commonValue) // 这个commonValue是package里面的包对象的共享对象
  }
}

