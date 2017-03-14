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


  /**
    * [[scala.collection.TraversableLike.++]]
    * Returns this contents merge another element
    *
    * @param that Another element to merge.
    * @return
    */
  def above(that: Element): Element =
    new ArrayElement(this.contents ++ that.contents)


  /**
    * Append this contents and another contents.
    *
    * @param that
    * @return
    */
  def beside(that: Element): Element = {
    val contents = new Array[String](this.contents.length)
    for ( i <- 0 until this.contents.length )
      contents(i) = this.contents(i) + that.contents(i)
    new ArrayElement(contents)
  }
}