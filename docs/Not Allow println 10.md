Scala에서는 single argument만 요구하는 경우 `.`과 `()`을 사용하지 않고 method를 호출할 수 있다.

e.g

```
val greetStrings = List("Hi", "Hello", "Goodbye")

 for ( i <- 0 to 2)
   println(greetStrings(i))
```

여기에서 

`0 to 2` 이 부분이다.

그러면 `println`도 single argument만 요구하는 데 왜 사용할 수 없을까?

창시자인 Martin Odersky 교수가 저서한 `programming in scala 2nd`를 번역한 역자에게 여쭈어봤다.

그 분의 답변은 아래와 같다.

----

`Console println 10`은 `Console.println(10)`으로 `receiver method argument` pattern이 되지만 

`this` object에 대해 `this.println(10)` (이것은 결국 `println(10)`)을 `println 10`으로 

사용하는 것을 허용 안한다는 것입니다.

`Console.println(10)`을 `Console println 10`이라고 쓰게 허용하는 이유는 

객체지향에서 이항연산자를 지원하기 위한 것이고(그래서, `1 + 2 = 1.+(2)`이고, `+`는 `Int`에 정의된 method가 되죠)

`receiver`(`호출 대상 객체`라는게 이 용어를 번역한 건데.. `receiver`가 뭔지는 아실 것이라 생각하고 넘어가겠습니다)를 

명시하지 않고 `println 10`이라고 쓰는 것을 금지한 이유는 ...

아마도..

`postfix operator`나 `prefix operator`와 혼동될 수 있기 때문이 아닐까 싶습니다.

```
object Foo {
   def bar = "hoho"
};

val x = Foo.bar;

val y = Foo bar;
```

처럼 `Foo bar` 스타일로 인자가 없는 메서드 호출을 할 수 있거든요.

또 한가지 문제는 

`f + y + k`를 해석할 때 `(f.+(y)).+(k)`로 해석할 수 있는데, 

`println 10` 같은 것을 허용해버리면,

`f poo y pee k`같은 문장을 `(f.poo(y)).pee(k)`로 해석할 지,

`((this.f(poo)).y(pee)).k`로 해석할지 등등 

해석할 여지가 너무 많이 생기는 것도 문제가 될 것 같고요.

----

라고 말씀해주셨음.

아직 정확히 어떤 것을 말씀해주신 것을 알 수 없기 때문에 

일단 저장해놓고 차차 알아가면서 

이 wiki content에 수정하면서 추가하는 것으로 함

-----

Suffix Notation 이라 부르는 것으로 보이고 

[stack overflow](http://stackoverflow.com/questions/3617491/why-cant-i-write-println-hello-world-in-scala)에 올라온 질문의 답변을 보면 왜 허용하지 않는지 짐작할 수 있음

바로 expression의 ambiguity 때문.. 

-----
content history

Written 01/13/17 by @loustler

Modify 01/14/17 by @loustler