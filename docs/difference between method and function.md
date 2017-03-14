# what's difference between method and function in scala

## method

```
 def increase(x: Int): Int = {
 	x + 1
 }
```

과 같은 형식을 가진 것이 `method`이며,

객체지향과 같다고 보면 될 것 같다.

## function

```
 val increase: Int => Int = x =>  x + 1
```

이와 같이 되며

`function literal`을 생각하면

이해가 잘 된다.

---
정리가 잘 된 reference가 있어서 기록

[Difference between method and function in Scala](http://stackoverflow.com/questions/2529184/difference-between-method-and-function-in-scala/19720808)

----
Written by @loustler at 14/03/17