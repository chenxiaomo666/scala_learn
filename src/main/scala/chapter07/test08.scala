package chapter07

object test08 {
  def main(args: Array[String]): Unit = {
    // 不可变map
    val map1: Map[String, Int] = Map("a" -> 12, "b" -> 13, "c" -> 14, "a" -> 23)  // 后面会覆盖
    println(map1)
    println(map1.getClass)

    // 遍历元素
    map1.foreach( println )
    map1.foreach( ((kv: (String, Int)) => println(kv)))

    for(item <- map1){
      println(item(0)+": "+item(1))
    }

    // 获得所有key， value
    for(key <- map1.keys){
      print(key+" ")
    }
    println()
    for(value <- map1.values){
      print(value+" ")
    }

    println()

    // 获取具体的key
    println(map1.getOrElse("a", 0))
    println(map1("a"))


  }

}
