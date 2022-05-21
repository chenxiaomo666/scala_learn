package chapter07

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

object test02 {
  def main(args: Array[String]): Unit = {
    // 可变数组 ArrayBuffer
    val arr = new ArrayBuffer()   // 默认是大小16的any空间
    val arr1 = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(111, 222, 333, 444, 555)

    println(arr1.mkString(", "))
    println(arr2.mkString(", "))
    println(arr2)                    // ArrayBuffer(111, 222, 333, 444, 555)
    println(arr2.toString())         // ArrayBuffer(111, 222, 333, 444, 555)

    // 访问数组的元素
    println(arr2(0))

    for(i <- 0 until arr2.length){
      print(arr2(i)+", ")
    }
    println()
    for(elem <- arr2){
      print(elem+", ")
    }

    println()

    // 可变数组添加新的元素
    val newArr1 = arr1 :+ 12
    println(newArr1)

    arr2 += 666   // 尾部插入
    val newArr2 = arr2 += 666
    println(arr2)
    println(newArr2)
    println(arr2==newArr2)

    0 +=: arr2    // 头部插入
    println(arr2)

    arr2.append(777)   // 尾部添加
    arr2.prepend(-2, -1)  // 头部插入
    arr2.insert(1, 123)  // 任意位置插入
    arr2.appendAll(arr1)  // 添加一个数组
    println(arr2)   // ArrayBuffer(-2, -1, 0, 111, 222, 333, 444, 555, 666, 666, 777)


    // 删除元素
    arr2.remove(0)   // 删掉index位置的元素
    arr2.remove(0, 5)  // 从index开始删除len个元素

    println(arr2)

    arr2 -= 666
    println(arr2)   // 这里有两个666，只删除一个


    // 可变数组和不可变数组转换
    val arr3: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4, 5)
    val arr4: Array[Int] = arr3.toArray     // 直接将可变数组转为不可变数组

    val arr5: mutable.Buffer[Int] = arr4.toBuffer

  }

}
