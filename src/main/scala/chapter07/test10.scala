package chapter07

object test10 {
  def main(args: Array[String]): Unit = {
    // 元组： 可以存放相同或者不同的数据，List必须存放相同的数据
    // 元组最大只能有22个元素

    val tuble1 = (1, 2, (3, "a", "b", "c"), 'a', 0, 2, 3, "a", "b", "c", 'a', 0, 2, 3, "a", "b", "c", 'a', 0, 2, 3, "a", "b", "c", 'a', 0, 2, 3, "a", "b", "c", 'a', 0, 2, 3, "a", "b", "c", 'a', 0)
    println(tuble1)

    for(elem <- tuble1.productIterator){
      println(elem)
    }

    println(tuble1.toString())  // (1,2,3,a,b,c,a,0)

    //

  }

}
