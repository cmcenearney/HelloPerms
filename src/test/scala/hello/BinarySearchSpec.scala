package hello

import org.scalatest.prop.PropertyChecks
import org.scalatest.{Matchers, WordSpecLike}

class BinarySearch

class BinarySearchSpec extends WordSpecLike with Matchers with PropertyChecks {



}


/*
"preferredPriceRangeMedian" should {

      "default to 20 when absent / None" in {
        preferredPriceRangeMedian(dmgNone) should be(20)
        preferredPriceRangeMedian(dmgFieldsNone) should be(20)
      }
      "be 68 when >= 100001.00" in {
        val range = for (n <- Gen.choose(100001.00, Double.MaxValue)) yield n
        forAll(range) { (d: Double) =>
          preferredPriceRangeMedian(responseWithMedianPr(d)) should be(68)
        }
      }
      "conform to Price Range lookup defined in RTM" in {
        for (r <- priceRanges) {
          propCheckPriceRangeFuncs(r._1, r._2, r._3, preferredPriceRangeMedian, responseWithMedianPr)
        }
      }
    }
 */