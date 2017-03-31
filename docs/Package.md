# package 

## single file, multi package

한 file에 여러 package를 넣을 경우 얻을 수 있는 이점은

1. 어떤 클래스가 패키지에 속해있으면 FQCN을 사용할 필요가 없다
1. 부모 패키지는 자식 패키지에 FQCN을 사용하여 접근할 필요가 없다
1. 중괄호(brace) 패키징 문법을 사용하면 그 패키징 스코프밖에서 접근 가능한 모든 이름을 그 패키징 안에서도 사용할 수 있다

이다.

e.g

```scala
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
```


## apply class to multi package

e.g

```scala

// super package
/**
  * @author loustler
  * @since 03/31/2017 20:40
  */
package bobsrockets {
  class Ship
}

package bobsrockets.fleets {
  // When remove comments, throw compile error.
//  class Fleet {
//    def addShip() = new Ship
//  }
}

// sub package
package bobsrockets
package fleets

/**
  * It is possible.
  *
  * @author loustler
  * @since 03/31/2017 20:35
  */
class Fleet {
  def addShip() = new Ship

```

위의 `Fleet`과 같이 하면 동시에 multi package에 한 개의 class인 `Fleet`를 적용시킬 수 있다.

위의 `Fleet`와 같이 여러 패키지를 중괄호 없이 표현하는 것을 연새 패키지 절(Chained Package Clause) 라고 한다.


## access hidden package

코딩하면서 발생하는 패키지 이름이 뒤섞여 서로를 가르키는 현상을 줄이기 위한 트릭

```scala
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
```

이렇게 사용하면 된다.

----
Written by @loustler at 31/03/2017