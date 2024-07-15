Scala Practical–05
1. As part of an inventory management system, you need to capture and display a 
dynamic list of product names. The system should allow users to enter multiple 
product names and then display the list of products in the order they were entered, 
with each product's position in the list. Additionally, the system should be able to 
provide the total number of products entered.
Implement the following functionality using Scala List:
Function getProductList:
Continuously prompts the user to enter product names until the user types 
"done".
Collects these names in a List and returns it.
Function printProductList:
Accepts a List of product names.
Prints each product name on a new line, prefixed with its position in the list 
(starting from 1).
Function getTotalProducts:
Accepts a List of product names.
Returns the total number of products in the list.
2. You are tasked with developing a program to manage a library's book collection 
using sets in Scala. Each book record consists of a title (String), author (String), 
and ISBN (String). Design a Scala program to manage the library's book collection. 
Include the following functionalities:
Book Definition:
Define a case class Book with attributes title: String, author: String, and isbn: 
String.
Library Management:
Create an initial set containing at least three different books.
Implement functions/methods to:
Add a new book to the library.
Remove a book from the library by its ISBN.
Check if a book is already in the library by its ISBN.
Functionalities to Implement:
Display the current library collection with details of each book (title, author, 
ISBN).
Allow the user to search for a book by its title and display its details if found.
Display all books by a specific author.
3. The Fibonacci Sequence is the series of numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, . . 
. Each subsequent number is the sum of the previous two. Write a recursive 
function print fist n Fibonacci numbers for given n
