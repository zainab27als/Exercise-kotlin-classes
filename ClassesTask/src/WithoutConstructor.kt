class Book(val title: String, val author: String, val yearPublished: Int) {
    fun getBookInfo(): String {
        return "$title by $author ($yearPublished)"
    }
}

fun main() {
    val newBook = Book("To Kill a Mockingbird", "Harper Lee", 1960)
    println(newBook.getBookInfo())
}


//class Book {
//    var title: String = ""
//    var author: String = ""
//    var yearPublished: Int = 0
//}
//fun main (){
//    var newBook =Book()
//    newBook.title = "To kill a mockingbird"
//    newBook.author = "Harper Lee"
//    newBook.yearPublished = 1960
//}
//
//class Book(val title: String, val author: String, val yearPublished: Int) {
//    fun printDetails() {
//        println("Book Title: $title")
//        println("Author: $author")
//        println("Year Published: $yearPublished")
//    }
//}
//
//fun main() {
//    val newBook = Book("To Kill a Mockingbird", "Harper Lee", 1960)
//    newBook.printDetails()
//}

