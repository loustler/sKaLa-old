package scala.in.programming.abstract_internal_control

/**
  * @author loustler
  * @since 02/26/2017 17:27
  */
object Currying {
  /**
    * Currying the function that given parameter.
    *
    * @param x To currying function 1.
    * @param y like x. To currying function 2.
    * @return returns curreid function you wanted.
    */
  def curriedSum(x: Int)(y: Int) = x + y


  /**
    * Curry to function what i know.<br>
    *
    * It is example to use this function.
    * {{{
    *   val number: Int = 5
    *   val sumFunc = (x: Int, y: Int) => x + y
    *
    *   currying(number, sumFunc) // It returns like (5, Int) => 5 + Int
    *   currying(number, sumFunc)(5) // It returns 10
    * }}}
    *
    * @param x A types variable.
    * @param f To currying function.
    * @tparam A Generics type you wanted.
    * @tparam B Generics type you wanted.
    * @return Returns curried function you want.
    */
  def currying[A, B](x: A, f: (A, A) => B): A => B =
    a => f(x, a)


  def first(x: Int) = (y: Int) => x + y // It work same curriedSum function.
}
