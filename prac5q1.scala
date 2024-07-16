import scala.io.StdIn.readLine

object ManageInventory {

  def getProductList(): List[String] = {
    var productList: List[String] = List()
    var input: String = ""

    println("Enter product names (type 'done' to finish):")
    while (input.toLowerCase != "done") {
      input = readLine()
      if (input.toLowerCase != "done") {
        productList = productList :+ input
      }
    }
    productList
  }

  def printProductList(productList: List[String]): Unit = {
    var index = 1
    for (product <- productList) {
      println(index + ". " + product)
      index += 1
    }
  }

  def getTotalProducts(productList: List[String]): Int = {
    productList.length
  }

  def main(args: Array[String]): Unit = {
    val productList = getProductList()
    println("\nProduct List:")
    printProductList(productList)
    println(s"\nTotal number of products: ${getTotalProducts(productList)}")
  }
}
