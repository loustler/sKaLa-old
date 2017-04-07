# import

e.g

```scala
package bobsdelights

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
```

## Flexible

Scala의 import의 유연성은

1. 어느 곳에서나 사용할 수 있다
1. 패키지뿐만 아니라 (singleton, 일반) 객체도 참조할 수 있다
1. 불러온 멤버 이름 중 일부를 숨기거나 다른 이름을 지정할 수 있다

import 한 것의 이름을 변경하고 싶으면

```scala
 import bobsdelights.fruit.Fruits.{Apple => Macintosh, Orange}
```

와 같이 

`<origin name> => <new name>`과 같이 사용하면 됨

```scala
 import bobsdelights.fruit.Fruits.{Apple => Macintosh, _} // 1
 import java.{sql => S} // 2
```

1은 `Apple`만 `Macintosh`로 바꾸고 나머지는 그대로 가지고 오는 것

2는 `java.sql` package를 `S`로 바꾸어 사용할 수 있음

```scala
 import bobsdelights.fruit.Fruits.{Apple => _, _} 
```

`Apple`을 제외한 나머지는 `import`함


## Conclusion

1. 간단한 이름 `x.` 이런 import는 불러온 이름의 집합에 `x`를 추가
1. `x => y`가 있으면 `x`를 `y`로 보게 해줌
1. `x => _`가 있으면 `x`를 숨김
1. `x => _, _` 경우 `x`를 제외한 나머지를 모두 가지고 옴(나머지 전체를 의미하는 `_`는 마지막에 와야됨)

e.g

```scala
	import p._ // == import p.{_}
	import p.n // == import p.{n}
```

# Implicit Import

package `scala`에는 흔히 사용하는 클래스 및 객체 그리고 표준 스칼라 라이브러리가 있음

e.g

```scala
 List // scala.List
 Predef // scala.Predef 암시적 형변환(Implicit Conversion) 포함
 assert // scala.Predef.assert
```

> scala는 나중에 import한 패키지에 들어 있는 이름이 더 앞에서 import한 이름을 가리도록 `java.lang._` , `scala._`, `Predef._`을 특별하게 취급

Sequence가 다음과 같다는 말

1. `java.lang._`
1. `scala._`
1. `Predef._`

이래서 `java.lang._`에 있는 것을 `scala._`이나 `Predef._`에 있는 것들이 가려버리는(명시적으로 사용하지 않으면 sequence가 늦은 것이 호출) 현상 발생

e.g

```scala

  /* java.lang.StringBuilder??  scala.StringBuilder ?? */
  StringBuilder // =>  scala.StringBuilder

  java.lang.StringBuilder // java.lang.StringBuilder

```


---
Written by @loustler at 31/03/2017