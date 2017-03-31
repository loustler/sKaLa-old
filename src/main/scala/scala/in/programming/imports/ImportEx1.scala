package scala.in.programming.imports

import scala.in.programming.imports.bobsdelights.fruit.Fruit

/**
  * @author loustler
  * @since 03/31/2017 21:16
  */
class ImportEx1 {
  def showFruit(fruit: Fruit): Unit = {
    // direct access to fruit.
    import fruit._
    // name == fruit.name , color == fruit.color.
    println(s"${name}s are ${color}")

  }
}
