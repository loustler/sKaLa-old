import scala.io.Source
/**
  * @author loustler
  * @since 01/14/2017 18:21
  */

/*
 * If you want to use it, remove the comment that encloses this scala script.

def widthofLength(s: String)  = s.length.toString.length

// 예제와는 다름, travis에서 compile error를 방지 하기 위함
def wordCountInFile(fileName: String): Unit = {
  if (args.length > 0) {
    val lines = Source.fromFile(fileName).getLines().toList

    /**
      * Return longest line in lines.
      *
      * reduceLeft to LinearSeqOptimzed#reduceLeft(function)
      *
      * Reduce from left to right do function.
      *
      */
    val longestLine = lines.reduceLeft(
      (a, b) => if (a.length > b.length) a else b
    )

    val maxWidth  = widthofLength(longestLine)

    for ( line <- lines) {
      val numSpaces = maxWidth - widthofLength(line)
      val padding = " " * numSpaces
      println(padding + line.length + " | " + line)
    }
  }
  else
    Console.err.println("Please enter filename")
}
*/
