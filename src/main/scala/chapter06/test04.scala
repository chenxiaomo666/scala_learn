package chapter06

object test04 {
  def main(args: Array[String]): Unit = {
    val persion = Person()
    persion.printInfo()

    val worker = Worker()
    worker.printInfo()
  }
}


// 封装，属性私有化，get，set方法调用
// java，首先对属性进行私有化，然后提供一个公共的set方法对属性进行赋值，提供一个公公共的get方法获取值
// scala底层对其做了封装，可以直接调用，而不用先私有化，再提供公共的set、get，


//
class Worker extends Person{
  override def printInfo(): Unit = {
    println("worker: ")
    name = "Bob"
    age = 25
    sex = "male"
    println(s"Worker: $name, $age, $sex")
  }
}