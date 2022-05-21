package chapter06

object Test04_classforAccess {

}

// 定义一个父类
class Person {
  private var idCard: String = _
  protected  var name: String = _
  var sex: String = _
  private[chapter06] var age: Int = _    // _ 表示为空的默认值

  def printInfo(): Unit ={
    println(s"idcard: $idCard, name: $name, sex: $sex, age: $age" )
  }
}
