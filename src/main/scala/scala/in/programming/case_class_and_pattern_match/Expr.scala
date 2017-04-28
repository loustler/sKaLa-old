package scala.in.programming.case_class_and_pattern_match

/**
  * @author loustler
  * @since 04/28/2017 20:53
  */
abstract class Expr

case class Var(name: String) extends Expr
case class Number(num: Double) extends Expr
case class UnOp(operator: String, arg: Expr) extends Expr
case class BinOp(operator: String, left: Expr, right: Expr) extends Expr


object Expr {
  def simplifyTop(expr: Expr): Expr = expr match {
    case UnOp("-", UnOp("-", e)) => e
    case BinOp("+", e, Number(0)) => e
    case BinOp("*", e, Number(1)) => e
    case _ => expr
  }
}


object TestForCaseClass {
  def main(args: Array[String]): Unit = {
    val vvar = Var("hi")
    val num = Number(num = 5d)
    val uop = UnOp(arg = Number(0), operator = "+")

    assert(vvar.name == "hi")
    assert(num.num == 5d)
  }
}
