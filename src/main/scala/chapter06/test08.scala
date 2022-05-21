package chapter06

object test08 {
  def main(args: Array[String]): Unit = {

  }

}


// 抽象类
//定义抽象类： abstract class Person{}
// 定义抽象类： val name: String   只定义，并没有赋值
// 定义抽象方法： def hello(): String   只定义，不实现

abstract class Person9{

  val name: String = "888"  // 非抽象属性
  var age: Int     // 抽象属性

  def eat(): Unit ={
    println("eatting")
  }

  def sleep(): Unit
}

// 重写非抽象方法必须加override，重写抽象方法可以不写override
class Student9 extends Person9 {
  var age: Int = 34

  override val name = "555"

  override def sleep() = {
    println("student sleepping")
  }


}