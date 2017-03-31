/**
  * 이 에제는 3가지를 보여줌
  *
  * I. 어떤 클래스가 패키지에 속해있으면 FQCN을 사용할 필요가 없다
  * II. 부모 패키지는 자식 패키지에 FQCN을 사용하여 접근할 필요가 없다
  * III. 중괄호(brace) 패키징 문법을 사용하면 그 패키징 스코프밖에서 접근 가능한 모든 이름을 그 패키징 안에서도 사용할 수 있다
  *
  */
package scala.in.programming.packazee.one {
  package navigation {
    /**
      * @author loustler
      * @since 03/31/2017 20:25
      */
    class Navigator {
      val map = new StarMap
    }


    class StarMap
  }


  class Ship {
    val na = new navigation.Navigator
  }


  package fleets {
    class Fleet {
      def addShip() = new Ship
    }
  }
}