package scala.in.programming.function_and_closure

/**
  * First Class like first class citizen, without restriction.
  *
  * A first-class function may,
  * as with other data types,
  * be created in literal form without ever having been assigned an identifier;
  * be stored in a container such as a value, variable, or data structure;
  * and be used as a parameter to another function or used as the return value from another function.
  *
  * Let's go
  *
  * @author loustler
  * @since 02/03/2017 21:53
  */
object FirstClazz extends App {
  val value = 1

  // To be used as value, so it is possible reallocate another.
  var increase = (x: Int) => x + 1

  println(increase(value))

  // Reallocate another.
  increase = (x: Int) => x + 9999

  println(increase(value))

}
