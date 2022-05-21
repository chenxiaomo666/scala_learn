package chapter06

object test05 {
  def main(args: Array[String]): Unit = {
    val student1 = new Student1()
    val student2 = new Student1("Bob")
    val student3 = new Student1("Bob", 56)
  }

}

// 构造器
// 定义一个类
class Student1() {
  // 主构造器的形参包括三种类型：
//  1、未使用任何修饰符修饰，这个参数是一个局部变量
//  2、var修饰参数，作为一个类的成员属性使用，可以修改
//  3、val修饰参数，作为类的只读属性，不能修改。
  // 定义熟悉感
  var name: String = _
  var age: Int = _

  println("1、主构造器被调用")

  // 声明辅助构造器  辅助构造器可以有多个，
  def this(name: String) = {
    this()
    println("2、辅助构造器被调用")
    this.name = name
    println(s"name: $name age: $age")
  }

  def this(name: String, age:Int) = {
    this(name: String)
    println("3、辅助构造器2")
    this.age = age
    println(s"name: $name age: $age")
  }

  // def Student1(): Unit = {}   不是构造方法，而是一般方法，注意和java区别

}

class Student2(var name: String, var age: Int){
  
}
