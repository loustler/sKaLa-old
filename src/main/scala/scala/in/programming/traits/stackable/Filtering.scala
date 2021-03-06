package scala.in.programming.traits.stackable

/**
  * @author loustler
  * @since 03/24/2017 21:58
  */
trait Filtering extends IntQueue {
 abstract override def push(x: Int): Unit = {
    if (x >= 0)
      super.push(x)
  }
}
