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
`mix-in`하는 순서가 중요

대강 말하면 

> 가장 오른쪽에 있는 `trait`부터 적용

e.g `class MacBook extends Computer with NoteBook with Apple`

이라면 `Apple` 먼저 적용이 된다

적용되는 순서는

`Apple` => `NoteBook` => `Computer` 순서대로이다.

`Apple`, `NoteBook`, `Computer`에 

`print`라는 method가 있고,

`abstract class Apple extends NoteBook`,

`abstract class NoteBook extends Computer`

와 같고 각 `print` method가 `super.print`를 호출한다면

`MacBook`의 `print`가 실행되는 순서는

`Apple` => `NoteBook` => `Computer` 

되며 왼쪽부터 `print`를 실행한다.



----
Written by @loustler at 19/03/17