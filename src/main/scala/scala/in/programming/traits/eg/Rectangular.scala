package scala.in.programming.traits.eg

/**
  * @author loustler
  * @since 03/19/2017 17:13
  */
trait Rectangular {
  def topLeft: Point
  def bottomRight: Point

  def left  = topLeft.x
  def right = bottomRight.x
  def width = right - left
}