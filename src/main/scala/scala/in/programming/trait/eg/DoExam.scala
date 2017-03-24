package scala.in.programming.`trait`.eg

/**
  * @author loustler
  * @since 03/24/2017 21:16
  */
object DoExam {
  def main(args: Array[String]): Unit = {
    val n = 5
    val d = 6
    val x = new RationalMixOrdered(n, d)
    val y = new RationalMixOrdered(d, n)
    val xx = new RationalX(n, d)
    val yy = new RationalX(d, n)

    if (x > y)
      println("bigger than x")
    else
      println("less than y")

    if (xx > yy)
      println("bigger than xx")
    else
      println("less than yy")
  }
}
