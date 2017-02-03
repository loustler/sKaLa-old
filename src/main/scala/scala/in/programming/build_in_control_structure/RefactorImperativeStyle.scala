package scala.in.programming.build_in_control_structure

/**
  * These methods included this object refactor coding style of Imperative.
  *
  * If you want show source code not refactored coding style of Imperative,
  * find source in PIS p.180.
  *
  * @author loustler
  * @since 02/03/2017 21:12
  */
object RefactorImperativeStyle extends App {

  /**
    * This function convert single row to sequence.
    *
    * @param row To convert row to sequence.
    * @return Single row converted to sequence.
    */
  def makeRowSeq(row: Int) =
    for ( col <- 1 to 10 ) yield {
      val prod = (row * col).toString

      val padding = " " + (4 - prod.length)

      padding + prod
    }

  /**
    * This function convert single row to strings.
    *
    * @param row To convert row to strings
    * @return Single row converted to string.
    */
  def makeRow(row: Int) = makeRowSeq(row).mkString


  def multiTable() = {
    val tableSeq =
      for (row <- 1 to 10)
        yield makeRow(row)

    tableSeq.mkString("\n")
  }
}
