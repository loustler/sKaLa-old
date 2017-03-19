# Constructor 
## Primary Constructor
`class Person(n: String, a: Int)`

`class`가 constructor처럼 됨 

이것을 주 생성자(primary constructor)라고 함

> `n`, `s`를 `class parameter`라고 부름 

`class Person(val n: String, val a: Int)` 와 같은 경우,

`Class` 외부에서 접근이 가능한 Field가 생성됨

```
val n: String = n
val a: Int = a
```

와 같은 형태로 생성됨.

`class Person(private val n: String, private val a: Int)`와 같은 경우,

```
 private val n: String = n
 private val a: Int = a
```
와 같음(Access Modifier 사용가능)

## Auxiliary Constructor

보조 생성자라고 부르며 

여러 생성자를 통해 `Class`를 생성할 필요가 있을 때 사용

Primary Constructor와 Auxiliary Contructor에 대한 

example은 `/src/main/scala/scala/in/programming/functional_object/Rational.scala` 참조

> 보조 생성자(auxiliary constructor)는 **반드시** 같은 클래스에 속한 다른 생성자(constructor)를 호출하는 코드로 시작해야 함 

즉, `this(...)` 

Class의 주 진입점은 **Primary constructor** 밖에 없다.

> Auxiliary Constructor가 Primary Constructor를 사용하는 꼴이 되므로 

-----
Written by @loustler at 20/01/17