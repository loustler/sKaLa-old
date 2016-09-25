package fpis.two

/**
  * object == module
  *
  * object keyword는 singleton 인스턴스를 생성함
  * Scala에서는 Java의 static에 해당하는 Keyword가 없으며 유사하게 사용하기 위해 object를 사용.
  *
  * @author Loustler
  * @since 9/23/16
  */
object MyModule {
  /**
    *
    * @param n (Int type)
    * @return if n < 0 : -n ? n; (Int type)
    */
  def abs(n : Int): Int =
  if (n < 0) -n
  else  n

  /**
    *
    * @param x (Int type)
    * @return The absolute value of x is x
    */
  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d";
    msg.format(x, abs(x))
  }

  /**
    * Scala의 Unit은 Java의 void와 같다
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    println(formatAbs(-42))
  }
}
