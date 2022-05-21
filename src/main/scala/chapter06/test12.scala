package chapter06

object test12 {
  def main(args: Array[String]): Unit = {
    val student = Student12.getInstance()
    student.printInfo()
    val student2 = Student12.getInstance()
    student2.printInfo()
    // student1 and student2 is one
  }
}


class Student12(val name: String, val age: Int){
  def printInfo(): Unit ={
    println(s"$name, $age, ${Student11.school}")
  }
}

// 单例对象：全局只有一份

// 饿汉式
//object Student12 {
//  private val student: Student12 = new Student12("bob", 23)
//
//  def getInstance(): Student12 = student
//}

// 懒汉式
object Student12{
  private var student: Student12 = _

  def getInstance(): Student12 = {
    if(student == null){
      student = new Student12("cxm", 34)
    }
    student
  }
}