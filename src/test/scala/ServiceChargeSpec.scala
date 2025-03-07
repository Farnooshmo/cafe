import Cafe.{MenuItem, ServiceCharge}
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec


class ServiceChargeSpec extends AnyWordSpec with Matchers{

  val service = new ServiceCharge
  "ServiceCharge" should {
    "return multiple total * 0.25" when {
      "All purchased items are drinks so no service charge" in {
        val input = service.calculateServiceCharge(List(MenuItem.persianLoveCake, MenuItem.roastedVegetableFocaccia), 20)
        val expectResult = 5.00
        input shouldBe expectResult
      }
    }
    "return multiple total * 0.20" when {
      "Purchased items are hot exclude the drinks" in {
        val input = service.calculateServiceCharge(List(MenuItem.hotApplePie, MenuItem.hotCinnamonRole), 3)
        val expectResult = 0.60
        input shouldBe expectResult
      }
    }
    "return multiple total * 0.10" when {
      "Purchased items are cold exclude the drinks" in {
        val input = service.calculateServiceCharge(List(MenuItem.houseSalad, MenuItem.avocadoOnToast), 18.50)
        val expectResult = 1.85
        input shouldBe expectResult
      }
    }
    "return total" when {
      "All purchased items are drinks so no service charge" in {
        val input = service.calculateServiceCharge(List(MenuItem.coffeeMedium, MenuItem.coffeeSmall), 2.20)
        val expectResult = 0
        input shouldBe expectResult
      }
    }
  }
}