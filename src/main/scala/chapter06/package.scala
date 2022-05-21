package object chapter06 {
  // 包对象，定义当前包共享的属性和方法
  val commonValue = "atguigu"
  def commonMethod(): Unit ={
    println(commonValue)
  }
}
