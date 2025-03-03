package Cafe

 object  Menu extends App {

   abstract class Menu
   case class Drink(drinkName: String, size: String, isHot: Boolean, hasAlcohol: Boolean) extends Menu
   val orderDrink:Drink = Drink("Hot Chocolate","medium" ,isHot = true, hasAlcohol = false)
   val getPriceOfDrink = orderDrink match {
     case Drink("Coffee","small", true, false) => 1.00
     case Drink("Coffee","medium", true, false) => 1.50
     case Drink("Coffee","Large", true, false) => 2.00
     case Drink("Hot Chocolate","small", true, false) => 2.20
     case Drink("Hot Chocolate","medium", true, false) => 3.00
     case Drink("Hot Chocolate","Large", true, false) => 3.20
     case Drink("Green Tea","small", true, false) => 2.50
     case Drink("Green Tea","medium", true, false) => 3.20
     case Drink("Green Tea","Large", true, false) => 3.50
     case Drink("Fresh Mint Tea","small", true, false) => 3.00
     case Drink("Fresh Mint Tea","medium", true, false) => 3.50
     case Drink("Fresh Mint Tea","Large", true, false) => 4.00
     case Drink("Homemade Iced Tea","small", false, false) => 2.00
     case Drink("Homemade Iced Tea","medium", false, false) => 3.00
     case Drink("Homemade Iced Tea","Large", false, false) => 4.00
     case Drink("Fresh Lemonade","small", false, false) => 2.50
     case Drink("Fresh Lemonade","medium", false, false) => 3.50
     case Drink("Fresh Lemonade","Large", false, false) => 4.50
     case Drink("Mojito","medium", false, true) => 5.50
     case Drink("Pina Colada","medium", false, true) => 6.00
     case Drink("Gin & Tonic","medium", false, true) => 4.00
     case _ =>  "Not a valid drink!"
   }

println(s" $orderDrink is $getPriceOfDrink")
   case class Food(foodName: String, serveWarm: Boolean) extends Menu
   val orderFoood:Food = Food("Lasagna", serveWarm = true)
   val getPriceOfFood = orderFoood match {
     case Food("Lasagna", true) => 11.50
     case Food("House salad", false) => 10.50
     case Food("English breakfast", true) => 12.50
     case Food("Quiche", true) => 11.50
     case Food("Avocado Toast", false) => 8.00
     case _ => "Not a valid food!"
   }
   case class Pastry(pastryName: String, serveCold: Boolean) extends Menu
   val orderPastry:Pastry = Pastry("Croissant", serveCold = false)
   val getPriceOfPastry = orderPastry match {
     case Pastry("Croissant", true) => 0.90
     case Pastry("Croissant", false) => 1.20
     case Pastry("Cinnamon Role", true) => 1.10
     case Pastry("Cinnamon Role", false) => 1.50
     case Pastry("Apple pie", true) => 1.10
     case Pastry("Apple pie", false) => 1.50
     case Pastry("Chocolate Brownie", true) => 1.50
     case Pastry("Carrot Cake", true) => 1.50
     case _=> "Not a valid pastry!"
   }

   //add or remove from menu! It can be appended to the list menu
   case class PremiumSpecial(todaySpecial: String) extends Menu
   val orderPermiumSpecial: PremiumSpecial = PremiumSpecial("Persian Love Cake")
   val getPriceoFPremiumSpecial = orderPermiumSpecial match {
     case PremiumSpecial("Persian Love Cake") => 10.00
     case PremiumSpecial("Matcha Latte") => 6.00
     case PremiumSpecial("Sourdough Panini with Goat Cheese, Onion and Honey") => 10.00
     case PremiumSpecial("Roasted Vegetable Focaccia") => 10.00
     case PremiumSpecial("Brewed Persian Tea with rose petals and cinnamon stick") => 6.00
     case PremiumSpecial("Mulled Wine") => 7.00
     case PremiumSpecial("Hot Buttered Rum") => 7.00
     case _ => "Not a valid PremiumSpecial!"

   }
   //stock count of the menu items. need to have an accumulator!




}
