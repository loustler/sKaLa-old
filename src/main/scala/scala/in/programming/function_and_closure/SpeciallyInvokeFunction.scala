package scala.in.programming.function_and_closure

/**
  * Scala support a Repeated Parameter, Named Argument and Default Argument.
  *
  * These parameter explain through example.
  *
  * The difference between Argument and Parameter is
  * The parameter is 5 on {{{println(5)}}}.
  * The argument is args on {{{def println(args: Any*)}}}.
  *
  * @author loustler
  * @since 02/08/2017 00:32
  */
object SpeciallyInvokeFunction extends App{
  /**
    * At first The Repeated Parameter
    *
    * It works like Console Println.
    *
    * @param args It works like String... in java. It's real type is Array[String]
    */
  def echo(args: String*) = for (arg <- args) println(arg)

  SpeciallyInvokeFunction echo "hi"

  echo("Hello", "World")

  // It works like upper.

  val argz = Array("Hello", "World")

  // You want know what is _*?  https://github.com/loustler/scala/wiki/keyword#underscore_-asterisk_
  echo(argz: _*)


  // At second The Named Argument
  def speed(distance: Float, time: Float): Float =
    distance / time

  val distance = 100.0f
  val time = 10.0f

  println(speed(distance, time))

  // it works like upper.
  println(speed(time = time, distance = distance))

  // At third The Default Argument
  def now(time: Long = System.currentTimeMillis) =
    println(String.format("time is %s", time.toString))

  // Two Default Arguments
  def now2(time: Long = System.currentTimeMillis,
                 divisor: Int = 1) =
    println(String.format("time is %s", (time / divisor).toString))

  now()

  now2(divisor = 5)
}
