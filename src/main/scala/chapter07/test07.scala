package chapter07
import scala.collection.mutable

object test07 {
  def main(args: Array[String]): Unit = {
    // 可变set
    val set1: mutable.Set[Int] = mutable.Set(111, 22, 33, 44, 22)
    println(set1)

    // 添加元素
    set1 += 11
    println(set1)

    set1.add(55)
    println(set1)

    // 删除元素
    set1 -= 22
    set1.remove(33)
    println(set1)

    // 合并集合
    val set2 = mutable.Set(1, 2, 3, 4 ,5 ,5)

    val set3 = set1 ++ set2
    println(set3)

    set1 ++= set2
    println(set1)


  }

}
