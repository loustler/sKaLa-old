package scala.in.programming.step.second

/**
  * Learn function expression, it compare with Imperative Programming Language.
  *
  * @author loustler
  * @since 01/14/2017 17:12
  */
object FunctionExpression extends App {
  val strs: Array[String] = Array("Hi,", "My", "nickname", "is", "loustler")

  // Imperative Programming Language's for expression.
  println("------ for :: Imperative Language ------")
  ForExpression.printArgsI(strs)
  println("------ for :: Imperative Language ------")


  // Functional Programming Language's for expressions. But it has side-effects.
  println("------ for :: Functional Language ------")
  ForExpression.printArgsF(strs)
  println("------ for :: Functional Language 1 ------")
  ForExpression.printArgsF2(strs)
  println("------ for :: Functional Language 2 ------")

  /**
    * Perfectly Functional Programming's function style like ...
    *
    * No return value.(Unit type)
    *
    * @param args The target string which insert new line.
    * @return Insert new line into each elements in args.
    */
  def formatArgs(args: Array[String]): String = formatArgs(args, "\n")

  /**
    * Make string into parameter each element in arguments.
    *
    * @param args The target string which insert some string.
    * @param str  Insert string.
    * @return Insert new string into each elements in args.
    */
  def formatArgs(args: Array[String], str: String): String =
    args.mkString(str)


  println("------ format String 1 ------")
  println(formatArgs(strs))
  println("------ format String 2 ------")
  println(formatArgs(strs, " "))
}