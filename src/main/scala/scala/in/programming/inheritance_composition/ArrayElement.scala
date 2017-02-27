package scala.in.programming.inheritance_composition

/**
  * @author loustler
  * @since 02/28/2017 00:55
  */
class ArrayElement(const: Array[String]) extends Element {
  val contents: Array[String] = const

//  override def contents: Array[String] = const // It is possible.
}
