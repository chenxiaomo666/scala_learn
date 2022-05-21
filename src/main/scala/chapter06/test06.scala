package chapter06

object test06 {
  def main(args: Array[String]): Unit = {
    val student1 = new Student7("alice", 12)
    student1.printInfo()
    var student2 = new Student7("cxm", 24, "20178666")
    student2.printInfo()

    val person = new Person7()

    def persionInfo(person: Person7): Unit ={
      person.printInfo()
    }

    persionInfo(student2)
    persionInfo(new Teacher())
  }
}

// 继承和多态
// 单继承，构造器先调用父类，再调用子类
// class 子类名 extends 父类名 {类体}

class Person7(){
  var name: String = _
  var age: Int = _
  println("father main init called")

  def this(name: String, age: Int) = {
    this()
    println("father other init called")
    this.name = name
    this.age = age
  }

  def printInfo(): Unit ={
    println(s"Persion: $name, $age")
  }
}


class Student7(name: String, age: Int) extends Person7() {

  var stdNo: String = _

  println("son main init called")

  def this(name: String, age: Int, stdNo: String) = {
    this(name, age)
    println("son other init called")
    this.stdNo = stdNo
  }

  override def printInfo(): Unit ={
    println(s"Student: $name, $age, $stdNo")
  }

}

class Teacher extends Person7 {
  override def printInfo() = {
    println("teacher  ")
  }
}