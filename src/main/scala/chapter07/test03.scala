package chapter07

object test03 {
  def main(args: Array[String]): Unit = {
    // 多维数组
    // 二维数组
    val array = Array.ofDim[Int](2, 3)  // c从一维到五维！  两行三列

    // 访问元素
    array(1)(2) = 999
    println(array(1)(2))

    for(i <- 0 until array.length){
      for(j <- 0 until array(0).length){
        print(array(i)(j)+" ")
      }
      println()
    }

    for(i <- array.indices; j <- array(0).indices){
      print(array(i)(j)+" ")
      if(j==array(i).length-1) println()
    }

    for(x <- array){
      for(y <- x){
        print(y+ " ")
      }
      println()
    }
  }

}
