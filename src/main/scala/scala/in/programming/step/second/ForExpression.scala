package scala.in.programming.step.second

/**
  * @author loustler
  * @since 01/14/2017 17:25
  */
object ForExpression {

  /**
    * Imperative Programming Language Style.
    *
    * @param args strings for print
    */
  def printArgsI(args: Array[String]): Unit = {
    var i = 0;

    while ( i < args.length ) {
      println(args(i))
      i += 1
    }
  }

  /**
    * Function Programming Language Style.
    *
    * @param args strings for print
    */
  def printArgsF(args: Array[String]): Unit = {
    for ( arg <- args )
      println(arg)
  }

  /**
    * Function Programming Language Style 2.
    *
    * @param args strings for print
    */
  def printArgsF2(args: Array[String]): Unit = args.foreach(println)
}
