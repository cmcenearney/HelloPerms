package hello

import java.util

class IterPerms[A](elements: Vector[A]) {

  def permute(): Vector[Vector[A]] = {
    var results = Vector[Vector[A]]()
    val p = new util.ArrayList[Int]()
    val n = elements.size
    0 to n foreach (i => p.add(i))
    var i = 1
    var j: Int = 0
    while (i < n) {
      p.set(i, p.get(i) - 1)
      if (i % 2 == 0) j = 0 else j = p.get(i)
      results = results :+ swap(elements, i, j)
      i = 1
      while (p.get(i) == 0){
        p.set(i, i)
        i += 1
      }
    }
    results
  }

  def swap(es: Vector[A], i: Int, j: Int): Vector[A] = {
    val tmp: A = es(i)
    val r: Vector[A] = es.updated(i,es(j)).updated(j, tmp)
    r
  }


}
