package scala.in.programming.imports

import java.util.regex

/**
  * @author loustler
  * @since 03/31/2017 21:25
  */
class ImportEx2 {
  val pat = regex.Pattern.compile("a*b")

  // Only imports Apple, Orange
  import scala.in.programming.imports.bobsdelights.fruit.Fruits.{Apple, Orange}

  import scala.in.programming.imports.bobsdelights.fruit.Fruits.{Apple => Macintosh, Orange}

  // Macintosh is alias of Apple
}