# Template
```
class User() {
  private var name: String = "";
  private var age: Int = 0;

  def getAge(): Int = this.age;

  def getName(): String = this.name;

  def setAge(age: Int) = this.age = age;

  def setName(name: String) = this.name = name;

  override def toString: String = {
    return " age : " + this.age.toString + ", name : " + this.name;
  }
}
```

매우 간단한 예제이며 

`class`안에 있는 `field`와 `method`를 `member`라고 함 

`field`는 `var`나 `val`로 정의하며 객체를 나타내는 변수 ( == instance 변수 )

`access modifier`의 기본은 `public`(In scala)

# method

`method`에서 `parameter`(`argument`)는 `val`이지 `var`가 아님

> 즉, 변경 불가능한 `immutable`

또한,

Scala에서 `method` 작성시 아래와 같이 권장

1. `return`을 명시하지 않음
2. `return`을 여러번 사용하지 않음


`def setName(name: String) = this.name = name;`

같은 경우 `return type`이 명시되지 않고 한 줄로 작성되었는데 이 경우

`compiler`는 `Unit`으로 판단하며,

이 경우는 `side-effect`를 사용한다는 것을 의미

마치 `procedure`처럼 보임 

> `procedure`는 오직 `side-effect`를 얻기 위해서만 사용하는 `method`를 의미

`def setAge(age: Int) {this.age = age}` 같은 경우에도 `Unit`으로 `return type` 판정

등호(`=`)가 빠졌기 때문에 ...

# Object 

Singleton 을 사용할 때 사용하며 Scala에서 제공하는 Singleton Object

> static method를 모아놓은 집합체 

라고 생각해도 됨 

`object` keyword가 있는 Singleton object는 

 1. first-class
 2. super class를 extend 하거나 trait을 mix-in 할 수 있음 

class와 singleton의 차이점은 

> Singleton은 parameter를 받을 수 없고 class는 받을 수 있다

는 것이다

Singleton은 new로 instance화를 할 수 없기 때문에(당연한 말)

parameter를 singleton에 넘길 방법이 없다는 것

compiler는 각 singleton object를 synthetic class의 instance로 구현하고 

정적변수가 이것을 참조함

companion class가 없는 singleton object는 standalone object라고 함

목적은

    1. utility method를 모으거나 
    2. scala application의 진입점을 만들 때 사용
    
 
-------------
Written 01/17/2017 by @loustler