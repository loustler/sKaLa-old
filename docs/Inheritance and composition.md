# Inheritance 

## Abstract 
`abstract class Clazz`로 정의할 경우, 

`Declaration`만 하고 `Definition`은 하지 않는 경우 

`abstract method`로 간주된다.

`Definition`을 할 경우 일반적인 `method`가 된다

## Empty-paren Method
빈 괄호가 있는 method가 자주 등장하게 된다.

관례상 `getter`와 같은 method 종류(field를 read만 하는 경우)는 empty-paren method(빈 괄호 메서드)를 

사용하는 경우가 많다.

이것은 필드(field)나 메서드(method) 중 어떤 방식으로 attribute를 정의하더라도 

client code에는 어떠한 effect를 끼치지 말아야 한다는 

**단일 접근 원칙**에 부합함.

`Scala`에서는 `()`를 생략할 수 있는데 

다음과 같은 경우는 보다 나은 가독성을 위해서 `()`를 사용하는 것이 좋다

1. 함수 호출이 호출 대상 객체(Receiver)의 property에 접근하는 것 이상의 작업을 수행한다면 
   1. `method`가 `I/O` 작업을 수행
   2. `var` variable을 재할당(reallocate)
   3. 직/간접적으로(direct/indirect) mutable 객체를 통해 호출 대상의 field 외의 var 변수를 읽는 경우

위 조건은 즉

> side-effect가 없고 `argument`가 없으면 `()`를 아예 주지도 말고 쓰지도 마라

는 것이다.

## Extends Class
 `extends`를 생략하면 (`extends`가 없을 경우)

 `Java`에서는 `extends Object`를 compiler가 추가해주는 것처럼

 `Scala`에서는 `extends AnyRef`를 compiler가 추가해준다(상속한다고 가정한다고 하나 추가해주는 게 아닐까 생각됨)

-----
# Composition

## name space
`Java`는 4개의 name space가
`Scala`는 2개의 name space가 있다.

 - Java 
  1. field
  1. method 
  1. type
  1. package
 - Scala
  1. Value
     1. field
     1. method
     1. package
     1. singleton object
  1. type
     1. class
     1. trait name


-----
Written by @loustler at 28/02/17