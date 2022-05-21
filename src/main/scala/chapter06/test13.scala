package chapter06

object test13 {
  def main(args: Array[String]): Unit = {
    val student = new Student13()
    student.sayHello()
    student.study()
    student.paly()
    student.dating()
  }
}

// 特质：Trait
// 替代java中的接口，然后是对单继承的补充
// trait 特质名 { 特质主题 }
// 使用特质   单继承、多实现
// 没有父类： class class_name extends trait_name1 with trait_name2 with trait_name3 ...
// 有父类：class class_name extends father_name with trait_name1 with trait_name2 with trait_name3 ...

class Person13{
  val name: String = "persion"
  var age: Int = 24

  def sayHello(): Unit ={
    println(s"hello:$name, $age")
  }
}


// 定义特质
trait Young {
  // 生命抽象和非抽象属性
  var age: Int
  val name: String = "young"

  // 生命抽象和非抽象方法
  def paly(): Unit ={
    println(s"$name, $age young palying")
  }

  def dating(): Unit
}


class Student13 extends Person13 with Young {

  override val name = "student"

  override def dating(): Unit = {
    println(s"$name, $age student palying")
  }

  def study(): Unit = println(s"student $name is studying")

  override def sayHello(): Unit = {
    super.sayHello()
    println("student say hello")
  }
}