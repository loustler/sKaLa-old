# Term 
 `object`와 `class`의 이름이 같고 동일한 파일 안에 있으면 `object`가 `class`의 동반 객체, `class`가 `object`에게 동반 클래스가 된다.<br>
 `Companion Object`(동반객체) 라고 한다.

# What is it?
`Companion Object`는 `case class`를 사용할 경우 **auto generate**를 scala comopiler가 해준다.<br>
`Companion Object`에 메서드를 추가할 수도 있다.<br>
자동으로 추가되는 `method`는 다음과 같다. 
 1. [apply](#apply)


# apply
apply는 `Companion Class`의 `contructor`와 같은 인자를 받는다.

일종의 `Factory method`

e.g

in Array 

Author Martin Odersky `@odersky`

In Scala Standard Lib

```
def apply[T: ClassTag](xs: T*): Array[T] = {
    val array = new Array[T](xs.length)
    var i = 0
    for (x <- xs.iterator) { array(i) = x; i += 1 }
    array
  }
```

-------------------------
Another 

# 정의
자료 형식과 같은 이름의 Object를 일컫음

# 목적
자료 형식의 값들을 생성하거나 조작하는 여러 편의용 함수들을 담는데 사용

# 예제
 `List[A]`에 `5`를 채우기 위한 함수가 필요하면 `def fill[A](n: Int, a: A): List[A]`와 같이 만들 것이다.

 그럼 이 `fill` 함수는 동반 객체의 메서드로 만드는 것이 좋다

 > 일종의 관례이다.

출처 : [스칼라 스터디](https://github.com/codechobostudy/study-dev-scala/wiki/동반-객체(Companion-Object))
-------------------------
Modify 01/13/17 by @loustler