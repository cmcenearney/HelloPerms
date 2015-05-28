package hello

import org.scalatest.{PropSpec, Matchers, FunSuite}
import org.scalatest.prop.{PropertyChecks, Checkers}

class PropertyBasedTests extends PropSpec with Matchers with PropertyChecks {

//  test("absolute value should not be negative") {
//    check((somInt: Int) => {
//      somInt.abs >= 0
//    })
//  }

  property("some prop") {
    forAll { (n: Int) =>
      n.abs should be >= 0
    }
  }

}
