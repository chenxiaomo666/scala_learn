package chapter07

object test01 {
  def main(args: Array[String]): Unit = {
    // 数组 不可变   对象地址不可以更改，对象的大小不可以更改，即不可以增加或者删除，但是可以更改元素，
    var array_len: Int = 10
    val arr: Array[Int] = new Array[Int](array_len)

    val arr2 = Array(12, 23, 34, 45, 56)


    // 访问数组中的元素
    println(arr2(0))
    arr2(0) = 123
    println(arr2(0))


    // 数组的遍历
    println()
    for(i <- 0 until arr2.length){
      print(arr2(i)+"  ")
    }
    println()
    for(i <- arr2.indices){   // arr2.indices  => 0 until arr2.length
      print(arr2(i)+"  ")
    }
    // 直接遍历元素
    println()
    for(x <- arr2){
      print(x+" ")
    }

    // 迭代器
    println()
    val iter = arr2.iterator
    while(iter.hasNext){
      print(iter.next()+" ")
    }

    // foreach
    arr2.foreach((elem: Int) => print(elem+" "))   // (elem: Int) => print(elem+" ")匿名函数

    // mkString
    println(arr2.mkString(" "))


    // 添加数组，生成新数组，
    val arr3 = arr2 :+ 999 :+ 000    // 末尾添加，arr2不变   注意+在：后面，就是尾部插入
    println(arr3.mkString(", "))

    val arr4 = 777 +: 888 +: arr2 :+ 999 // 在数组的头部添加     注意是+在：前面，就是头部插入
    println(arr4.mkString(", "))
  }

}
