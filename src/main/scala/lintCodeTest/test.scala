package lintCodeTest

object test {
  def main(args: Array[String]): Unit = {
    val solution = new Solution()
    println(solution.aplusb(1, 3))
  }

}

class Solution {
  /**
   * @param a: An integer
   * @param b: An integer
   * @return: The sum of a and b
   */
  def aplusb(a: Int, b: Int): Int = {
    // write your code here
    return a+b
  }
}
