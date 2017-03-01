package scala.in.programming.inheritance_composition

/**
  * @author loustler
  * @since 03/02/2017 01:46
  */
class UniformElement(
  ch: Char,
  override val width: Int,
  override val height: Int
) extends Element{
  private val line = ch.toString * width
  def contents = Array.fill(height)(line)
}
