# class hierarchy of scala

![Class hierarchy of Scala](https://github.com/loustler/scala/blob/master/src/main/resources/images/class-hierarchy-of-scala.jpg)

## Any
 공통 super class (like `Object` in Java)

### AnyVal
 내장 값 클래스의 Super class

 e.g `Byte`, `Short`, `Char`, `Int`, `Long`, `Float`, `Double`, `Boolean`, `Unit` (like boxing class in java and primitive type)a


`Byte`, `Short`, `Char`, `Int`, `Long`, `Float`, `Double`, `Boolean`은 runtime시 Java primitive type으로 변환

이 sub-class들에는 relation이 없으나 widening이 가능(묵시적 형변환)

e.g `Int` to `Long`

### AnyRef

`Object`의 alias와 같음

모든 `class`는 `AnyRef`를 extends(Java에서 `Object`를 extends 하는 것과 동일)


## Null
 null의 reference type

 모든 reference type의 sub-class

 값 타입과는 호환성이 없으며 변수에 할당할 수 없음

## Nothing
 모든 다른 타입의 sub-type

 값이 존재 하지 않으며 비정상적인 종료를 표현할 때 사용(Exception or Error)

 다음과 같은 상황에서 유용

 ```
  def divide(x: Int, y: Int): Int = 
    if ( y != 0 ) x / y
    else sys.error("Can't divide by zero")
 ```

 `Nothing`은 모든 타입의 sub-type 이므로 Int가 될 수 있음

 `if .. else if .. else`가 `Scala`에서는 값을 반환하기 때문에 이런 `Nothing`을 이용해서 일관성을 유지하는 것으로 보여짐

 

---
Written by @loustler at 16/03/2017
