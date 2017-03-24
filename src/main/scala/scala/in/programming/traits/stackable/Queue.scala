package scala.in.programming.traits.stackable

import scala.collection.mutable.ArrayBuffer

/**
  * @author loustler
  * @since 03/24/2017 21:33
  */
trait Queue[T] {
  protected val buf = new ArrayBuffer[T]()

  def pop(): T
  def push(x: T)
  def size: Int = buf.size
}
