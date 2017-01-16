## 함수형 프로그래밍이란

> 함수형 프로그래밍(functional programming, FP)는 프로그램을 오직 순수 함수(pure function)들로만, 작성된다.  
다시 말해서 부수효과(side effect)가 없는 함수들로만 구축한다는 것이다.

이 철학을 OOP(Object Oriented Programming)에 적용하면,

`Immutable Object`를 의미

## `부수효과란`

> 결과를 돌려주는 것 이외의 어떤 일 을 말한다.

* 변수를 수정한다.
* 자료구조를 제자리에서 수정한다.
* 객체의 필드를 설정한다.
* 예외(exception)를 던지거나 오류를 내면서 실행을 중단한다.
* 콘솔에 출력하거나 사용자의 입력을 읽어들인다.
* 파일에 기록하거나 파일에서 읽어들인다.
* 화면에 그린다.

## 예제 코드
```
 class cafe {
   def buyCoffee(cc: CreditCard): Coffee = {
     val cup = new Coffee()
     cc.charge(cup.price)
     cup
   }
 }
```
> `cc.charge(cup.price)`가 부수 효과의 예이다.  신용카드 청구(charge)에는 외부 세계와의 일정한 상호작용이 관여한다.  

##  부수효과 제거
```
 class Cafe {
   def buyCoffee(cc: CreditCard): (Coffee, Charge) = { 
     val cup = new Coffee()
     (cup, Charge(cc, cup.price))
   }
 }
```
```
  case class Charge(cc: CreditCard, amount: Double) {
    def combine(other: Charge): Charge =
    if (cc == other.cc)
      Charge(cc, amount + other.amount)
    else
     throw new Exception("Cant't combine charges to different cards")
  }
```

### 여러잔의 커피를 구매하는 buyCoffees
```
 class Cafe {
  def buyCoffee(cc: CreditCard): (Coffee, Charge) = ... 
  def buyCoffee(cc: CreditCard, n: Int): (List[Coffee], Charge) = {
    val purchases: List[(Coffee, Charge)] = List.fill(n)(buyCoffee(cc))
    val (coffees, charges) = purchases.unzip
     (coffees, charges.reduce((c1, c2) => c1.combine(c2)))
  }
 }
```

---------------------------------

출처 : [스칼라 스터디](https://github.com/codechobostudy/study-dev-scala/wiki/함수형-프로그래밍이란-무엇인가%3F)
-------
Modify 01/13/17 by @loustler