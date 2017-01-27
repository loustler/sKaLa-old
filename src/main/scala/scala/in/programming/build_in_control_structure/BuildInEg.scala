package scala.in.programming.build_in_control_structure

/**
  * @author loustler
  * @since 01/26/2017 21:13
  */
object BuildInEg extends App {
  val argz = Array[String]("BuildInEg", "build_in_control_structure")

  val fileName =
    if ( !argz.isEmpty ) argz(0)
    else "deafult"

  printf("check fileName is %s\n", fileName)

  val one = 120L

  val two = 150L

  val numberList = Array(1, 2, 3, 4, 5)

  printf("%d, %d Greatest Common Divisor is %d", one, two, gcdLoop(one, two))

  val languages = Array("scala", "java", "ruby", "python", "javascript", "SQL", "go", "swift", "c")

  println("---Loop range use for syntax start -----")

  // Loop range use for syntax
  for ( i <- 1 to 4 )
    println(i)

  println("---Loop range use for syntax end -----")

  println("---Loop range which exclude max value use for syntax start -----")

  // Loop range which exclude max value use for syntax
  for ( i <- 1 until 4 )
    println(i)

  println("---Loop range which exclude max value use for syntax end -----")

  println("---Functional Programming recommend to want use loop like below start -----")

  // Functional Programming don't recommend to use loop like below
  def gcdLoop(x: Long, y: Long): Long = {
    var a = x

    var b = y

    while ( a != 0 ) {
      val temp = a

      a = b % a

      b = temp
    }

    b
  }

  println("---Functional Programming recommend to want use loop like below end-----")

  println("---Not use like in scala start-----")

  // Not use like in scala
  for ( i <- 0 to numberList.length - 1 )
    println(numberList(i))

  println("---Not use like in scala end-----")

  println("---Filter case 1 start-----")

  // Filter case 1
  for ( i <- numberList if i > 3 )
    println(i)

  println("---Filter case 1 end-----")

  println("---Filter case 2 start-----")

  // Filter case 2
  for ( i <- numberList )
    if ( i > 3 )
      println(i)

  println("---Filter case 2 end-----")

  println("---Filter case 3 start-----")

  // Filter case 3
  for (
    i <- numberList
    if i > 2
    if i < 5
  ) println(i)

  println("---Filter case 3 end-----")


  println("---Twice loop start -----")

  // Functional Programming recommend to want use loop like below
  def gcd(x: Long, y: Long): Long =
    if ( y == 0 ) x else gcd(y, x % y)

  for (
    i <- numberList
    if i < 4;
    j <- languages
    if j != "java"
  ) printf("number : %d , String : %s\n", i, j)

  println("---Twice loop end-----")

  println("---Value binding in for loop start-----")

  // Binding value in for loop
  for {
    str <- languages
    if str.length > 5
    longStr <- str.toUpperCase
  } printf("%s upperCase %s\n", str, longStr)

  println("---Value binding in for loop end-----")

  println("---create new collection in for loop start-----")

  // Create new collection in for loop
  val yieldResult = for {
    language <- languages
    if language.length > 1
  } yield language

  println("--------------------")

  println("original collection")

  languages.foreach(println)

  println("--------------------")

  println("yield result")

  yieldResult.foreach(println)

  println("--------------------")

  println("---create new collection in for loop end-----")
  
}
