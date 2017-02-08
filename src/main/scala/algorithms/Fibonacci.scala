package algorithms

/**
  * @author loustler
  * @since 02/09/2017 00:11
  */
object Fibonacci {
  def fibonacci(x: Int): Int =
    if ( x <= 1 ) x
    else fibonacci(x - 1) + fibonacci(x - 2)
}
