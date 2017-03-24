package scala.in.programming.`trait`

/**
  * Mixin [[scala.in.programming.`trait`.Philosophical]]
  *
  * @author loustler
  * @since 03/19/2017 16:34
  */
class Frog extends Philosophical {
  override def toString = "green"
  override def philosophize(): Unit = {
    println(s"It ain't easy being ${toString}!")
  }
}