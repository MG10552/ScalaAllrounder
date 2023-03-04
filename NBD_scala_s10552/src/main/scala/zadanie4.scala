
object zadanie4 {

  //dishes data from https://en.wikipedia.org/wiki/National_dish

  def findOrigin(check: Option[String]): String = check match {
    case Some(s) => s
    case None => "Origin unknown"
  }

  def main(args: Array[String]): Unit = {
    val dishes = Map(
      "pizza" -> "Italy",
      "pilav" -> "Turkey",
      "ramen" -> "Japan",
      "tourtiere" -> "Canada",
      "empanada" -> "Chile"
    )

    println("\n-----[START]-----")

    //scenario #1
    println("\nScenario #1\nWhere is pizza from?")
    println("\n\tPizza come from " + findOrigin(dishes.get("pizza")))
    //scenario #2
    println("\nScenario #2\nWhere is Taco from?")
    println("\n\tTacos come from " + findOrigin(dishes.get("tacos")))

    println("\n-----[END]-----")
  }
}