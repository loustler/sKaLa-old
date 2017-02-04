package scala.in.programming.function_and_closure

/**
  * Simple example for test to invoke method which omitted parentheses.
  *
  * If you want test this class [[scala.in.programming.function_and_closure.MethodInvocationTest]]
  *
  * @author loustler
  * @since 02/04/2017 12:48
  */
class MethodInvocation {
  def sum(x: Int, y: Int) = x + y

  def subtract(x:Int, y: Int) = x - y

  def multiply(x: Int, y: Int) = x * y

  def divide(x: Int, y: Int) = x / y

  def modules(x: Int, y: Int) = x % y
}
