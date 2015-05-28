package hello

import org.scalatest.FunSuite

class PermsTest extends FunSuite {

  test("simpleFunc should return 'Howdy"){
    assert(Perms.simpleFunc().equals("Howdy"))
  }

  test("basic string permutations"){
    val ex = List("abc","acb","bac","bca","cab","cba")
    assert(ex.equals(Perms.permsRec1("abc")))
    assert(ex.equals(Perms.permsRec2("abc")))
  }

}


