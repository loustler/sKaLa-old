package scala.in.programming.tests

import scala.in.programming.inheritance_composition.Element._

/**
  * @author loustler
  * @since 04/21/2017 22:06
  */
class ElementSuite extends org.scalatest.Suite{
  def testUniformElement(): Unit = {
    val ele = elem('x', 2, 3)
    assert(ele.width == 2)
  }
}
