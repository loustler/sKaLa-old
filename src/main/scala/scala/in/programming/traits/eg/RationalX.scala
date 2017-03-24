package scala.in.programming.traits.eg

import scala.in.programming.functional_object.Rational

/**
  * @author loustler
  * @since 03/24/2017 20:56
  */
class RationalX(n: Int, d: Int) extends Rational(n, d){
  def < (that: RationalX) =
   this.numer * that.denom > that.numer * this.denom

  def > (that: RationalX) =
   that < this

  def <= (that: RationalX) = (this < that) || (this == that)

  def >= (that: RationalX) = (this > that) || (this == that)
}
