# Tail Recursion 

꼬리재귀는 함수의 마지막 부분에서 호출할 때를 말한다 

```
def decrease(x: Int, y: Int) : Int =
  if ( y == 0 ) x 
  else decrease(x-1, y-1)
```

여기에서 else 이후가 꼬리재귀이다 

# Optimization
꼬리재귀를 스칼라 컴파일러가 최적화한다

최적화시 추가적인 스택 프레임을 만들지 않고 

기존 스택프레임을 재활용한다

# Limit
꼬리재귀는 동일한 함수를 직접 재귀호출하는 경우에만 최적화를 할 수 있다


-----
Written by @loustler at 02/08/17