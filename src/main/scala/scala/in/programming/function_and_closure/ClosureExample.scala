package scala.in.programming.function_and_closure

/**
  * This object which extends App show example what is closure.
  *
  * @author loustler
  * @since 02/07/2017 23:12
  */
object ClosureExample extends App {
  var more = 1;

  /**
    * The x parameter is bound variable, because it is meant to be in this function literal.
    * The more parameter is free variable, because not defined in this function literal.
    *
    * This function literal is not closure yet.
    */
  val closure = (x: Int) => x + more

  println(ClosureExample closure 10) // Now it is closure!

  // If change free variable then closure detect?
  more = 100

  println(closure(10)) // Closure will detect free variable changed.

  /**
    * This function not to be closure.
    * Because this function not have free variable.
    * It is called closed term.
    */
  val not_closure = (x: Int) => x + 1

  // It is possible detect change captured variable in closure
  val someNumbers = List(-11, -10, -5, 0, 5, 10)

  var sum = 0

  someNumbers.foreach(sum += _) // Change free variable in closure

  println(sum) // Changed free variable in closure

  def makeIncreaser(more: Int) = (x: Int) => x+ more // It'll make closure if it was invoke.

  val inc1 = makeIncreaser(1) // Returns like (x: Int) => x + 1

  val inc9999 = makeIncreaser(9999) // Returns like (x: Int) => x + 9999

  println(inc1(9))

  println(inc9999(1))
}
