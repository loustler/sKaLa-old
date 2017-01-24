package scala.in.programming.functional_object

/**
  * @author loustler
  * @since 01/20/2017 21:17
  */
class Rational(n: Int, d: Int) {

  /**
    * constructor의 제한조건
    *
    * 제약조건에 불일치 하면 throw new IllegalArgumentException
    * [[scala.Predef.require()]]
    */
  require(d != 0)

  private val g = gcd(n.abs, d.abs)

  val numer: Int = n / g

  val denom: Int = d / g

  def this(n: Int) = this(n, 1) // Auxiliary Constructor for this class.

  /**
    * Like below
    * {{{ 1/2 + 1/3 }}} =>
    * {{{ 1 * 3 + 1 * 2 / 2 * 3 }}} =
    * {{{ 5 / 6 }}}
    *
    * @param that Another Rational to add
    * @return Add reuslt
    */
  def add(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  /**
    * Like below
    * {{{ 1/2 lessThen 2/3 }}} =>
    * {{{ 1 * 3 < 1 * 2 }}} ==
    * {{{ false }}} ==>
    * {{{ 0.5 lessThen 0.6666666..... }}}
    *
    * @param that
    * @return
    */
  def lessThen(that: Rational) =
    this.numer * that.denom < that.numer * this.denom

  override def toString: String = n + "/" + d

  /**
    * Override to method which override operation.
    *
    * It like ..
    * {{{ 1/2 + 3 }}} =>
    * {{{ 1/2 + 6/2 }}} ==
    * {{{ 1 + 6 / 2 }}} ==
    * {{{ 7/2 }}}
    *
    * @param i
    * @return
    */
  def +(i: Int) =
    new Rational(numer + i * denom, denom)

  /**
    * Override to operation.
    *
    * It like ..
    * {{{ 1/2 * 1/3 }}} =>
    * {{{ 3/6 * 2/6 }}} ==
    * {{{ 5/6 }}}
    *
    * @param that
    * @return
    */
  def +(that : Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom,
      denom * that.denom
    )

  /**
    * Override method which override operation.
    *
    * @param i
    * @return
    */
  def -(i : Int): Rational =
    new Rational(numer - i * denom, denom)

  /**
    * Override operation.
    *
    * {{{ 1/2 - 1/3 }}} =>
    * {{{ 3/6 - 2/6 }}} ==
    * {{{ 1/6 }}}
    *
    * @param that
    * @return
    */
  def -(that : Rational): Rational =
    new Rational(
      numer * that.denom - that.numer * denom,
      denom * that.denom
    )

  /**
    * Override to operation.
    *
    * It like ...
    * {{{ 1/2 * 1/3  }}} =>
    * {{{ 1/6 }}}
    *
    * @param that
    * @return
    */
  def *(that : Rational): Rational =
    new Rational(numer * that.numer, denom * that.denom)

  /**
    *
    *
    * @param i
    * @return
    */
  def *(i: Int): Rational =
    new Rational(numer * i, denom)

  def /(that: Rational): Rational =
    new Rational(
      numer * that.denom,
      denom * that.numer
    )

  def /(i: Int): Rational =
    new Rational(numer, denom * i)

  /**
    * Get Greatest Common Divisor use recursive call self.
    *
    * This function called private helper method.
    *
    * Pure Function, Not side-effect.
    *
    * Work like below..
    *
    * {{{ gcd ( 12, 8 ) }}} =>
    * {{{ 8 != 0 do recursive call like (8, 12 % 8 == 4) }}} =>
    * {{{ 4 != 0 do recursive call like (4, 8 % 4 == 0) }}} =>
    * {{{ 0 == 0 return 4 }}}
    *
    * @param a
    * @param b
    * @return Greatest Common Divisor
    */
  private def gcd(a: Int, b: Int): Int =
    if ( b == 0 ) a else gcd(b, a % b)


  /**
    * This function support like below case.
    * {{{ 2 * r  }}} is compile error but after apply this function
    * {{{ 2 * r == r * 2}}}
    *
    * This function couldn't work isolatedly.
    * If you want use this function, copy to your app.
    *
    * @param x
    * @return
    */
  implicit def intToRational(x: Int) = new Rational(x)
}
