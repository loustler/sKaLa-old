package scala.in.programming.functional_object

/**
  * @author loustler
  * @since 01/24/2017 00:50
  */
object RationalTest extends App{
  val r = new Rational(3 ,4)
  val e = new Rational(1, 3)

  println(r + e)
  println(r + 3)
  println(r - 1)
  println(r / e)
  println(r / 2)


  println(r * 2)
//  println(2 * r) // this compile error
  implicit def intToRational(x: Int) = new Rational(x)

  println(2 * r)
}
