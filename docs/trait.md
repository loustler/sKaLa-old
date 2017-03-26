# trait

`Java`의 interface와는 다름(method 구현이 들어간 것 정도의 차원이 아님)

`trait`에는 field를 선언해 state를 가질 수 있음.

`Class`를 정의하면서 사용할 수 있는 것을 모두 사용할 수 있으며,

아래는 사용할 수 없음

1. Parameter of Class 를 가질 수 없음
	- Constructor에 전달할 수 있는 Parameter를 가질 수 없음
	- `trait NoPoint(x: Int, y: Int) // Compile error
1. `super`가 정적 바인딩(compiletime binding)이 아닌 동적 바인딩(Rumtime binding)을 함.
	- 예를 들어 `super.toString`을 호출해도 실제 호출할 `toString`의 구현을 알 수 없음
		- 호출할 method 구현은 mixin 할 때마다 새로 정해지기 때문
	- `super`가 특이하게 동작하면서 `trait`을 이용해 변경 위에 변경을 쌓아올리는(`stackable modification`: 쌓아올릴 수 있는 변경) 것이 가능


주된 사용법은 

> 어떤 클래스에 그 클래스가 이미 가지고 있는 method를 기반으로 하는 새로운 method를 추가하는 것

이다. 

즉, 

> Make The thin interface to The rich interface.

Trade off 

The rich interface | The thin interface
------------------ | ----------------
많은 method를 가지고 있음<br>Client에게 편의제공 | 적은 method를 가지고 있어 <br> 구현에 용이함



# Mixin
 [See this Wiki](What's%20difference%20between%20inheritance%20by%20trait%20in%20scala%20and%20multiple%20inheritance%20in%20another%20language.md)


# To use or not to use

1. 어떤 행위(`method`)를 재사용하지 않을 것이라면 class
1. 서로 관련이 없는 class에서 같은 `method`를 여러 번 재사용해야 한다면 `trait`
1. Java에서 Scala 내용을 상속한다면 `abstract class`
	- Java에는 Scala의 `trait`과 유사한 개념이 없음
	- 구현코드가 없는 `trait`은 Java의 `interface`로 만들어짐
1. 컴파일한 바이트코드 형태로 배포할 예정
	- 상속해서 사용한다면 추상 클래스르 더 많이 사용할 것
	- 단 `trait`를 client에서 상속하지 않고 사용만 한다면 문제가 없음
1. performance가 중요하다면
	- class를 사용
	- Java Runtime은 클래스 멤버에 대한 가상 메서드 호출(virtual method invocation)을 interface method invocation보다 더 빠르게 수행
	- `trait`는 `interface`가 되기 때문에 성능상 부가비용이 발생함
	- 단, `trait`이 성능상 병목(bottleneck), `class`로 변경할 경우 성능 문제를 해결할 수 있을 때만 사용
1. 위의 내용으로도 판단이 안선다면 `trait`를 쓰는 게 더 좋음(언제든지 변경가능하기 때문)

----
Written by @loustler at 19/03/17