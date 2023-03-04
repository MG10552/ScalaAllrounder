
object zadanie2 {

  //assortment data from http://www.woodenswords.com/Books_and_DVDs_s/1818.htm

  def main(args: Array[String]): Unit = {

    val storeForHEMA = Map[String, Double](
      "Book of Lessons from Pedro De Heredia" -> 64.95,
      "Fighting with the German Longsword" -> 46,
      "Scottish Broadsword and British Singlestick (Farrell)" -> 43,
      "Cutting with the Medieval Sword" -> 39.99,
      "Fiore dei Liberi's Armizare" -> 38.55
    )
    val discountCouponApplied = storeForHEMA.map {
      case (name, price) => (name, (price * 0.9).round)
    }
    println("\n-----[START]-----\n")

    println("\n Assotment before discount: \n" + storeForHEMA)
    println("\n Assortment after discount oupon is applied: \n" + discountCouponApplied + "\n")

    println("\n-----[END]-----\n")
  }
}