
case class Person(firstName: String, middleName: String, lastName: String) {
}

object zadanie7 {

  def meetAndGreet(p: Person):String = p match {
    case Person("Arthur", "Conan", _)  => "\n\tGood evening sir.\n"
    case Person("Dean",_,_) => "\n\tChel hol Hasshak!\n"
    case Person(_,_,"Roddenberry") => "\n\tdif-tor heh smusma. Live long and prosper my friend.\n"
    case _ => "\n\tShall greet you not " + p.firstName+ " " + p.lastName + " since thine name don boen in se book.\n"
  }

  def main(args: Array[String]): Unit = {

    val p1: Person = new Person("Arthur", "Conan", "Doyle")
    val p2: Person = new Person( "Dean", "", "Devlin")
    val p3: Person = new Person("Gene", "", "Roddenberry")
    val p4: Person = new Person("John", "Anthony", "Flanagan")

    println("\n-----[START]-----")

    //greeting copywriter of "The Lost World" book which was made into TV series
    println("\nScenario #1\n Greeting copywriter of \"The Lost World\" book which was made into TV series. Sir Arthur Conan Doyle")
    println(meetAndGreet(p1))

    //greeting copywriter for StarGate series
    println("\nScenario #2\nGreeting copywriter for StarGate series. Mr. Dean Devlin")
    println(meetAndGreet(p2))

    //greeting copywriter for StarTrek series
    println("\nScenario #3\nGreeting copywriter for StarTrek series. Mr. Gene Roddenberry")
    println(meetAndGreet(p3))

    //greeting author of "Ranger's Apprentice" bestseller novels
    println("\nScenario #4\nGreeting author of \"Ranger's Apprentice\" bestseller novels. Mr. John Anthony Flanagan")
    println(meetAndGreet(p4))

    println("\n-----[END]-----")
  }
}