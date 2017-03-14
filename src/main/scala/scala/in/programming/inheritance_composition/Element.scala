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
    * [[scala.collection.TraversableLike#++]]
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
    * [[scala.collection.IndexedSeqOptimized#zip]] that aggregates the contents
    * of two lists into a single list of pairs.
    * {{{
    *   scala> Array(1, 2, 3) zip Array("a", "b")
    *   => Array((1, "a"), (2, "b"))
    *
    *   scala> List(1, 2, 3) zip List( "a", "b", "c")
    *   => List((1, "a"), (2, "b"), (3, "c"))
    * }}}
    *
    * @param that
    * @return
    */
  def beside(that: Element): Element = {
    /*
    val contents = new Array[String](this.contents.length)
    for ( i <- 0 until this.contents.length )
      contents(i) = this.contents(i) + that.contents(i)
    new ArrayElement(contents)
    */
    new ArrayElement(
      for (
        (line1, line2) <- this.contents zip that.contents
      ) yield line1 + line2
    )
  }
}