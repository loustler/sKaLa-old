package programming.scala.one

import programming.scala.one._

/**
  * @author loustler
  * @since 12/23/2016 15:35
  */
object ShapesApp extends App{
  val p00 = new Point() // x and y is default value
  val p20 = new Point(2.0) // target parameter is x, y is default value
  val p20b = new Point(2.0) // target parameter is x, y is default value
  val p02 = new Point(y = 2.0) // target parameter is y, x is default value

  println(p00)
  println(p20)
  println(p02)
  println(p20b)

  println()

  val p000 = Point.apply()
  val p200 = Point.apply(2.0)
  val p20b0 = Point.apply(2.0)
  val p020 = Point.apply(y=2.0)

  println(p000)
  println(p200)
  println(p20b0)
  println(p020)
}
