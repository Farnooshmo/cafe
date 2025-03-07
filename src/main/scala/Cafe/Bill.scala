package Cafe

class Customer(val customer: Int)
class Items(val items: List[String])
class Quantity(val quantity: Int)



class Bill(val customer: Customer, val items: Items, val quantity: Quantity, val serviceCharge: ServiceCharge)
//def generateBill( customer: Customer, items: Items, quantity: Quantity,serviceCharge: ServiceCharge): String =

object Bill {
  def apply(customer: Customer, items: Items, quantity: Quantity, serviceCharge: ServiceCharge): Bill = new Bill(customer, items, quantity, serviceCharge)

}
//  val bill1: Bill = Bill.apply(new Customer(1), new Items("coffee","Cinnamon Role"), new Quantity(2), new ServiceCharge(24.00)
//  val bill1: Bill2 = new Bill(new Customer(2), new Items("Carrot Cake", "Cinnamon Role"), new Quantity(2), new ServiceCharge(24.00)


