package scala.in.programming.build_in_control_structure

/**
  * @author loustler
  * @since 02/01/2017 23:26
  */
object HandlingExceptions extends App {
  /**
    * Throw keyword have a result type in scala,
    * but in java isn't.
    *
    * Scala always ignore values in finally blocks.
    */
  val n = 5

  try {
    val resultType =
      if ( n % 2 == 0 )
        n / 2
      else
        throw new RuntimeException("N Must be even.")
  } catch {
    case e: RuntimeException => println("RuntimeException!! Cuz " + e.getMessage)
    case e: Exception => println("Exception!! Cuz " + e.getMessage)
  } finally {
    println("It is finally. Always called. It will be ignore.")
  }

  /**
    * Checked Exception don't need to use catch keyword
    * and Add throws keyword to method signature
    * in scala.
    *
    * Therefore if you want to use throws,
    * use annotation [[@throws]].
    *
    */

}
