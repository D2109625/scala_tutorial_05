case class Book(title: String, author: String, isbn: String)

object LibraryBooks {

  var library: Set[Book] = Set(
    Book("May mara prasangaya", "Mahinda Prasad Masebula", "9780743273565"),
    Book("Persona", "Kelum Weligamage", "9625741360545"),
    Book("Nil Katarolu", "Mohan Raj Madawala", "9713542064266")
  )

  def addBook(newBook: Book): Unit = {
    library += newBook
    println("\nBook Added: " + newBook.title + " by " + newBook.author)
  }

  def removeBook(isbn: String): Unit = {
    val bookOption = library.find(_.isbn == isbn)
    bookOption match {
      case Some(book) =>
        library -= book
        println(s"\nBook removed: " + book.title + " by " + book.author)
      case None =>
        println("\nNo book found with ISBN: " + isbn)
    }
  }

  def isBookAlreadyInLibrary(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

  def displayCurrentLibrary(): Unit = {
    println("\n------- Current Library Collection --------\n")
    library.foreach(book => println("Title: " + book.title + " Author: " + book.author + " ISBN: " + book.isbn))
  }

  def searchBookByTitle(title: String): Unit = {
    val bookOption = library.find(_.title == title)
    bookOption match {
      case Some(book) =>
        println("\nBook found: Title: " + book.title + ", Author: " + book.author + ", ISBN: " + book.isbn)
      case None =>
        println("\nNo book found with title: " + title)
    }
  }

  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author == author)
    if (booksByAuthor.nonEmpty) {
      println("Books by author " + author + ":")
      booksByAuthor.foreach(book => println("Title: " + book.title + ", ISBN: " + book.isbn))
    } else {
      println("No books found by author: " + author)
    }
  }

  @main
  def practical5q2(): Unit = {
    displayCurrentLibrary()
    addBook(Book("Magul Kema", "Kumarathunaga Munidasa", "925710362214"))
    removeBook("9713542064266")
    println("Is book with ISBN 9780743273565 in library? " + isBookAlreadyInLibrary("9780743273565"))
    searchBookByTitle("Persona")
    displayBooksByAuthor("Mahinda Prasad Masebula")
    displayCurrentLibrary()
  }
}
