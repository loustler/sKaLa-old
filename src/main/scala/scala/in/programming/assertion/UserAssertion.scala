package scala.in.programming.assertion

/**
  * @author loustler
  * @since 04/14/2017 20:34
  */
object UserAssertion {
  def testNonNull(s: String): Unit = {
    assert(null != s, "s is null")
  }

  def main(args: Array[String]): Unit = {
//    testNonNull(null) // It throw AssertionError.

  }
}
