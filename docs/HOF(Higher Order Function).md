# 고차함수 일반화
 목록의 요소들에 대해 특정 연산(함수)을 수행하여 결과를 반환하는 과정을 하나의 고차함수로 일반화 할 수 있다.

```
// 목록 요소들의 합을 구하는 함수: 초기값(0), 빈 목록인 경우 초기값을 바로 반환
def sum(ints: List[Int]): Int = ints match {
  case Nil => 0
  case Cons(x, xs) => x + sum(xs)
}
```

```
// 목록 요소들의 곱을 구하는 함수: 초기값(1.0), 빈 목록인 경우 초기값을 바로 반환
def product(ds: List[Int]): Double = ds match {
  case Nil => 1.0
  case Cons(x, xs) => x * product(xs)
}
```

- 두 함수를 비교해서 중복되는 부분과 `변화하는 부분`을 살펴본다.
- 일단 전체 구조는 비슷한데 패턴 부합 내부의 Nil 인 경우를 비교해 보면 반환하는 값이 다르다.
- Cons(x, xs) 인 경우를 보면 리스트의 head 요소에 나머지 요소에 대한 계산 결과를 합(곱)한다.

> `sum과 product 의 함수 중 차이가 나는 부분`

- // sum
- case Nil => `0`
- case Cons(x, xs) => x `+ sum`(xs)
- // product
- case Nil => `1.0`
- case Cons(x, xs) => x `* product`(xs)

- 두 함수에서 중복되는 부분을 추출하고 변화하는 부분을 인수로 받게 하여 일반화한 함수를 만들 수 있다.

```
// 초기값 z에서 시작하여 목록의 요소에 특정 연산(f)을 수행해서 결과(:B)를 내는 함수
def foldRight[A,B](as: List[A], z:B)(f: (A,B) => B) = as match {
  case Nil => z
  case Cons(x, xs) => f(x, foldRight)(xs, z)(f))
}
``` 

- 목록에 대한 처리를 일반화한 foldRight 함수를 사용해 sum과 product 함수를 다시 정의할 수 있다.

```
def sum2(ints: List[Int]) = foldRight(ints, 0)((a,z) => a+z)
def product2(ds: List[Double]) = foldRight(ds, 1.0)((a,z) => a*z)
```

## 계산 순서 살펴 보기

### sum
> `sum(List(1,2,3))`
- 1 + sum(List(2,3))
- 1 + 2 + sum(List(3))
- 1 + 2 + 3 + sum(Nil)
- 1 + 2 + 3 + 0
- 1 + 2 + 3
- 1 + 5
- 6

### foldRight
> `foldRight(List(1,2,3), 0)((a,b) => a+b)`
- f( 1, foldRight(List(2,3), 0)(f) )
- f( 1, f( 2, foldRight(List(3),0)(f) ) )
- f( 1, f( 2, f( 3, foldRight(Nil,0)(f) ) ) )
- f( 1, f( 2, f( 3, 0 ) ) )
- f( 1, f( 2, (3,0) => 3+0 ) )
- f( 1, f( 2, 3 ) )
- f( 1, (2,3) => 2+3 )
- f( 1, 5 )
- (1,5) => 1+5
- 6

---------------------
출처 : [스칼라 스터디](https://github.com/codechobostudy/study-dev-scala/wiki/고차함수-일반화)