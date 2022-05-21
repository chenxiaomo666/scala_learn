package chapter06

object test10 {
  def main(args: Array[String]): Unit = {
    val student = new Student11("cxm", 23)
    student.printInfo()
  }
}


// 单例对象，全局只有一份


// 定义类
class Student11(val name: String, val age: Int){
  def printInfo(): Unit ={
    println(s"$name, $age, ${Student11.school}")
  }
}

// 伴生对象
object Student11{
  val school: String = "NEUQ"  // val 类似静态属性，类属性
}