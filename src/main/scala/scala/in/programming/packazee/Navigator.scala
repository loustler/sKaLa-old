package scala.in.programming.packazee

package bobsrockets

/**
  * @author loustler
  * @since 04/07/2017 20:44
  */
package navigation {
  private[bobsrockets] class Navigator {
    protected[navigation] def useStartChart() {}
    class LegOfJourney {
      private[Navigator] val distance = 100
    }
    private[this] var speed = 200
  }
}

package launch {
  import navigation._
  object Vehicle {
    private[launch] val guide = new Navigator
  }
}