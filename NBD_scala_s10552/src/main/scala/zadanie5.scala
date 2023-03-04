
object zadanie5 {

  def isWorkDay(d: String): String = d match {
    case "Poniedziałek" => "Praca"
    case "Wtorek" => "Praca"
    case "Środa" => "Praca"
    case "Czwartek" => "Praca"
    case "Piątek" => "Praca"
    case "Sobota" => "Weekend"
    case "Niedziela" => "Weekend"
    case _ => "Nie ma takiego dnia, no chyba, że mamy 31 lutego, który z resztą też nie istnieje."
  }

  def main(args: Array[String]): Unit = {
    println("\n-----[START]-----")

    //scenario #1
    println("\nScenario #1\nJest Piątek, czyli: " + isWorkDay("Piątek"))
    //scenario #2
    println("\nScenario #2\nJest Niedziela, czyli: " + isWorkDay("Niedziela"))
    //scenario #3
    println("\nScenario #3\nJest Middas, czyli: " + isWorkDay("Middas"))

    println("\n-----[END]-----\n")
  }
}