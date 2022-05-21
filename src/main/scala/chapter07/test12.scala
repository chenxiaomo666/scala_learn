package chapter07
import scala.collection.mutable

object test12 {
  def main(args: Array[String]): Unit = {
    // word count
    val stringList = List(
      "hello scala",
      "hello python",
      "hello java",
      "hello c++"
    )


    val result = mutable.Map("#" -> 1)

    for(elem <- stringList){
      for(word <- elem.split(" ")){
        val cur_num = result.getOrElse(word.toString, 0) + 1
        result.update(word.toString, cur_num)
      }
    }
    println(result)

  }

}
