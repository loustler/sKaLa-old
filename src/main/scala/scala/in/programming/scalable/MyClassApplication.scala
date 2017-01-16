package scala.in.programming.scalable

/**
  * @author loustler
  * @since 01/07/2017 23:18
  */
object MyClassApplication extends App {
  val myClazz = new MyClazz(0, "lousTler")
  val myKlass = new MyKlass(1, "lOuslter")

  println(myClazz.nameHasUpper())
  println("---------------------")
  println(myKlass.nameHasUpper)

  val myClazz2 = new MyClazz(0, "loustler")
  val myKlass2 = new MyKlass(0, "loustler")

  println("----------------------")
  println(myClazz2.nameHasUpper())
  println("----------------------")
  println(myKlass2.nameHasUpper)

}
