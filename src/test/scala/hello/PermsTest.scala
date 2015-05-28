package hello


import org.scalatest.FunSuite

class PermsTest extends FunSuite {

  test("simpleFunc should return 'Howdy"){
    assert(Perms.simpleFunc() == "Howdy")
  }

  test("basic string permutations"){
    val ex = List("abc","acb","bac","bca","cab","cba")
    assert(ex == Perms.permsRec1("abc"))
    assert(ex == Perms.permsRec2("abc"))
  }

}


