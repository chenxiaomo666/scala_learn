package chapter07

object test06 {
  def main(args: Array[String]): Unit = {
    // set集合，m默认是不可变集合，
    val set1 = Set(11, 22, 33, 44, 22)
    println(set1)

    // 添加元素
    val set2 = set1 + 20
    println(set1)
    println(set2)

    // 合并set
    val set3 = Set(1, 3, 5 , 7, 9)
    val set4 = Set(2, 3, 4 ,6 ,8)
    val set5 = set3 ++ set4
    println(set5)

    // 删除元素
    val set6 = set3 - 5
    println(set6)
    println(set3)


  }

}
