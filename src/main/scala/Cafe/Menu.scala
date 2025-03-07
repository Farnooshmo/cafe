package Cafe

import scala.collection.IterableOnce.iterableOnceExtensionMethods
import scala.math.Ordered.orderingToOrdered


class Menu(val name: String, val price: Double, val coldOrHot: String, val stockAvailable: Int)
object Menu {
  val menu = "-----Menu---- \n" + Drink.DrinkMenu + "\n--------- \n" + Food.FoodMenu + "\n--------- \n" + Pastry.PastryMenu + "\n--------- \n" + PremiumSpecial.PremiumSpecialMenu

  val menuList = MenuItem.drinkList ++ MenuItem.foodList ++ MenuItem.pastryList ++ PremiumSpecial.availabilityOfPremiumSpecial


  val filteredDrink = menuList.filter(item => !(item.isInstanceOf[Drink]))
}
  //Drink
  case class Drink(override val name: String, size: String, override val coldOrHot: String, override val price: Double, override val stockAvailable: Int) extends Menu(name, price, coldOrHot, stockAvailable)
object Drink {


  def DrinkMenu: String = MenuItem.drinkList.map((x: Drink) => x.name + " " + x.size + " " + x.coldOrHot + " " + x.price + "£").mkString("\n")
}
  //Food
  case class Food(override val name: String, override val coldOrHot: String, override val price: Double, override val stockAvailable: Int) extends Menu(name, price, coldOrHot, stockAvailable)
object Food {


  def FoodMenu: String = MenuItem.foodList.map((f: Food) => f.name + " " + f.coldOrHot + " " + f.price + "£").mkString("\n")
}
  //Pastry
  case class Pastry(override val name: String, override val coldOrHot: String, override val price: Double, override val stockAvailable: Int) extends Menu(name, price, coldOrHot, stockAvailable)

object Pastry {


  def PastryMenu: String = MenuItem.pastryList.map((p: Pastry) => p.name + " " + p.coldOrHot + " " + p.price + "£").mkString("\n")

}
  //Premium Special
  case class PremiumSpecial(override val name: String, override val coldOrHot: String, override val price: Double, override val stockAvailable: Int) extends Menu(name, price, coldOrHot, stockAvailable)
object PremiumSpecial {

  val availabilityOfPremiumSpecial: List[PremiumSpecial] = MenuItem.premiumSpecialList.filter(a => a.stockAvailable > 0)

  def PremiumSpecialMenu: String = availabilityOfPremiumSpecial.map((stock: PremiumSpecial) => if (stock.stockAvailable != 0) {
    stock.name + s"(today's special with love) ${stock.price} £"
  } else "Nothing special for today!").mkString("\n")
}




