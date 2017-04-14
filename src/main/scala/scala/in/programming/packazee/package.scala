package scala.in.programming

import scala.in.programming.imports.bobsdelights.fruit.{Fruit, Fruits}

/**
  * It is package Object.
  *
  * If you want use some function or method in package,
  * then use like this (package Object).
  *
  * @author loustler
  * @since 04/14/2017 20:08
  */
package object packazee {
  def showFruit(fruit: Fruit): Unit = {
    import fruit._

    println(s"${name}s are ${color}")
  }
}


/*
package printmenu
object PrintMenu {
  def main(args: Array[String]): Unit = {
    for (fruit <- Fruits.menu) {
      showFruit(fruit)
    }
  }
}
*/