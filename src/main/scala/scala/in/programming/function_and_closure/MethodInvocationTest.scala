package scala.in.programming.function_and_closure

/**
  * It is test application for [[scala.in.programming.function_and_closure.MethodInvocation]]
  *
  * @author loustler
  * @since 02/04/2017 12:58
  */
object MethodInvocationTest extends App {
  val test = new MethodInvocation

  val x = 1

  val y = 2

  println(test sum(x, y))

  println(test divide(y, x))

  println(test multiply(x, y))

  println(test subtract(y, x))

  println(test modules(x, y))
}
