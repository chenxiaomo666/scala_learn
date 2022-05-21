package chapter07

object test04 {
  def main(args: Array[String]): Unit = {
    val list1 = List(11, 22, 33)
    println(list1)
    for (x <- list1) {
      print(x + " ")
    }
    println()
    for (i <- list1.indices) {
      print(list1(i) + " ")
    }
    println()
    println(list1.mkString(", "))

    // list1(1) = 44   // error

    // 添加元素
//    val list2 = list1 +: 44
//    val list3 = 111 :+ list1
//    println(list1.mkString(", "))
//    println(list2.mkString(", "))
//    println(list3.mkString(", "))

    val list4 = 11 :: 22 :: 33 :: 44 :: Nil
    println(list4.mkString(", "))

    val list6 = List(1, 3, 5, 7, 9)
    val list7 = List(2, 4, 6, 8, 10)

    val list8 = list6::list7  // list8: List(1, 3, 5, 7, 9), 2, 4, 6, 8, 10
    val list9 = list6:::list7  // list9: 1, 3, 5, 7, 9, 2, 4, 6, 8, 10
    val list10 = list6++list7  // list10: 1, 3, 5, 7, 9, 2, 4, 6, 8, 10
    println(list6.mkString(", "))
    println(list7.mkString(", "))
    println(list8.mkString(", "))
    println(list9.mkString(", "))
    println(list10.mkString(", "))




  }


}
