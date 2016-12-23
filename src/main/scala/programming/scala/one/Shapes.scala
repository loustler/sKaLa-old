package programming.scala.one

/**
  * AKKA의 Actor를 확인하기 위한 예제
  * Actor Model of Concurrency(동시성 액터 모델)
  *
  * Actor라는 서로 아무런 상태 정보를 교환하지 않는 독립적인 요소가 존재
  *
  * @author loustler
  * @since 12/23/2016 15:27
  */
abstract class Shapes {
  def draw(f: String => Unit): Unit = f(s"draw: ${this.toString}")
}

/**
  * case class Point의 동반객체가 다음과 같이 만들어짐
  * Generate가 내부적으로 된다고 생각하면 됨 case class에 한해서
  */
/*
object Point {
  def apply(x: Double = 0.0, y: Double = 0.0): Point = new Point(x, y)
}
*/

case class Point(x: Double = 0.0, y: Double = 0.0)

case class Circle(center: Point, radius: Double) extends Shapes

case class Rectangle(lowerLeft: Point, height: Double, width: Double) extends Shapes

case class Triangle(point1: Point, point2: Point, point3: Point) extends Shapes

