package Cafe

import Cafe.Menu.{Drink, menuList}
import org.scalatest.flatspec.AnyFlatSpec


class MenuSpec extends AnyFlatSpec {

  "Drink" should "be created correctly" in {
    val espresso = Drink("Espresso", "small", "hot", 2.50, 200)
    assert(espresso.name == "Espresso")
    assert(espresso.size == "small")
    assert(espresso.coldOrHot == "hot")
    assert(espresso.price == 2.50)
    assert(espresso.stockAvailable == 200)
  }


}