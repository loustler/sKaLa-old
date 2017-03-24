package scala.in.programming.traits.stackable

/**
  * @author loustler
  * @since 03/24/2017 21:38
  */
object QueueApp extends App{
  val number = 5
  val minusNumber = ~number+1 // It will -5

  val intQueue = new BaseIntQueue

  intQueue.push(number) // It will 5

  println("-------------------------")

  println(intQueue.pop())

  println("-------------------------")

  val doublingIntQueue = new DoublingIntQueue

  doublingIntQueue.push(number) // It will 10

  println("-------------------------")

  println(doublingIntQueue.pop())

  println("-------------------------")

  val increamentingAndFilteringIntQueue = new IncreamentingAndFilteringIntQueue

  increamentingAndFilteringIntQueue.push(number) // It will 11

  println("-------------------------")

  println(increamentingAndFilteringIntQueue.pop())

  increamentingAndFilteringIntQueue.push(minusNumber) // It will not push

  println(s"increamentingAndFilteringIntQueue's size is ${increamentingAndFilteringIntQueue.size}")

//  println(increamentingAndFilteringIntQueue.pop()) // It will throw IndexOutOfBoundException, Cause buffer is empty.

  println("-------------------------")

  val increamentingIntQueue = new IncreamentingIntQueue

  increamentingIntQueue.push(number) // It will 6

  println("-------------------------")

  println(increamentingIntQueue.pop())

  println("-------------------------")

  val filteringIntQueue = new FilteringIntQueue

  filteringIntQueue.push(number) // It will pushed

  println("-------------------------")

  println(filteringIntQueue.pop())

  filteringIntQueue.push(minusNumber) // It will not push

  println(s"filteringIntQueue's size is ${filteringIntQueue.size}")
//  println(filteringIntQueue.pop())

  println("-------------------------")


}
