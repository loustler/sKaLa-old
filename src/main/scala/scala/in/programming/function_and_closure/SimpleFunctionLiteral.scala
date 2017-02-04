package scala.in.programming.function_and_closure

/**
  * @author loustler
  * @since 02/04/2017 11:34
  */
object SimpleFunctionLiteral extends App {
  val someNumbers = List(-11, -10, -5, 0, 5, 10)

  println("--------- example 1 -------------")

  // This method use method reference.
  someNumbers.foreach(println)

  println("--------- example 1 -------------")

  println("--------- example 2 -------------")

  // Parameter of filter function is Predicate
  someNumbers.filter(x => x > 0).foreach(println)

  println("--------- example 2 -------------")

  println("--------- example 3 -------------")

  // It works such example 2.
  someNumbers.filter(_ > 0).foreach(println)

  println("--------- example 3 -------------")

  println("--------- example 4 -------------")

  // It works such example 1.
  someNumbers.foreach(println _)

  println("--------- example 4 -------------")


  println("--------- example 5 -------------")

  // Partially applied function
  def sum(a: Int, b: Int, c: Int) = a + b + c

  // Show how to partially applied

  /**
    * Step 1
    *
    * It is example for first partially applied function,
    * cuz provide any values as parameter.
    *
    */
  val partially1 = sum _

  println(partially1(1, 2, 3))

  /**
    * Step 2
    *
    * It is example for second partially applied function,
    * cuz provide 2 values as parameter out of 3 parameters.
    *
    */
  val partially2 = sum(1, _: Int, 3)

  println(partially2(2))

  println("--------- example 5 -------------")
}
