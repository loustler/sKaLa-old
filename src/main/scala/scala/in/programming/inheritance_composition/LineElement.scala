package scala.in.programming.inheritance_composition

/**
  * {{{Array(s)}}} is called super class' constructor.
  *
  * @author loustler
  * @since 03/02/2017 01:07
  */
class LineElement(s: String) extends Element {
  val contents = Array(s)
  override def width = s.length
  override def height = 1
}
