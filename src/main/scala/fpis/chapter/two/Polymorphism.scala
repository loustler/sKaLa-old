package fpis.chapter.two

import scala.annotation.tailrec

/**
  * Chapter 2-5 Polymorphism Function
  *
  * FP에서의 다형성은 OOP에서의 다형성과 다르다
  * OOP에서의 다형성은 하위형식화 혹은 상속 관계를 나타내지만
  * FP에서는 인터페이스나 하위형식화가 전혀 없다 매개변수적 다형성(parametric polymorphism)이라 한다.
  *
  * @author loustler
  * @since 10/03/2016 15:44
  */
object Polymorphism {

  /**
    * 다형성 적용 전
    *
    * @param ss
    * @param key
    * @return
    */
  def findFirst(ss: Array[String], key: String): Int = {
    @annotation.tailrec
    def loop(n: Int): Int = {
      if (n >= ss.length) -1
      else if (ss(n) == key) n
      else loop(n+1)
    }

    loop(0)
  }

  /**
    * 다형성 적용 후 (다형적 함수 중 일반적 함수)
    * A는 타입을 의미하며
    * Java의 Generics 중 T와 비슷한 걸로 보임
    *
    * Parameter 중 p 는 A => Boolean으로 되어 있는데 이것은,
    * 고차원 함수에서 사용하는 함수를 파라미터로 넘기는 것이다
    * 즉, type A에서 Boolean을 return하는 메서드를 parameter로 넘겨야 된다
    *
    * @param as Array
    * @param p Array's Key
    * @tparam A Type
    * @return Int
    */
  def findFirst[A](as: Array[A], p: A => Boolean): Int = {
    @tailrec
    def loop(n: Int): Int =
      if (n >= as.length) -1
      else if (p(as(n)))  n
      else loop(n+1)

    loop(0)
  }

  /**
    * Loop를 돌면서 Index 0부터 체크
    * Type은 parameter 두개가 동일 해야됨
    * ordered는 anonymous function으로 처리
    *
    * @param as
    * @param ordered
    * @tparam A
    * @return
    */
  def isSorted[A](as: Array[A], ordered: (A,A) => Boolean): Boolean = {
    @tailrec
    def loop(n: Int): Boolean =
      if (n >= as.length-1) true
      else if (!ordered(as(n), as(n+1))) false
      else loop(n+1)

    loop(0)
  }

  def main(args: Array[String]): Unit = {
    var a = Array[String]("one", "two", "three", "four", "five")
    val b = Array("a", "b", "c", "d")
    val k = "four"

    println(findFirst(a, k))
    println(findFirst[String](a, k.equals))
    println(isSorted(b, (x: String, y: String)=> x < y))

  }
}
