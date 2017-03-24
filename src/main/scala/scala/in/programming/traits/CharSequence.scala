package scala.in.programming.traits

/**
  * @author loustler
  * @since 03/19/2017 17:09
  */
trait CharSequence {
  def charAt(index: Int): Char
  def length: Int
  def subSequence(start: Int, end: Int): CharSequence
  def toString(): String
}