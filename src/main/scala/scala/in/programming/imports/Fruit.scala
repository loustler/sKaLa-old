package scala.in.programming.imports
package bobsdelights.fruit

/**
  * @author loustler
  * @since 03/31/2017 21:02
  */
abstract class Fruit (
  val name: String,
  val color: String
)

object Fruits {
  object Apple extends Fruit("apple", "red")
  object Orange extends Fruit("orange", "orange")
  object Pear extends Fruit("pear", "yellowish")
  val menu = List(Apple, Orange, Pear)
}
/**
  * Examples of import
  *
  * I. import bobsdelights.Fruit  //  As same single type import(like import java.util.List) in Java.
  * II. bobsdelights._            //  As same on-demand import(like import java.util.*) in Java.(asterisk == *)
  * III. bobsdelights.Fruits._    //  As same static import(like import static java.util.*) in Java.
  *
  */