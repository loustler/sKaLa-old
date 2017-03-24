package scala.in.programming.traits

/**
  * Mixin [[scala.in.programming.traits.Philosophical]]
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