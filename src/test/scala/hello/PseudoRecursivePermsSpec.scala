package hello

import org.scalatest.{Matchers, WordSpecLike}

class PseudoRecursivePermsSpec extends WordSpecLike with Matchers{

  "PseudoRecursivePerms" when {
    "initialized with (a,b,c)" should {
      val abc = List('a','b','c')
      val prp = new PseudoRecursivePerms(abc)
      "return true for hasNext" in {
        prp.hasNext should be(true)
      }
      "generate all permutations" in {
        prp.getNext should be(abc)
        prp.getNext should be(List('a','c','b'))
        prp.getNext should be(List('b','a','c'))
        prp.getNext should be(List('b','c','a'))
        prp.getNext should be(List('c','a','b'))
        prp.getNext should be(List('c','b','a'))
      }
      "then return false for hasNext" in {
        prp.hasNext should be(false)
      }
    }
    "initialized with (a,b)" should {
      val prp = new PseudoRecursivePerms(List('a','b'))
      "getAll" in {
        prp.getAll should be(List(List('a','b'), List('b','a')))
      }
    }
    "given a larger input" should {
      "do ok" in {
        //pending
        val p = new PseudoRecursivePerms(List(1,2,3,4,5,6,7,8,9,10,11)) //12,13,14,15,16,17,18,19,20))
        println(p.countAll)
      }
    }
  }
}
