package scala.in.programming.abstract_internal_control

/**
  * @author loustler
  * @since 02/17/2017 01:56
  */
object SimpleCodeForClientCodes {
  def containsNeg(nums: List[Int]): Boolean = {
    for ( num <- nums )
      if ( num < 0 )
        return true

    false
  }


  def containsNeg2(nums: List[Int]) = nums.exists(_ < 0)


  def containsOdd(nums: List[Int]): Boolean = {
    for ( num <- nums )
      if ( num % 2 == 1 )
        return true

    false
  }


  def containsOdd2(nums: List[Int]) = nums.exists(_ % 2 == 1)
}
