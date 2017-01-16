# Scala에서의 여러가지 관례
1. [루프용 보조함수](#루프용-보조함수)
1. [변수 명명](#변수명명)
1. [콜론(:)](#colon)


## 루프용 보조함수
루프용 보조함수는 `go`, `loop`를 명시적으로 사용

## 변수명명
고차함수의 인수(parameter or argument)에는 `f`, `g`, `h` 와 같은 변수명을 사용
인수가 실제로 수행하는 일을 알지 못하기 때문에 짧은 변수명을 부여하는 것으로 추정

## colon
 메서드 이름이 콜론(:)으로 끝나면 

> 연산자 방식으로 사용시 오른쪽 피연산자에 대해 호출

e.g 

```
val twoThree = List(2, 3)
1 :: twoThree ( == twoThree.::(1) 으로 해석 )
```