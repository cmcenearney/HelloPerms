package hello

import scala.collection.mutable.ListBuffer

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

  def javaLike(s: String): List[String] = {
    def removeOne[T](l : List[T], i: T): List[T] = {
      val results = ListBuffer[T]()
      results.re
      for(el <- l){
        if (el == i)
      }

    }
    val results = ListBuffer[String]()
    def go(s: String, els: List[Char], results: ListBuffer[String]): Unit = {
      if (els.isEmpty) {
        results += (s)
        return
      } else {
        for (c <- els) {
          go(s+c, els.toArray.(c), results)
        }
      }
    }
    results.toList
  }

//  def permsRec3(s: String): List[String] = {
//    var results: scala.collection.mutable.Set[String] = scala.collection.mutable.Set()
//    def go(int: String, chars: List[Char], results: scala.collection.mutable.Seq[String]): Unit = {
//      if (chars.isEmpty) results
//    }
//  }

}
