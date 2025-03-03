//package Cafe
//
//import Cafe.Menu.Menu
//
//
//case class hotDrink(drinkName: String, size: String) extends Menu(serveWarm = true)
//val orderDrink:hotDrink = hotDrink("Hot Chocolate","medium")
//val getPriceOfDrink = orderDrink match {
//  case hotDrink("Coffee","small") => 1.00
//  case hotDrink("Coffee","medium") => 1.50
//  case hotDrink("Coffee","Large") => 2.00
//  case hotDrink("Hot Chocolate","small") => 2.20
//  case hotDrink("Hot Chocolate","medium") => 3.00
//  case hotDrink("Hot Chocolate","Large") => 3.20
//  case hotDrink("Green Tea","small") => 2.50
//  case hotDrink("Green Tea","medium") => 3.20
//  case hotDrink("Green Tea","Large") => 3.50
//  case hotDrink("Fresh Mint Tea","small") => 3.00
//  case hotDrink("Fresh Mint Tea","medium") => 3.50
//  case hotDrink("Fresh Mint Tea","Large") => 4.00
//  case hotDrink("Homemade Iced Tea","small") => 2.00
//  case hotDrink("Homemade Iced Tea","medium") => 3.00
//  case hotDrink("Homemade Iced Tea","Large") => 4.00
//  case hotDrink("Fresh Lemonade","small") => 2.50
//  case hotDrink("Fresh Lemonade","medium") => 3.50
//  case hotDrink("Fresh Lemonade","Large") => 4.50
//  case hotDrink("Mojito","medium") => 5.50
//  case hotDrink("Pina Colada","medium") => 6.00
//  case hotDrink("Gin & Tonic","medium") => 4.00
//  case _ =>  "Not a valid drink!"
//}
//
//println(s" $orderDrink is $getPriceOfDrink")
//
