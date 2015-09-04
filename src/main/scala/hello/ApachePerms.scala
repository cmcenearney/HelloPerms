package hello

import java.util

import org.apache.commons.collections4.iterators.PermutationIterator

class ApachePerms[A](elements: List[A]) {

  val i: PermutationIterator[A]  = new PermutationIterator[A](list2List(elements))

  def getAll: util.ArrayList[util.List[A]] = {
    val results = new util.ArrayList[util.List[A]]()
    while (i.hasNext){
      results.add(i.next)
    }
    results
  }

  def countAll: Int = {
    var n: Int = 0
    while(i.hasNext){
      i.next()
      n +=1
    }
    n
  }

  def list2List(l: List[A]): java.util.ArrayList[A] = {
    val jerva = new util.ArrayList[A]()
    l.foreach(i => jerva.add(i))
    jerva
  }

}
