package hello

import scala.collection.mutable

/**
 * Emulates depth-first search of the permutation space, while never expanding more than nodes than a single line from root to leaf.
 */
class PseudoRecursivePerms[A](elements: List[A]) {

  type Permutation = List[A]
  type Elements = List[A]
  type Position = Int

  case class State(perm: Permutation, els: Elements, i: Position){
    def isDone: Boolean = els.isEmpty //the elements have been completely permuted
    def isCompletelyExplored: Boolean = els.size == i //we have explored a branch for every element
  }

  val states: mutable.Stack[State] = mutable.Stack(State(List(), elements, 0))

  def hasNext: Boolean = {
    clearExploredStates()
    states.nonEmpty
  }

  def getNext: Permutation = {
    while(!states.head.isDone)
      iterateState()
    states.pop().perm
  }

  def getAll: List[Permutation] = {
    var results = Vector[Permutation]()
    while (hasNext)
      results = results :+ getNext
    results.toList
  }

  def countAll: Int = {
    var i = 0
    while(hasNext){
      getNext
      i += 1
    }
    i
  }

  private def clearExploredStates(): Unit = {
    while(states.nonEmpty && states.head.isCompletelyExplored) states.pop()
  }
  
  private def iterateState(): Unit = {
    val head: State = states.pop()
    if (head.i < head.els.size) {
      states.push(State(head.perm, head.els, head.i + 1))
      states.push(State(head.perm :+ head.els(head.i), removeAt(head.els, head.i), 0))
    }
  }

  private def removeAt(l: List[A], i: Int): List[A] = {
    val(a,b) = l.splitAt(i)
    a ++ b.tail
  }

}
