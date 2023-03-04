
object zadanie10 {

  def performAbsAndCut(sample: List[Double]): List[Double] = {
    val effect = sample.map(e => Math.abs(e)).filter(_ >= -5).filter(_ <= 12)
    effect
  }

  def main(args: Array[String]): Unit = {

    val sampleList1: List[Double] = List(
      0,1,2,3,0,
      -0,-10,-20,-30,-0,
      0,10,20,30,0
    )
    val sampleList2: List[Double] = List(
      2,0,1,8,
      -2,0,-1,-8,
      20,0,10,80,
      0.2,0.0,0.1,0.8
    )
    val sampleList3: List[Double] = List(
      0.4,0.123,4.5,
      -0.4,-0.123,-4.5,
      -12,-5,
      5,12
    )

    println("\n-----[START]-----")

    //scenario #1
    println("\nScenario #1\nAbsolute values in <-5,12> range of: " + sampleList1)
    println("\n" + performAbsAndCut(sampleList1))
    //scenario #2
    println("\nScenario #2\nAbsolute values in <-5,12> range of: " + sampleList2)
    println("\n" + performAbsAndCut(sampleList2))
    //scenario #3
    println("\nScenario #3\nAbsolute values in <-5,12> range of: " + sampleList3)
    println("\n" + performAbsAndCut(sampleList3))

    println("\n-----[END]-----")
  }
}