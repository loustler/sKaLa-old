package scala.in.programming.traits.stackable

/**
  * @author loustler
  * @since 03/24/2017 21:36
  */
class BaseIntQueue extends IntQueue {
  override def pop(): Int = {
    buf.remove(0)
  }

  override def push(x: Int): Unit = {
    buf += x
  }
}
