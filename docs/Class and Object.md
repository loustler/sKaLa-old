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


-------------
Written 01/17/2017 by @loustler