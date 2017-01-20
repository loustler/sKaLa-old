package scala.in.programming.default_type

/**
  * @author loustler
  * @since 01/20/2017 01:03
  */
object DefaultType {
  val byteMaxHex: Byte = 0x7F
  val shortMaxHex: Short = 0x7FFF
  val intMaxHex: Int = 0x7FFFFFFF
  val longMaxHex: Long = 0x7FFFFFFF
  val charMaxHex: Char = 0xFFFF
  val strs: String = ""
  val floatMax: Float = Float.MaxValue // Throw build exception in travis. Because 3.4028235E38F is too large
  val doubleMax: Double = 1.7976931348623157E308
  val booleen: Boolean = true

  // Max value of Default Type on scala. Not Hex
  val byteMax: Byte = Byte.MaxValue
  val shortMax: Short = Short.MaxValue
  val intMax: Int = Int.MaxValue
  val longMax: Long = Long.MaxValue
  val charMax: Char = Char.MaxValue
  val str: String = ""


}
