package scala.in.programming.inheritance_composition

import scala.in.programming.inheritance_composition.priv.{Element}

/**
  * @author loustler
  * @since 03/15/2017 00:52
  */
object Element {
  private class ArrayElement(const: Array[String])
    extends Element {
    val contents: Array[String] = const
  }

  private class LineElement(s: String) extends Element {
    val contents = Array(s)
    override def width = s.length
    override def height = 1
  }

  private class UniformElement(
      ch: Char,
      override val width: Int,
      override val height: Int
  ) extends Element {
    private val line = ch.toString * width
    def contents = Array.fill(height)(line)
  }

  private class ArrayElement2(
   val contents: Array[String]
  ) extends Element

  def elem(contents: Array[String]): Element =
    new ArrayElement(contents)


  def elem(c: Char, width: Int, height: Int): Element =
    new UniformElement(c, width, height)


  def elem(line: String): Element =
    new LineElement(line)
}