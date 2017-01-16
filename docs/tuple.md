# Definition
 리스트(`List`)와 같이 `immutable`이지만,

 `List`와 달리 각기 다른 type의 element를 넣을 수 있음

# example

```
val tuple = (1, "two", 3, "four")

println(tuple._1)

println(tuple._2)
```

tuple의 원소에 접근하기 위해서는 

> `_`를 사용하여 type을 신경쓰지 않음?을 명시하여 사용해야 함

 Tuple은 여러 type을 가지고 있기 때문

> Haskell, ML과 같은 static type을 사용하는 language에서 전통적으로 tuple의 index를 1부터 count


-------
`Programming in scala 2nd 번역판`에서는 `Tuple22`까지 지원한다고 설명되어 있음

Scala `2.12.1`에서도 `Tuple22`는 `class`가 있는데 `Tuple23`은 없음(exception 발생)

-------

Written 01/13/17 by loustler

