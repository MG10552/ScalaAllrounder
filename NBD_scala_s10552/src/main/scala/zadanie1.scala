
object zadanie1 {
  val daysOfTheWeek: List[String] = List("Niedziela", "Poniedziałek", "Wtorek", "Środa", "Czwartek", "Piątek", "Sobota")

  //(e) impl
  def e_recursive(dOTW:List[String]): Unit = {
    if(! dOTW.isEmpty) {
      println(dOTW.head)
      e_recursive(dOTW.tail)
    }
  }
  //(g) impl - left
  def g_foldLeft(dOTW:List[String]): Unit = {
    val gL = dOTW.foldLeft("")((a, b) => a + b)
    println(gL)
  }
  //(g) impl - right
  def g_foldRight(dOTW:List[String]): Unit = {
    val gR = dOTW.foldRight("")((a, b) => b + a)
    println(gR)
  }
  //(h) impl
  def h_foldLeftP(dOTW:List[String]): Unit = {
    val h = dOTW.filter(h => h.startsWith("P")).foldLeft("")((a, b) => a + b)
    println(h)
  }


  //executive main
  def main(args: Array[String]): Unit = {

    println("\n-----[START]-----\n")

    //(a)
    println("\n(a)\n")
    for(content <- daysOfTheWeek) println(content)

    //(b)
    println("\n(b)\n")
    for(content <- daysOfTheWeek if content.startsWith("P")) println(content)

    //(c)
    println("\n(c)\n")
    daysOfTheWeek.foreach { println }

    //(d)
    println("\n(d)\n")
    var d = 0;
    while(d < daysOfTheWeek.length) {
      println(daysOfTheWeek(d))
      d += 1
    }

    //(e)
    println("\n(e)\n")
    e_recursive(daysOfTheWeek)

    //(f)
    println("\n(f)\n")
    e_recursive(daysOfTheWeek.reverse)

    //(gL)
    println("\n(gL)\n")
    g_foldLeft(daysOfTheWeek)
    //(gR)
    println("\n(gR)\n")
    g_foldRight(daysOfTheWeek)

    //(h)
    println("\n(h)\n")
    h_foldLeftP(daysOfTheWeek)

    println("\n\n-----[END]-----")
  }
}

