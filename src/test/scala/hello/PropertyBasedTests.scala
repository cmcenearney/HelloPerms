package hello

import org.scalatest.{PropSpec, Matchers, FunSuite}
import org.scalatest.prop.{PropertyChecks, Checkers}

class PropertyBasedTests extends PropSpec with Matchers with PropertyChecks {

  property("simple prop to get this working") {
    forAll { (s: String) =>
      Perms.permsRec1(s) shouldEqual Perms.permsRec2(s)
    }
  }

}
