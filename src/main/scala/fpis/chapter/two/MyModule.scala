package fpis.chapter.two

/**
  * object == module
  *
  * object keyword는 singleton 인스턴스를 생성함
  * Scala에서는 Java의 static에 해당하는 Keyword가 없으며 유사하게 사용하기 위해 object를 사용.
  *
  * @author Loustler
  * @since 9/23/16
  */
object MyModule {
  /**
    *
    * @param n (Int type)
    * @return if n < 0 : -n ? n; (Int type)
    */
  def abs(n : Int): Int =
  if (n < 0) -n
  else  n

  /**
    *
    * @param x (Int type)
    * @return The absolute value of x is x
    */
  private def formatAbs(x: Int) = {
    val msg = "The absolute value of %d is %d";
    msg.format(x, abs(x))
  }

  /**
    * 고차함수(higher-order function, HOF) | 고계함수
    * : 다른 함수를 인수로 받는 함수
    *
    * 안에 있는 go 함수는 지역적인 함수로 지역변수와 다를바 없다.
    *
    * 통상적으로 factorial과 같은 루프용 보조함수에는 go 나 loop 같은 이름을 명시
    *
    * @param n
    * @return
    */
  def factorial(n: Int): Int = {
    @annotation.tailrec
    def go(n: Int, acc: Int): Int =
      if (n <= 0) acc
      else go(n-1, n*acc)

    go(n,1)
  }

  /**
    * exercise 2-1
    * n번째 피보나치 수 반환
    *
    * @param number
    * @return
    */
  def fib(number: Int): Int = {
    def loop(n: Int): Int = {
      if(n <= 1) n
      else loop(n-1)+loop(n-2)
    }

    loop(number)
  }

  /**
    * first higher-order function
    *
    * @param n
    * @return
    */
  private def formatFactorial(n: Int) = {
    val msg = "The factorial of %d is %d."
    msg.format(n, factorial(n))
  }

  /**
    * Use higher-order function
    *
    *
    * @param name String
    * @param n Int
    * @param f function | parameter : Int return : Int like : abs, factorial
    * @return String
    */
  def formatResult(name: String, n:Int, f: Int => Int) = {
    val msg = "the %s of %d is %d"
    msg.format(name, n, f(n))
  }

  /**
    * Scala의 Unit은 Java의 void와 같다
    *
    * @param args
    */
  def main(args: Array[String]): Unit = {
    // equal
    println(formatAbs(-42))
    println(formatResult("absolute value", -42, abs))
    println(formatFactorial(7))
    println(formatResult("factorial", 7, factorial))
  }
}
