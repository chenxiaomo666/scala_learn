package chapter07

object test11 {
  def main(args: Array[String]): Unit = {
    // 集合共性
    val list = List(1, 2, 3 ,5)
    // 1、获取集合长度
    println(list.length+" "+list.size)

    val set = Set(12, 3, 4 , 5)
    println(set.size)

    // 4、迭代器
    for(elem <- list.iterator){
      print(elem+" ")
    }

    println(list(list.length-1))
    println(list.mkString(", "))

    // 是否包含
    println(list.contains(2))
    println(set.contains(2))

    println(list.reverse)   // 原集合不变
    println(list)

    val list4 = list.sorted
    println(list4)


  }

}
