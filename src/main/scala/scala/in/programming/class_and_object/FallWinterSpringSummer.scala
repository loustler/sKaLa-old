package scala.in.programming.class_and_object

import scala.in.programming.class_and_object.ChecksumAccumulator.calculate

/**
  * Application을 상속하는 것이 main method를 사용하는 것보다 더 안 좋은 점
  *
  * Wiki 보기
  *
  * @author loustler
  * @since 01/20/2017 00:18
  */
object FallWinterSpringSummer extends App {
  for ( season <- List("fall", "winter", "spring") )
    println(season + ": " + calculate(season))
}
