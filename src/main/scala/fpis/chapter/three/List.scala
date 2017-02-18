package fpis.chapter.three

import scala.annotation.tailrec

/**
  * trait   : 자료 형식을 도입할 때
  * 일종의 추상 인터페이스, 일부 메서드의 구현도 가능
  * sealed  : trait의 모든 구현이 이 파일 안에 선언되어 있어야 함
  *
  * @tparam + A : Covariant Type Parameter
  *
  *           Covariant : Generics에서 type의 상속관계를 인정해주는 것
  *           ex: class Animal  class Dog extends Animal 일 경우,
  *           List[Animal]의 subtype으로 List[Dog]를 인정함(Java는 인정 안 함 => Collection과 언어의 한계)
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
  * 관례에 가까움
  * =>  여기에서는 sum과 product가 해당됨(List의 동반객체)
  *
  * 패턴 부합(pattern matching) : 표현식의 구조를 따라 내려가면서 구조의 부분 표현식을 추출하는 복잡한 switch와 비슷하게 동작
  * syntax  : return type = parameter( matching target )  match { case ~ => ~ }
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
    * Nil 즉 아무것도 없으면 0
    * Nil이 아니면 합계
    */
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case Cons(x, xs) => x * sum(xs)
  }

  /**
    * The product of all of the double in list.
    *
    * @param doubleList List of Double
    * @return
    * if doubleList is Nil returns 1.0
    * if doubleList start with 0.0 returns 0.0
    * and another case, The product of all of the elements.
    */
  def product(doubleList: List[Double]): Double = doubleList match {
    case Nil => 1.0
    case Cons(0.0, _) => 0.0
    case Cons(x, xs) => x * product(xs)
  }

  /**
    * A* : 0 ~ n개의 A (가변인수)
    * =>  Java의 ... 와 유사
    *
    *
    * @param as
    * @tparam A
    * @return
    */
  def apply[A](as: A*): List[A] =
    if ( as.isEmpty ) Nil
    else Cons(as.head, apply(as.tail: _*))

  /**
    * Remove fist element at List.
    *
    * @param l List of A type.
    * @tparam A Some types.
    * @return Returns result of remove first element at list.
    */
  def tail[A](l : List[A]): List[A] = l match {
    case Nil => Nil
    case Cons(h, t) => t
  }


  /**
    * First elements in list.
    *
    * @param l List of A types.
    * @tparam A Some types.
    * @return returns first element.
    */
  def head[A](l: List[A]): A = l match {
    case Cons(h, t) => h
  }


  /**
    * Set element as first element to list.
    *
    * @param x Set elements.
    * @param l List of A types.
    * @tparam A Some types.
    * @return Returns result of change first element.
    */
  def setHead[A](x: A, l: List[A]): List[A] = l match {
    case Nil => Cons(x, Nil)
    case Cons(h, t) => Cons(x, t)
  }


  /**
    * Removes elements from list.
    *
    * @param l List of A types.
    * @param n Count of removes to elements.
    * @tparam A Some type.
    * @return Result of removes elements in list.
    */
  def drop[A](l: List[A], n: Int): List[A] = l match {
    case Nil => Nil
    case Cons(h, t) => if ( n > 0 ) drop(t, n - 1) else l
  }


  /**
    * Removes elements from list if HOF returns true.
    *
    * @param l List of A types.
    * @param f Predicate function.
    * @tparam A Some type.
    * @return Result of remove elements until f returns true.
    */
  def dropWhile[A](l: List[A], f: A => Boolean): List[A] = l match {
    case Nil => Nil
    case Cons(h, t) => if(f(h)) dropWhile(t, f) else l
  }


  def init[A](l: List[A]): List[A] = l match {
    case Nil => Nil
    case Cons(h, Nil) => Nil
    case Cons(h, t) => Cons(h, init(t))
  }
}

object Main extends App {
  var t: List[Int] = Cons(1, Cons(2, Cons(3, Cons(4, Nil))))

  var ta: List[Int] = List(1, 1, 1, 2, 1, 1)

  println(List.drop(t, 1))

  println(List.dropWhile(ta, (x :Int) => x == 1))

  println(List.init(t))
}