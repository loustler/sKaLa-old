package scala.in.programming.operation

import java.lang.AssertionError
/**
  * @author loustler
  * @since 01/20/2017 20:51
  */
object Order extends App{
  assert( ("Hello" + " World") == "Hello World", "print msg when assertion fail")

  assert( 2 + 5 * 3 == 17)

  try {
    assert( 2 + 5 * 3 == 13, "Fail")
  } catch {

    case e: AssertionError => println(e.getMessage)
  } finally {
    println("Catch Error")
  }

}
