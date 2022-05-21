package chapter05

object test10 {
  def main(args: Array[String]): Unit = {

    println(func(5))
  }

  def func(i: Int): Int = {
    if(i==0 || i==1) 1 else i*func(i-1)
  }

}
 