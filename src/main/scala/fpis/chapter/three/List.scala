package fpis.chapter.three

/**
  * trait   : 자료 형식을 도입할 때
  *   일종의 추상 인터페이스, 일부 메서드의 구현도 가능
  * sealed  : trait의 모든 구현이 이 파일 안에 선언되어 있어야 함
  *
  * @tparam +A : Covariant Type Parameter
  *
  * Covariant : Generics에서 type의 상속관계를 인정해주는 것
  *   ex: class Animal  class Dog extends Animal 일 경우,
  *       List[Animal]의 subtype으로 List[Dog]를 인정함(Java는 인정 안 함 => Collection과 언어의 한계)
  */
sealed trait List[+A]

/**
  * List의 두 가지 자료 생성자 ( data constructor)
  * List가 가질 수 있는 2가지 형태
  *
  * Nothing은 모든 type의 하위
  */
case object Nil extends List[Nothing]
case class Cons[+A](head: A, tail: List[A]) extends List[A]


/**
  * 동반객체(companion object)  : 자료형식과 같은 이름의 object로 자료 형식의 값들을 생성하거나 조작하는 여러 편의용 함수를 제공하는 목적으로 쓰임
  *                             관례에 가까움
  *                           =>  여기에서는 sum과 product가 해당됨(List의 동반객체)
  *
  * 패턴 부합(pattern matching) : 표현식의 구조를 따라 내려가면서 구조의 부분 표현식을 추출하는 복잡한 switch와 비슷하게 동작
  *         syntax  : return type = parameter( matching target )  match { case ~ => ~ }
  *
  * @author loustler
  * @since 11/20/2016 13:17
  */
object List {
  /**
    * Sum of Int List
    *
    * @param ints
    * @return
    *         Nil 즉 아무것도 없으면 0
    *         Nil이 아니면 합계
    */
  def sum(ints: List[Int]): Int = ints match {
    case Nil  =>  0
    case Cons(x, xs)  =>  x * sum(xs)
  }

  /**
    * Product of Double List's element
    *
    * @param doubleList
    * @return
    *         Nil이면 1.0
    *         0.0으로 시작하면 0.0
    *         그 외에는 내부 element들 곱셈 결과
    */
  def product(doubleList: List[Double]): Double = doubleList match {
    case Nil  =>  1.0
    case Cons(0.0, _) =>  0.0
    case Cons(x, xs)  =>  x * product(xs)
  }

  /**
    * A* : 0 ~ n개의 A (가변인수)
    *   =>  Java의 ... 와 유사
    *
    * @param as
    * @tparam A
    * @return
    */
  def apply[A](as: A*): List[A] =
    if (as.isEmpty) Nil
    else Cons(as.head,  apply(as.tail : _*))
}