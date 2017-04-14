package scala.in.programming.packazee

/**
  * Use Companion Object.
  *
  * Companion object have permission to access private members.
  *
  * Caution : Object must have not protected member, cause object is single object.
  *
  * Therefore that cannot extension.
  *
  * @author loustler
  * @since 04/14/2017 19:56
  */
class Rocket {
  import Rocket.fuel
  private def canGoHomeAgain = fuel > 20
}

object Rocket {
  private def fuel = 10


  def chooseStrategy(rocket: Rocket): Unit = {
    if (rocket.canGoHomeAgain)
      goHome()
    else
      pickAStar()
  }


  def goHome(): Unit = {
    println("go Home!")
  }


  def pickAStar(): Unit = {
    println("pick a star")
  }
}
