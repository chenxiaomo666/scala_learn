package chapter07

import scala.collection.mutable

object test09 {
  def main(args: Array[String]): Unit = {
    // 创建可变的map
    val map1 = mutable.Map("a" -> 12, "b" -> 13, "c" -> 14, "a" -> 23)
    println(map1)

    // 添加元素，同修改，如果之前有，就修改，如果没有，就直接添加
    map1.put("c", 34)
    map1.put("d", 56)
    map1.update("e", 34)
    println(map1)

    // 删除元素
    map1.remove("a")
    println(map1)

    // 合并map
    val map2 = mutable.Map("e" -> 11, "h" -> 34)

    val map3 = map1 ++ map2   // 相同元素按照后面的来
    map1 ++= map2
    println(map3)
    println(map1)
  }

}
