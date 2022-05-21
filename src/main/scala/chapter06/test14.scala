package chapter06

object test14 {
  def main(args: Array[String]): Unit = {
    val person = new Person14()
    println(person.isInstanceOf[Person14])
  }
}

//类型转换

class Person14{

}

// 定义枚举对象
object WorkDay extends Enumeration{
  val MONDAY = Value(1, "Monday")
  val TUESDAY = Value(2, "TuesDay")
}

object TestApp extends App{
  println("app start")
}
