# keyword
 scala에서 사용하는 keyword를 볼 때마다 정리 

# Keyword List 
 1. [val](#val)
 1. [var](#var)
 1. [bracket](#bracket)
 1. [object](#object)
 1. [==](#double-equal)
 1. [Unit](#unit)
 1. [*](#asterisk)
 1. [_*](#underscore_-asterisk_)
 1. [-](#hyphen-)
 1. [<-](#for-arg-in-args)
 1. [trait](#trait)
 1. [->](#make-tuple)
 1. [Operator Identifier](#operator-identifier)
 1. [Mixed Identifier](#mixed-identifier)
 1. [Literal Identifier](#literal-identifier)
 1. [yield](#yield)

# val 
 읽기전용 값으로 선언할 때 사용하며, `Java`에서 `final`과 비슷하게 동작<br>
 **imuutable** 변수를 선언할 때 사용하는 것으로 추정<br>
 한 번 할당하면 재할당 할 수 없음<br>

# var
 `Java`에서 `final`이 아닌 변수와 비슷함<br>
 없어질 때까지 계속 재할당이 가능

# bracket
 1. `Java`에서의 `Generics`와 같이 Type을 매개변수 타입(parameterized type) 지정할 때 사용 
   * ex: `def hello(str: String): result[String] = ` 에서 `result`의 type은 `String`이다.

# object 
 `object`는 `singleton` 객체다. 이 `singleton`은 1급 요소로 취급한다.

# double equal
 `Java`에서는 `Reference Check`지만 `Scala`는 `equals()`를 호출함

# Unit
 `Java`의 `void`와 유사하게 동작함
 
  **오직 부수효과만**만을 위한 것
  
  procedure 라고도 부름
   
 value는 unit value 밖에 없음
  
 unit value는 `()`로 표기된다는 점에서 `Unit`은 `Java`의 `void`와는 다름
  
 `var`를 사용해 `unit value`를 재할당하면 항상 `()`이기 떄문에 아래와 같은 경우는 무한루프가 됨
 
 ```
 var line = ""
 while ( (line = readLine() ) != "")
  println("READ : "+line)
 ```
 
 `readLine()`의 Unit 결과는 `()`이기 때문


# asterisk(`*`)
 - 메서드 파라미터에 가변인자를 적용하기 위해 사용
 - 자바의 `...`와 유사
 - ` 0 ~ n` 개의 인자라고 생각하면 될 듯 
 - 메서드 내부에서 가변인자가 Seq 로 바인딩 됨
 - `def head(args: Int*): Int = args.head` // Seq의 메서드인 head를 사용
 - `head(1,2,3)` // => 1

# underscore_ asterisk(`_*`)
 - Seq를 가변인자 메서드에 적용할 때 사용
 - `String.format("%s + %s = %s", "1","2","3")`
 - `String.format("%s + %s = %s", Seq("1","2","3"):_*)` // 1 + 2 = 3

# hyphen(`-`)
 - import에서는 `import *`과 같은 의미 
 - 다음과 같은 lambda에서
    - `x => x + 1` 을 `_ + 1`로 하면
    - 여기에서 `_`는 `x => x`와 같은 의미
 - `switch`에서는 `default:`와 같음
    - `_ :` 로 표현
 - 다음과 같은 의미를 가짐 
    - `_+_` 는 `(x, y) => x + y`
    - `_ * 2` 는 `x => x * 2`
    - `_.head` 는 `xs => xs.head`
    - `_ drop _` 는 `(xs, n) => xs.drop(n)`

# for arg in args
 - `syntax`
   - `<-`
 - 안에 있다고 생각하면 되고 `for in` 쓰는 것과 같음
 - `e.g`<br>
 ```
val args = List(1, 2, 3, 4, 5)

for (arg <- args)
  println(arg)
```

# trait

trait은 Java에서 `interface`와 유사

`trait`에 대해 이것을 상속한 2개의 `sub trait`을 제공

 1. `immutable`
 2. `mutable`

총 3개의 `trait`이 생김 

 1. `default trait` ?
 2. `immutable trait`
 3. `mutable trait`

이 `trait`을 `extends`하거나 `mix in` 함 

# make tuple 
 scala에서 `->`을 사용하면 [Tuple](Tuple)을 생성시킴 

 ` "key" -> "value" ` 와 같이 하면 `"key"`를 `key`로 하고

 `"value"`를 `value`로 하는 `Tuple2`가 생성됨 

 `scala.PreDef`에 `ArrowAssoc class`에 `->`가 있는데 

 이 부분인 것 같음 

 `Tuple2`를 생성시키고 있음
 
# operator identifier
 하나 이상의 연산자 문자로 이루어져 있음 
 
 e.g 
 
 ```
 +  ++  ::: <?> :->
 ```

# mixed identifier
  영문자와 숫자로 이루어진 식별자의 뒤에 밑줄이고 그 뒤에 연산자 식별자
  
  e.g
  
  ```
  myvar_=
  ```
  
# literal identifier
 역따옴표(`)로 감싼 임의의 문자열
 
 ```
 `x` 
  `<clinit>`
  `yield`
 ```

# yield
`for-yield`의 경우 loop 결과를 모아서 collection을 만듬

`yield`는 순회마다 만들어내는 결과값을 모음

전체 본문의 앞에 위치해야 함

e.g
```
for {} yield [value]
for () yield [value]

for { number <- Array(1, 2, 3, 4, 5) } yield number // (1, 2, 3, 4, 5)
for ( i <- 1 to 5) yield i; // (1, 2, 3, 4, 5)

for { number <- Array(1, 2, 3, 4, 5) } yield number > 2 // (3, 4, 5)
for { number <- Array(1, 2, 3, 4, 5) } yield { number > 2 } // (3, 4, 5)
```

------
Written 12/23/16 by @loustler