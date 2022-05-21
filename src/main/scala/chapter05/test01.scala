package chapter05

object test01 {
  def main(args: Array[String]): Unit = {
    val func = (name: String) => {println(name)}

    def func_1(func: String=>Unit, age: Int): Unit = {
      func("cxm")
      println(age+1)
    }

    func_1(func, 12)

    println("###############################")

    // 定义一个二元运算函数，具体运算通过参数指定
    val double_num_opt = (x:Int, y:Int) => {
      print(x+y)
      return x+y
    }

    def real_doble(func: (Int, Int)=>Int, x: Int, y: Int): Int = {
      func(x, y)
      return 9
    }

    val result = real_doble((x, y)=>x+y+6, 3, 4)
    println(result)

  }

}
