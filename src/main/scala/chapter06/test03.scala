package chapter06

import scala.beans.BeanProperty
// 导包说明
// 1、和Java一样，可以在顶部使用import导入，在这个文件中的所有类都可以使用。
// 2、局部导入：什么时候使用，什么时候导入，在其作用范围内使用
// 3、通配符导入：import.java.util._
// 4、给类起别名：import java.util.{ArrayList=>JL}
// 5、导入多个类：import java.util.{HashSet, ArrayList}
// 6、屏蔽类：import java.util.{ArrayList=>_,_}   表示导入除了ArrayList都所有类
// 7、导入包的绝对路径：new _root.java.util.HashMap

// 三个默认的import java.lang._  import scala._   import scala.Predef._

object test03 {
  def main(args: Array[String]): Unit = {
    val student = new Student()
    println(student.age)
    student.age = 30
    println(student.age)

  }

}

// 定义类
//[修饰符] class 类名 {
//
//}
// 默认是public类但是默认是public，如果是public可以不写（也不可以写）
class Student{
  // 定义属性  不加修饰符默认是public但是不可以加，其他的private可以加
  private val name: String = "alice"
  // @BeanProperty
  var age: Int = _
  var sex: String = _   // 代表是None，但是不可以直接赋值为None，而且必须是变量var
}