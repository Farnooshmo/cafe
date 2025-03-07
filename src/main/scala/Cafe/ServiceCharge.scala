package Cafe

//case class ServiceCharge(order: List[Menu], total: Double)
// order match {
//    case order if  order.forall(item => item.isInstanceOf[Drink]) => noServiceCharge
//    case order if order.forall(item => (!item.isInstanceOf[Drink])) && order.exists(item => item.coldOrHot == "cold") => smallServiceCharge
//    case order if order.forall(item => (!item.isInstanceOf[Drink])) && order.exists(item => item.coldOrHot == "hot") => mediumServiceCharge
//    case order if order.exists(item => item.isInstanceOf[PremiumSpecial])  => bigServiceCharge
//    case _ => automaticallyAppliedTwoPound
//  }

//// for each of these methods, we are not doing the calculation. We will use these to identify which service charge wil apply, given the criteria of order.
//def bigServiceCharge: Double => Double = total => total * 0.25
//def mediumServiceCharge: Double => Double = total => total * 0.2
//def smallServiceCharge: Double => Double = total => total * 0.1
//def noServiceCharge: Double => Double = total => total
//def automaticallyAppliedTwoPound: Double => Double = total => total + 2
//
//// This method will look at the order , and decide which of the above methods to use.


class ServiceCharge {
  def calculateServiceCharge(order: List[Menu], total: Double): Double = {

    //    val tenPercent: Boolean = order.exists(item => item.coldOrHot == "cold")
    //    val twentyPercent: Boolean = order.exists(item => item.coldOrHot == "hot")
    //    val twentyFivePercent: Boolean = order.exists(item => item.isInstanceOf[PremiumSpecial])

    if(order.forall(order => order.isInstanceOf[PremiumSpecial])) {
      total * 0.25
    } else if(order.exists(order => order.coldOrHot == "hot")) {
      total * 0.2
    } else if(order.exists(order => order.coldOrHot == "cold"))  {
      total * 0.1
    } else if (order.forall(order => order.isInstanceOf[Drink])) {
      total
    } else
      total + 2 //automatically applied 2 to service charge
  }
  println(calculateServiceCharge(List(MenuItem.persianLoveCake), 20))


}