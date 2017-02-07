# Specially Invoke Function 

# Repeated Parameter 
함수의 마지막 parameter를 반복 가능하다고 지정할 수 있음

`Java`에서 `...`와 같은 셈 

`Scala`에서는 `*`를 Type of Argument에 넣으면 된다 

`String*`이 Java의 `String...`과 같은 셈 

`Java`와 똑같이 Array로 취급되며 

Type of Argument가 `String*`일 때

`Array[String]`을 Parameter로 사용하려면
 
`Array[String] : _*`와 같이 사용하면

`Compiler`가 각 인자로 만들어서 넣어줌 

# Named Argument

일반적으로 Parameter는 Method Signature에 정의된 Argument의 순서를 따라야 한다 

그러나 `Scala`는 다음과 같은 경우 이렇게 사용할 수 있다

`def sub(a: Int, b: Int) = a - b` 일 때,

`sub(10, 9)`로 사용 할 수 있지만 

`sub(b = 9, a = 10)`처럼 사용할 수도 있다 

# Default Argument 

다른 언어들에서 지원하는 것처럼 `Default value`를 Argument에 지정할 수 있다

`def now(time : Long = System.currentTimeMilis)`와 같이 하고 

`now()`를 하면 `time`이 `default`로 `System.currentTimeMilis`의 값이 된다.

-----------
Written by @loustler at 08/02/17