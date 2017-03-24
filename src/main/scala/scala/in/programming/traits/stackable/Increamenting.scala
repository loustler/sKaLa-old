package scala.in.programming.traits.stackable

/**
  * @author loustler
  * @since 03/24/2017 21:57
  */
trait Increamenting extends IntQueue {
  abstract override def push(x: Int): Unit = {
    super.push(x + 1)
  }
}
