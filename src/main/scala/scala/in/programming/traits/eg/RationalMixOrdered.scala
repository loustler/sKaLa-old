package scala.in.programming.traits.eg

import scala.in.programming.functional_object.Rational

/**
  * It is simple to define that compare this and another.
  *
  * @author loustler
  * @since 03/24/2017 21:02
  */
class RationalMixOrdered(n: Int, d: Int) extends Rational(n, d) with Ordered[RationalMixOrdered] {
  override def compare(that: RationalMixOrdered): Int = {
    (this.numer * that.denom) - (that.numer * that.denom)
  }
}