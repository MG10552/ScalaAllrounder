
object zadanie9 {

  def performPlusEqualOne(sample: List[Int]): List[Int] = {
    val effect = sample.map(e => e+1)
    effect
  }

  def main(args: Array[String]): Unit = {

    val sampleList1: List[Int] = List(0,1,2,3,0)
    val sampleList2: List[Int] = List(2,0,1,8)
    val sampleList3: List[Int] = List(0,0,0,0,-1)

    println("\n-----[START]-----")

    //scenario #1
    println("\nScenario #1\nAdding +1 to all values of elements in: " + sampleList1)
    println("\n" + performPlusEqualOne(sampleList1))
    //scenario #2
    println("\nScenario #2\nAdding +1 to all values of elements in: " + sampleList2)
    println("\n" + performPlusEqualOne(sampleList2))
    //scenario #3
    println("\nScenario #3\nAdding +1 to all values of elements in: " + sampleList3)
    println("\n" + performPlusEqualOne(sampleList3))

    println("\n-----[END]-----")
  }
}
