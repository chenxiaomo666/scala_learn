package chapter07

import scala.collection.mutable.ListBuffer

object test05 {
  def main(args: Array[String]): Unit = {
    // 创建可变列表
    val list1 = new ListBuffer[Int]()
    val list2 = ListBuffer[Int](111, 222, 333, 444)

    println(list1)
    println(list2)

    // 添加元素
    list1.append(55, 66)
    list2.prepend(20,  40)

    list1.insert(1, 23)

    println(list1)
    println(list2)

    val list3 = list1 ++ list2
    println(list3)

    // 修改元素
    list2(3) = 23
    println(list2)

    // 删除
    list2.remove(5)   // index
    list2 -= 444
    println(list2)
  }

}
