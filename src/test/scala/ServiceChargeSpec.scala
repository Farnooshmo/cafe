import Cafe.{MenuItem, ServiceCharge}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec


class ServiceChargeSpec extends AnyWordSpec with Matchers{

  val service = new ServiceCharge
  "ServiceCharge" should {
    "return multiple total * 0.25" when {
      "All purchased items are drinks so no service charge" in {
        val input = service.calculateServiceCharge(List(MenuItem.persianLoveCake, MenuItem.roastedVegetableFocaccia), 20)
        val expectResult = 5
        input shouldBe expectResult
      }
    }
  }
}