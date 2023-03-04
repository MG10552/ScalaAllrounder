
class bankAccount(private var available: Int) {

  def this(){
    this(0)
  }

  def deposit(cashIn: Int): Unit = {
    available += cashIn
    println("New deposit successful. Added $" + cashIn + " to the account.")
  }

  def withdrawal(cashOut: Int): Unit = {
    if (cashOut > available)
      println("Requested amount surpasses currently available funds. \n\tYou do not have $" + cashOut + " in your bank account.")
    else {
      available -= cashOut
      println("Withdrawal successful. Cashed $" + cashOut + " out.")
    }
  }
  def accountBalance: Int = available
}

object zadanie6 {

  def main(args: Array[String]): Unit = {
    val client1 = new bankAccount()
    val client2 = new bankAccount(200000)
    val client3 = new bankAccount(0)

    println("\n-----[START]-----")

    //scenario #1
    println("\nScenario #1\nAvailable funds: $" + client1.accountBalance)
    client1.deposit(300)
    println("Available funds: $" + client1.accountBalance)
    client1.withdrawal(75)
    println("Available funds: $" + client1.accountBalance)

    //scenario #2
    println("\nScenario #2\nAvailable funds: $" + client2.accountBalance)
    client2.withdrawal(2500000)
    println("Available funds: $" + client2.accountBalance)

    //scenario #3
    println("\nScenario #3\nAvailable funds: $" + client3.accountBalance)
    client3.withdrawal(30)
    client3.withdrawal(10)
    println("Available funds: $" + client3.accountBalance)
    client3.deposit(700)
    println("Available funds: $" + client3.accountBalance)
    client3.deposit(300)
    println("Available funds: $" + client3.accountBalance)

    println("\n-----[END]-----")
  }
}