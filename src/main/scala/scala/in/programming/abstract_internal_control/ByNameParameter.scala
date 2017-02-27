package scala.in.programming.abstract_internal_control

/**
  * Call by name paraemter.
  * Not ambiguous with named parameter.
  *
  * @author loustler
  * @since 02/26/2017 18:14
  */
object ByNameParameter {
  val assertionEnabled: Boolean = true

  /**
    * This function use closure from field in this object.
    *
    * @param predicate
    * @return
    */
  def myAssert(predicate: () => Boolean) =
    if ( assertionEnabled && !predicate() )
      throw new AssertionError


  def myAssert2(predicate: => Boolean) =
    if (assertionEnabled && !predicate)
      throw new AssertionError


  /**
    * What's difference between [[ByNameParameter.myAssert2()]] and this?
    *
    * If [[ByNameParameter.assertionEnabled]] is false,
    * [[ByNameParameter.myAssert2()]]'s predicate not work.
    * But this function must to work.
    * Cause this function's arguments have side-effects,
    * but [[ByNameParameter.myAssert2()]] haven't.
    *
    * Maybe like this
    * {{{
    *   val x = 10
    *
    *   myAssert2( x / 0 == 0 ) // Its happen nothing.
    *
    *   myAssert3( x / 0 == 0 ) // It is throw ArithmeticException.
    * }}}
    *
    * Therefore [[ByNameParameter.myAssert2()]] is lazy,
    * this function strict.
    *
    * @param predicate
    */
  def myAssert3(predicate: Boolean) =
    if (assertionEnabled && !predicate)
      throw new AssertionError


  def main(args: Array[String]): Unit = {
    myAssert(() => 5 >3) // It so strange. It is not good.

    myAssert2(5 > 3) // It is nice.
  }
}
