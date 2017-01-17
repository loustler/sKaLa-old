package scala.in.programming.class_and_object

/**
  * @author loustler
  * @since 01/18/2017 00:37
  */
class ChecksumAccumulator {
  private var sum = 0

  def add(b: Byte): Unit = sum += b

  def checksum(): Int = ~(sum & 0xFF) + 1
}

// companion object
object ChecksumAccumulator {
  private val cache = scala.collection.mutable.Map[String, Int]()

  def calculate(s: String): Int =
    if ( cache.contains(s) )
      cache(s)
    else {
      val acc = new ChecksumAccumulator

      // String iteration. c is Character
      for ( c <- s )
        acc.add(c.toByte)

      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
}
