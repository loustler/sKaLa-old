# Partially Applied Function 

부분 적용함수는 함수에 Parameter의 개수를 모두 제공하지 않고,

Arguments를 제한하여 제공하여 Function을 returns 

말그대로 

> 부분적으로만 적용한 함수

이다

Example 

```
def sum(a: Int, b: Int, c: Int) = a + b + c

sum _  // Provide nothing as arguments

sum(1, _: Int, 3) // Provide 2 values as arguments out of 3 parameters.
```

-------

Written by @loustler at 02/04/17