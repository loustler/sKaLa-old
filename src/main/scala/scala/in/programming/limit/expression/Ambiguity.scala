package scala.in.programming.limit.expression

/**
  * Let's learn why scala not allow some expression.
  *
  * @author loustler
  * @since 01/14/2017 16:25
  */
class Ambiguity {}

class B {}

object A {
  def apply(myB : B): Unit = {
    println("apply")
  }

  def b: Unit = {
    println("b")
  }
}


/**
  * Do below test then you know why not allow expression for println 10 in scala.
  *
  * Because expression is ambiguity.
  *
  * The syntax ( println 10 ) is same problem which expression is ambiguity.
  *
  * Below expression called suffix notation in scala.
  * To see http://docs.scala-lang.org/style/method-invocation.html#suffix-notation
  *
  */
object App extends App {
  val b = new B

  A.b

  A b

  A(b)
}

