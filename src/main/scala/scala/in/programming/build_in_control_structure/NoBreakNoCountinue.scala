package scala.in.programming.build_in_control_structure

/**
  * @author loustler
  * @since 02/02/2017 01:09
  */
object NoBreakNoCountinue extends App{
  /**
    * These Java Code
    * int i = 0;
    * boolean foundIt = false;
    *
    * while (i < args.length) {
    *   if (args[i].startsWith("-")) {
    *      i = i + 1;
    *      continue;
    *   }
    *   if (args[i].endsWith(".scala")) {
    *      foundIt = true;
    *      break;
    *   }
    *   i = i + 1;
    * }
    *
    * To scala code ...
    *
    */

  // Just to scala code..
  var i = 0
  var foundIt = false

  while ( i < args.length && !foundIt) {
    if (!args(i).startsWith("-")) {
      if (args(i).endsWith(".scala"))
        foundIt = false
    }
    i = i + 1
  }



  // But If change to recursive ?
  def searchFrom(j: Int): Int =
    if ( j >= args.length) -1
    else if (args(j).startsWith("-")) searchFrom(j + 1)
    else if (args(j).endsWith(".scala")) j
    else searchFrom(j + 1)

  val j =searchFrom(0)
}
