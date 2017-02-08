package algorithms

/**
  * @author loustler
  * @since 02/09/2017 00:14
  */
object FibonacciTest extends App{
  /**
    * Fibonacci 5
    * 0 1 1 2 3 5
    * 0 1 2 3 4 5
    *
    * 5 will be 5
    */
  val number = 5

  val result = Fibonacci fibonacci number

  assert(result == 5)
}
