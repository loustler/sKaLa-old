package scala.in.programming.build_in_control_structure

/**
  * @author loustler
  * @since 02/02/2017 00:36
  */
object MatchExpression extends App{
  val firstMatches = "args"

  val matchResult =
  firstMatches match {
    case "args" => "args"
    case _ => "Another"
  }

  println(matchResult)
}
