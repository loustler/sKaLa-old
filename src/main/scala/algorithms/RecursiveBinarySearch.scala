package algorithms

/**
  * @author loustler
  * @since 02/09/2017 00:24
  */
object RecursiveBinarySearch {
  def binarySearch(array: Array[Int], first: Int, last: Int, target: Int): Int = {
    if (first > last) -1

    val mid = (first + last) / 2

    if (array(mid) == target) mid
    else if (array(mid) > target) binarySearch(array, first, mid - 1, target)
    else binarySearch(array, mid + 1, last, target)
  }

  def binarySearch2(array: Array[Int], first: Int, last: Int, target: Int): Int =
    if (first > last) -1
    else if (array((first + last) / 2) == target) (first + last) / 2
    else if (array((first + last) / 2) > target) binarySearch2(array, first, ((first + last) / 2) - 1, target)
    else binarySearch2(array, ((first + last) / 2) + 1, last, target)
}
