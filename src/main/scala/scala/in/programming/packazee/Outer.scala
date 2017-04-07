package scala.in.programming.packazee

/**
  * @author loustler
  * @since 04/07/2017 20:31
  */
class Outer {
  class Inner {
    private def f() = println("f")

    class InnerMost {
      f() // It is possible
    }
  }

//  (new Inner).f() // thrown compile error. Unlike java
}

package protect {
  class Super {
    protected def f() = println("f")
  }

  class Sub extends Super {
    f()
  }

  class Other {
//    (new Super).f() // Cannot access, cause not extend Super
  }
}