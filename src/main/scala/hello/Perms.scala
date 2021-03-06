package hello

object Perms {

  def simpleFunc(): String =
    "Howdy"


  def permsRec1(s: String): List[String] = {
    if (s.isEmpty) List[String]("")
    else {
      for (c <- s.toList; p <- permsRec1(s.replaceFirst(c.toString, "")))
      yield c + p
    }
  }

  def permsRec2(s: String): List[String] = {
    s match {
      case "" => List("")
      case _ => {
        for (c <- s.toList; p <- permsRec2(s.replaceFirst(c.toString, "")))
        yield c + p
      }
    }
  }

//  def permsRec3(s: String): List[String] = {
//    var results: scala.collection.mutable.Set[String] = scala.collection.mutable.Set()
//    def go(int: String, chars: List[Char], results: scala.collection.mutable.Seq[String]): Unit = {
//      if (chars.isEmpty) results
//    }
//  }

}
