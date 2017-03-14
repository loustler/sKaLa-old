package scala.in.programming.inheritance_composition.public

import scala.in.programming.inheritance_composition.{ArrayElement, Element, LineElement, UniformElement}

/**
  * @author loustler
  * @since 03/15/2017 00:52
  */
object Element {
  def elem(contents: Array[String]): Element =
    new ArrayElement(contents)


  def elem(c: Char, width: Int, height: Int): Element =
    new UniformElement(c, width, height)


  def elem(line: String): Element =
    new LineElement(line)
}
