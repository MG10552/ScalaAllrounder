
object zadanie3 {

  def giveTuple(tuple3:(Any,Any,Any)): Unit ={
    println("\n-----[Podana krotka zawiera]-----")
    println("\t" + tuple3._1.toString + "\n\t" + tuple3._2.toString + "\n\t" + tuple3._3.toString)
    println("-----[w środku]-----")
  }

  def main(args: Array[String]): Unit = {
  val t1 = new Tuple3("Jeden", 2, Console)
  giveTuple(t1)
  }
}