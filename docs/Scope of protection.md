# Scope of protection

보호스코프라 칭함

보호스코프는 접근제어자에 더 강력한 기능을 제공해준다. 

아래와 같은 예제가 있다고 하자

```scala
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
```

그럴 때 `LegOfJourney.distance`에 `private`이 붙어있다면 다음과 같음

수식자 없음 | 전체 접근 가능(공개)
---------|-------------
private[bobsrockets] | 바깥쪽 패키지(bobsrockets) 내부에서 접근 가능
private[navigation]	| Java의 패키지 접근과 같음
private[Navigator] | Java의 private과 같음
private[LegOfJourney] | Scala의 private
private[this]	|	어떤 객체 자신만 접근 가능

해석을 해보면 

`private[bobsrockets]`의 경우 `LegOfJourney.distance`가 `bobsrockets` 하위에 있는 `LegOfJourney`에 있기 때문에

`private`의 범위가 `bobsrockets` package 전체로 확장됨

`private[navigation]`의 경우 자기 자신이 속해있는 패키지인 `bobsrockets.navigation` 즉, `navigation` 에서만 접근가능하므로

Java의 `protected`와 같다

`private[Navigator]`의 경우 Java의 Private과 같으며 자신의 클래스 안에서만 접근 가능함

`private[LegOfJourney]`의 경우 `LegOfJourney` 자기 자신만 접근할 수 있게 하므로 `scala`의 `private`과 같다

`private[this]`의 경우는 어떤 객체 자신만 접근가능하다

-----
Written by @loustler at 04/14/2017