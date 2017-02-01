# Exception 

Scala에서는 Exception도 Return type을 가짐 

> `If`가 값을 return하게 설계되면서 `if`와 같은 분기에서 throw Exception시 값을 return 해줄 수 없기 때문에 문법의 조화를 위해 Exception도 return type을 가지며, 그 타입은 `Nothing`이다 

`throw`도 표현식으로 취급함
 

# You don't worried about checked Exception.

`catch` block으로 감싸거나 

`throws`를 method signature에 추가할 필요가 없으며

원한다면 `@throws`를 붙일 수 있음 

# Scala always ignore values in finally blocks

스칼라는 `try-catch-finally` block 중에 

`finally` block에서 발생되는 값을 무시함 

```
def eg(): Int = try { 1 } finally { 2 } // It'll be 1
```







-----------
Written by @loustler at 02/01/2017