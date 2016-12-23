package programming.scala.one

/**
  * @author loustler
  * @since 12/23/2016 15:03
  */
object Upper {
  /**
    * #upper1, #upper2 were same logic and working.
    * What's difference between upper1 and upper2?
    * see below two function.
    *
    * @param strings
    * @return
    */
  def upper1(strings: String*): Seq[String] = {
    strings.map((s: String) => s.toUpperCase())
  }

  def upper2(strings: String*) = strings.map(_.toUpperCase)

  def upper3(strings: String*) = strings.map(_.toUpperCase).foreach(printf("%s ", _))

  def main(args: Array[String]): Unit = {
    val str = "beautiful"
    val str1 = "langauge"
    val str2 = "is"
    val str3 = "scala"
    println(upper1(str, str1, str2, str3))
    println(upper2(str, str1, str2, str3))
    upper3(str, str1, str2, str3)
  }
}
