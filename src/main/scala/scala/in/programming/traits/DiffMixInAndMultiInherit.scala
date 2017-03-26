package scala.in.programming.traits

class A {
  print("A")

  def m(msg : String) { print(s"${msg}A") }
}

trait H {
  print("H")

  def m(msg : String) { print(s"${msg}H") }
}

trait S extends H {
  print("S")

  abstract override def m(msg : String) { super.m(msg + "S") }
}

trait R {
  print("R")

  def m(msg : String) { print(s"${msg}R") }
}

trait T extends R with H {
  print("T")

  abstract override def m(msg : String) { super.m(msg + "T") }
}

class B extends A with T with S {
  print("B")

  override def m(msg : String) { super.m(msg + "B") }
}

/**
  * @author loustler
  * @since 03/26/2017 16:57
  */
object DiffMixInAndMultiInherit extends App {
  println("How to print when use operator of new that create instance of class.")
  val b = new B // What print?
  println("\n-------------------------")
  println("How to print when use method of m that ordered by class linearization on scala.")
  b.m("") // What print? Check right that.
}
