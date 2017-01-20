package scala.in.programming.functional_object

/**
  * @author loustler
  * @since 01/20/2017 21:17
  */
class Rational(n: Int, d: Int) {
  //
  /**
    * constructor의 제한조건
    *
    * 제약조건에 불일치 하면 throw new IllegalArgumentException
    * [[scala.Predef.require()]]
    */
  require(d != 0)

  val numer: Int = n
  val denom: Int = d

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
}
