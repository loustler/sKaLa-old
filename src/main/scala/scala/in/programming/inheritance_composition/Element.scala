package scala.in.programming.inheritance_composition

/**
  * Abstract method not define(have method's body).
  * If method define (have body) not abstract method.
  *
  * @author loustler
  * @since 02/28/2017 00:03
  */
abstract class Element {
  // These method is abstract method.
  def contents: Array[String]

  // Under methods not abstract method.
  def height: Int = contents.length

  def width: Int = if ( height == 0 ) 0 else contents(0).length
}