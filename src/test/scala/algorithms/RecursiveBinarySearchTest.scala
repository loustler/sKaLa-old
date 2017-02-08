package algorithms

/**
  * @author loustler
  * @since 02/09/2017 00:33
  */
object RecursiveBinarySearchTest extends App{
  val numberList = Array(1, 2, 3, 4, 5, 6, 7, 10, 15, 20)
  val start = 0
  val last = numberList.length - 1
  val find = 15
  val findIndex = 8

  val result1 = RecursiveBinarySearch binarySearch(numberList, start, last, find)
  val result2 = RecursiveBinarySearch binarySearch2(numberList, start, last, find)

  assert(result1 == findIndex)
  assert(result2 == findIndex)

}
