package algorithms

/**
  * @author loustler
  * @since 02/15/2017 23:56
  */
object NumberToBit {
  def numberToBit(n: Int): Unit =
    if (n <= 1) print(n)
    else {
      numberToBit(n / 2)
      print(n % 2)
    }
}
