//package Cafe
//import Cafe.Menu.Menu
//
//case class coldDrink(drinkName: String, size: String) extends Menu(serveWarm = false)
//val orderDrink:coldDrink = coldDrink("Hot Chocolate","medium")
//val getPriceOfDrink = orderDrink match {
//  case coldDrink("Homemade Iced Tea","small") => 2.00
//  case coldDrink("Homemade Iced Tea","medium") => 3.00
//  case coldDrink("Homemade Iced Tea","Large") => 4.00
//  case coldDrink("Fresh Lemonade","small") => 2.50
//  case coldDrink("Fresh Lemonade","medium") => 3.50
//  case coldDrink("Fresh Lemonade","Large") => 4.50
//  case coldDrink("Mojito","medium") => 5.50
//  case coldDrink("Pina Colada","medium") => 6.00
//  case coldDrink("Gin & Tonic","medium") => 4.00
//  case _ =>  "Not a valid cold drink!"
//}
