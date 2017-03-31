package scala.in.programming.packazee.three

/**
  * @author loustler
  * @since 03/31/2017 20:38
  */
package launch {
  class Booster3
}

package bobsrockets {
  package navigation {
    package launch {
      class Booster1
    }

    class MissionControl {
      val booster1 = new launch.Booster1
      val booster2 = new bobsrockets.launch.Booster2
      val booster3 = new _root_.scala.in.programming.packazee.three.launch.Booster3
    }
  }

  package launch {
    class Booster2
  }
}