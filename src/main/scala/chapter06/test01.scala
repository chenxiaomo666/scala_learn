// 用嵌套风格定义包
package com{

  import com.atguigu.scala.Inner  // 外层是不可以直接访问内层的东西

  // 外层包里定义单例对象
  object Outer{
    var out: String = "out"
    Inner
  }

  package atguigu{
    package scala{
      // 内层包里定义单例对象
      object Inner{
        def main(args: Array[String]): Unit = {
          println(Outer.out)   // 子包中可以直接调用父包的对象
          Outer.out = "Changed by inner"  // 还饿可以更该
          println(Outer.out)
        }
      }
    }
  }
}

// 在同一文件中定义多个包，
package aaa{
  package bbb{

    import com.Outer   // 可以用其他包里的东西

    object test01{
      def main(args: Array[String]): Unit = {
        println(Outer.out)
      }
    }
  }
}