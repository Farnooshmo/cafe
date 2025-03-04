package Cafe

object Menu extends App {

  abstract class Menu(stockAvailable: Int)

  case class Drink(drinkName: String, size: String, coldOrHot: String, price: Double, stockAvailable: Int) extends Menu(stockAvailable: Int)

  val coffeeSmall: Drink = Drink("Coffee", "small", "hot", 1.00, 200)
  val coffeeMedium = coffeeSmall.copy(size = "medium", price = 1.20)
  val coffeeLarge = coffeeMedium.copy(size = "large", price = 1.50)
  val hotChocolateSmall: Drink = Drink("Hot Chocolate", "small", "hot", 2.00, 20)
  val hotChocolateMedium: Drink = Drink("Hot Chocolate", "medium", "hot", 2.50, 20)
  val hotChocolateLarge: Drink = Drink("Hot Chocolate", "large", "hot", 3.00, 20)
  val greenTeaSmall: Drink = Drink("Green Tea", "small", "hot", 1.00, 200)
  val greenTeaMedium: Drink = Drink("Green Tea", "medium", "hot", 1.20, 200)
  val greenTeaLarge: Drink = Drink("Green Tea", "large", "hot", 1.50, 200)
  val freshMintTeaSmall: Drink = Drink("Fresh Mint Tea", "small", "hot", 2.00, 50)
  val freshMintTeaMedium: Drink = Drink("Fresh Mint Tea", "medium", "hot", 2.20, 50)
  val freshMintTeaLarge: Drink = Drink("Fresh Mint Tea", "large", "hot", 2.50, 50)
  val icedTeaSmall: Drink = Drink("Homemade Iced Tea", "small", "hot", 1.50, 40)
  val icedTeaMedium: Drink = Drink("Homemade Iced Tea", "medium", "hot", 1.70, 40)
  val icedTeaLarge: Drink = Drink("Homemade Iced Tea", "large", "hot", 1.90, 40)
  val lemonadeSmall: Drink = Drink("Fresh Lemonade", "small", "cold", 3.00, 40)
  val lemonadeMedium: Drink = Drink("Fresh Lemonade", "medium", "cold", 3.50, 40)
  val lemonadeLarge: Drink = Drink("Fresh Lemonade", "large", "cold", 4.00, 40)
  val mojito: Drink = Drink("Mojito", "medium", "cold", 7.00, 70)
  val pinColada: Drink = Drink("Pina Colada", "medium", "cold", 8.00, 70)
  val ginAndTonic: Drink = Drink("Gin & Tonic", "medium", "cold", 8.00, 70)

  val drinkList: List[Cafe.Menu.Drink] = List(coffeeSmall, coffeeMedium, coffeeLarge, hotChocolateSmall, hotChocolateMedium, hotChocolateLarge, hotChocolateLarge, greenTeaSmall, greenTeaMedium, greenTeaLarge, freshMintTeaSmall, freshMintTeaMedium, freshMintTeaLarge, icedTeaSmall, icedTeaMedium, icedTeaLarge, lemonadeSmall, lemonadeMedium, lemonadeLarge, mojito, pinColada, ginAndTonic)

  //  def PriceOfDrink = drinkList.map((drink: Cafe.Menu.Drink) => drink.price)
  def DrinkMenu: String = drinkList.map((x: Cafe.Menu.Drink) => x.drinkName + " " + x.size + " " + x.coldOrHot + " " + x.price + "£").mkString("\n")

  println(DrinkMenu)


  case class Food(foodName: String, coldOrHot: String, price: Double, stockAvailable: Int) extends Menu(stockAvailable: Int)

  val lasagna: Food = Food("Lasagna", "hot", 11.50, 20)
  val houseSalad: Food = Food("House salad", "cold", 10.50, 30)
  val englishBreakfast: Food = Food("English breakfast", "hot", 12.50, 40)
  val coronationQuiche: Food = Food("CoronationQuiche", "hot", 14.50, 10)
  val avocadoOnToast: Food = Food("Avocado Toast", "cold", 8.00, 50)
  val smokedSalmonPasta: Food = Food("Smoked Salmon Pasta", "hot", 10.50, 40)

  val foodList: List[Cafe.Menu.Food] = List(lasagna, houseSalad, englishBreakfast, coronationQuiche, avocadoOnToast, smokedSalmonPasta)
  def FoodMenu: String = foodList.map((f: Cafe.Menu.Food) => f.foodName + " " + f.coldOrHot + " " + f.price + "£").mkString("\n")
  println(FoodMenu)

  case class Pastry(pastryName: String, coldOrHot: String, price: Double, stockAvailable: Int) extends Menu(stockAvailable: Int)

  val croissant: Pastry = Pastry("Croissant", "cold", 0.90, 50)
  val hotCroissant: Pastry = Pastry("Croissant", "hot", 1.20, 50)
  val cinnamonRole: Pastry = Pastry("Cinnamon Role", "cold", 1.10, 50)
  val hotCinnamonRole: Pastry = Pastry("Cinnamon Role", "hot", 1.50, 50)
  val applePie: Pastry = Pastry("Apple pie", "cold", 1.10, 30)
  val hotApplePie: Pastry = Pastry("Apple pie", "hot", 1.50, 30)
  val chocolateBrownie: Pastry = Pastry("Chocolate Brownie", "cold", 1.50, 40)
  val carrotCake: Pastry = Pastry("Carrot Cake", "cold", 1.50, 10)

  val pastryList: List[Cafe.Menu.Pastry] = List(croissant, hotCroissant, cinnamonRole, hotCinnamonRole, applePie, hotApplePie, chocolateBrownie, carrotCake)
  def PastryMenu: String = pastryList.map((p: Cafe.Menu.Pastry) => p.pastryName + " " + p.coldOrHot + " " + p.price + "£").mkString("\n")
  println(PastryMenu)


  //add or remove from menu! It can be appended to the list menu
  case class PremiumSpecial(todaySpecial: String, coldOrHot: String, price: Double, stockAvailable: Int) extends Menu(stockAvailable: Int)

  val persianLoveCake: PremiumSpecial = PremiumSpecial("Persian Love Cake", "cold", 10.00, 0)
  val matchaLatte: PremiumSpecial = PremiumSpecial("Matcha Latte", "hot", 6.00, 0)
  val roastedVegetableFocaccia: PremiumSpecial = PremiumSpecial("Roasted Vegetable Focaccia", "hot", 10.00, 0)
  val sourdoughPanini: PremiumSpecial = PremiumSpecial("Sourdough Panini with Goat Cheese", "hot", 10.00, 0)
  val persianTea: PremiumSpecial = PremiumSpecial("Brewed Persian Tea with rose petals and cinnamon stick", "hot", 5.00, 0)
  val hotButteredRum: PremiumSpecial = PremiumSpecial("Hot Buttered Rum", "hot", 7.00, 0)

  val premiumSpecialList:List[Cafe.Menu.PremiumSpecial] = List(persianLoveCake, matchaLatte, roastedVegetableFocaccia,sourdoughPanini,persianTea,hotButteredRum)
  val avaiablilityOfPremiumSpecial: List[Cafe.Menu.PremiumSpecial] = premiumSpecialList.filter( a => a.stockAvailable > 0)
  def PremiumSpecialMenu: String = avaiablilityOfPremiumSpecial.map((stock: Cafe.Menu.PremiumSpecial) => if (stock.stockAvailable != 0) {
    stock.todaySpecial + s"(today's special with love) ${stock.price} £"
  } else "Nothing special for today!").mkString("\n")
 println(PremiumSpecialMenu)
  //stock count of the menu items. need to have an accumulator!


}
