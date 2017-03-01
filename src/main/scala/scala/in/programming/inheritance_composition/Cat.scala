package scala.in.programming.inheritance_composition

/**
  * @author loustler
  * @since 03/02/2017 00:57
  */
class Cat {
  val dangerous = false
}

class Tiger (
  override val dangerous: Boolean,
  private val age: Int
) extends Cat

// As same Tiger
class Tiger2 (param1: Boolean, param2: Int) extends Cat {
  override val dangerous: Boolean = param1
  private var age = param2
}