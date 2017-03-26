여러 가지 차이가 있으며 특히 `super`의 해석차이가 가장 중요

## super

다른 언어들의 `super`의 해석은 compile-time에 결정이 됨(어느 `super` method를 호출할 지)

Scala의 `trait`은 특정 class에 mix-in한 class와 `trait`을 linearization(선형화)해서 어떤 method를 호출할 때 결정

Scala의 이러한 Linearization을 통해서 stackable modification이 가능


# linearization

클래스를 `new`를 통해 instance를 생성할 떄,

자기 자신, 조상 클래스(들), mix-in trait을 linearization 하여 order를 함
(맨 앞은 자기 자신)

`super`를 클래스 내부에서 호출하면

linearization을 통해 만들어진 ordered 상태에서 

다음 order의 `method`를 호출

[How to class linearization in Scala Language Specification document](https://www.scala-lang.org/files/archive/spec/2.12/05-classes-and-objects.html#class-linearization)

## Example and Explain

다음과 같이 있다면,

```
class Animal

trait Furry extends Animal

trait HasLegs extends Animal

trait FourLegged extends HasLegs

class Cat extends Animal with Furry with FourLegged

```


여기서 Scala Language Specification의 Linearization을 보면

`Cat >> FourLegged >> Furry >> Animal` 이 먼저 만들어진다고 `Cat` 안에서만 추측한다.

이제 상속 안에 파고 들어가게 된다면,

`Cat >> FourLegged >> Furry >> Animal >> AnyRef >> Any` 가 된다.

`AnyRef`가 모든 Reference type Class의 `super type`이고 

`Any`는 모든 type의 `super type`이기 때문에 

`Animal >> AnyRef >> Any`가 성립하게 된다.

더 자세히 이해하기 위해서 `REPL(Read Eval Print Loop)`를 이용해 아래 예제를 실행해보자.

```
class A { 
	print("A") 

	def m(msg : String) { print(s"${msg}A") } 
}

trait H {
 print("H") 

 def m(msg : String) { print(s"${msg}H") } 
}

trait S extends H { 
	print("S") 

	abstract override def m(msg : String) { super.m(msg + "S") } 
}

trait R { 
	print("R") 

	def m(msg : String) { print(s"${msg}R") } 
}

trait T extends R with H { 
	print("T") 

	abstract override def m(msg : String) { super.m(msg + "T") } 
}

class B extends A with T with S { 
	print("B") 

	override def m(msg : String) { super.m(msg + "B") } 
}

val b = new B

b.m("")

```

이걸 `REPL`에서 실행하면 어떻게 나올까?

위의 예시를 참고해 보면 다음과 같이 Linearization이 되어야 한다.

`B >> S >> T >> H >> R >> A >> AnyRef >> Any`

그렇다면 실행했을 때,

그러나 class의 hierarchy를 이룰 때와 Linearization할 때는 다르다.

`val b = new B`를 했을 때는

`ARHTSB`가 print 된다.

`Linearization`의 예상 결과와는 반대다.

예상한 `Linearization`의 결과로는

`BSTAHR`이 출력이 되어야 한다.

그렇다면 `m()`은 어떻게 될까?

실행해보면

`BSTH`가 print 된다.

Linearization을 예상한대로 실행되고 있다.

# Further information

1. [Directed acyclic graph](https://en.wikipedia.org/wiki/Directed_acyclic_graph)
1. [Scala Language Specification Document of version 2.12](https://www.scala-lang.org/files/archive/spec/2.12/)

-----
Written by @loustler at 26/03/2017