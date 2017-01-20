# Scala에서의 여러가지 관례
1. [루프용 보조함수](#루프용-보조함수)
1. [변수 명명](#변수명명)
1. [콜론(:)](#colon)
1. [세미콜론(;)](#semicolon)


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

## semicolon
 세미콜론의 추론규칙 
 
 다음과 같은 3가지의 경우가 아니면 세미콜론과 똑같이 취급
 
 1. 어떤 줄이 어떤 명령을 끝낼 수 있는 단어로 끝나지 않음. 즉 마침표(.)나 중위 연산자 등이 줄의 끝에 있다
 1. 다음 줄의 맨 앞장이 문장을 시작할 수 없는 단어로 시작
 1. 줄이 `(...)` 같은 parentheses 사이나 `[...]` 같은 brackets 사이에서 끝 
 
# Always auto import

스칼라는 

    1.  `java.lang` 
    2.  `scala`
    
package 아래에 있는 Member를 import 함


# Class name equal File name

일치하지 않아도 사용가능함 

`Java`는 Class name과 File name이 일치해야 하지만,

`Scala`는 그렇지 않음

그러나 `Java`와 같이 Class name과 File name을 일치시키도록 권장함

[Scala Code Style Guide](http://docs.scala-lang.org/style/files)