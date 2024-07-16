object Fibonacci {

  def fibonacci(n: Int): Int = {
    if (n <= 1) n
    else fibonacci(n - 1) + fibonacci(n - 2)
  }

  def printfibonacci(n: Int): Unit = {
    for (i <- 0 until n) {
      println(fibonacci(i))
    }
  }

  @main
  def practical5(): Unit = {
    val n = 15
    printfibonacci(n)
  }
}
