
object zadanie8 {

  def eliminateZero(sample: List[Int]): List[Int] = {
    val effect = sample.filterNot(_ == 0)
    effect
  }

  def main(args: Array[String]): Unit = {

    val sampleList1: List[Int] = List(0,1,2,3,0)
    val sampleList2: List[Int] = List(2,0,1,8)
    val sampleList3: List[Int] = List(0,0,0,0,-1)

    println("\n-----[START]-----")

    //scenario #1
    println("\nScenario #1\nEliminating elements with value \"zero\" from: " + sampleList1)
    println("\n" + eliminateZero(sampleList1))
    //scenario #2
    println("\nScenario #2\nEliminating elements with value \"zero\" from: " + sampleList2)
    println("\n" + eliminateZero(sampleList2))
    //scenario #3
    println("\nScenario #3\nEliminating elements with value \"zero\" from: " + sampleList3)
    println("\n" + eliminateZero(sampleList3))

    println("\n-----[END]-----")
  }
}