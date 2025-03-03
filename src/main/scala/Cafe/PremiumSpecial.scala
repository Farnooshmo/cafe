//package Cafe
//
//import Cafe.Menu.Menu
////add or remove from menu! It can be appended to the list menu
//case class PremiumSpecial(todaySpecial: String) extends Menu(serveWarm = true)
//val orderPermiumSpecial: PremiumSpecial = PremiumSpecial("Persian Love Cake")
//val getPriceoFPremiumSpecial = orderPermiumSpecial match {
//  case PremiumSpecial("Persian Love Cake") => 10.00
//  case PremiumSpecial("Matcha Latte") => 6.00
//  case PremiumSpecial("Sourdough Panini with Goat Cheese, Onion and Honey") => 10.00
//  case PremiumSpecial("Roasted Vegetable Focaccia") => 10.00
//  case PremiumSpecial("Brewed Persian Tea with rose petals and cinnamon stick") => 6.00
//  case PremiumSpecial("Mulled Wine") => 7.00
//  case PremiumSpecial("Hot Buttered Rum") => 7.00
//  case _ => "Not a valid PremiumSpecial!"
//}