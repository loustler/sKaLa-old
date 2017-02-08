package scala.in.programming.function_and_closure

/**
  * Scala compiler not make new stack when invoke recursion,
  * reuse same stack frames and optimize a tail recursion.
  *
  *
  * A Tail Recursion is invoke self in last position.
  *
  * Scala compiler has limit that optimize a tail recursion,
  * because implements High Level tail recursion difficult use to JVM command line.
  *
  * Scala compiler possible optimize when invoke same function.
  *
  * @author loustler
  * @since 02/08/2017 23:20
  */
object TailRecursion extends App {
  def boom(x: Int): Int =
    if ( x == 0 ) throw new RuntimeException("Boom!")
    else boom(x - 1)

  boom(3) // It'll throw RuntimeException. When you test this code has to commented.

  /**
    * This is example for Tail Recursion made by me(loustler).
    *
    * It is not exist example in PIS.
    *
    * @param x
    * @param y
    * @return
    */
  def decrease(x: Int, y: Int): Int =
    if ( y == 0 ) x else decrease(x - 1, y - 1)

  println(decrease(10, 3))
}
