package scala.in.programming.traits.stackable

/**
  * @author loustler
  * @since 03/24/2017 21:47
  */
trait Doubling extends IntQueue {
  abstract override def push(x: Int): Unit = {
    super.push(2 * x)
  }
}
