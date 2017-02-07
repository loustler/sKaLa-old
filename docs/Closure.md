# Closure



```
 (x: Int) => x + more 
```

이와 같은 함수값(function literal)이 있을 때, 

`x`는 function literal의 scope에서만 의미가 있으므로

`bound varaible`(바운드 변수)라고 함

`more`은 function literal에서 정의(define)한 게 아니고

다른 scope에서 변경된 것이고 변경될 여지가 있기 때문에 

`free varaible`(자유 변수)라고 함

```
var more = 1

val addMore = (x: Int) => x + more 

addMore(1)
```

일 때 

addMore를 `closure`라고 함 

`closure`는 변수가 참조하는 값이 아니라 변수 자체를 `capture`함 

그래서 아래와 같이 `free variable`의 변화가 생겼을 때 `capture`할 수 있음

```
var more = 1

val addMore = (x: Int) => x + more 

println(addMore(1))

more = 9999

println(addMore(1))
```

이럴 경우 `more`이 9999로 변경되었을 때 

`closure`가 변화를 `capture`한다 

# Closed Term

만약 

`(x: Int) => x + 1`
이라면 `free variable`이 없으므로 

`closed term`(닫힌 코드 조각)이라고 함 


# Open Term

위의 `closed term`과 달리 

`(x: Int) => x + more`

위와 같이 `free variable`이 있으면

`Open Term` 이라고 함 


----
Written by @loustler at 02/07/17 