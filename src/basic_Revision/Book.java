package basic_Revision;

 class Book {
  static int no_ofBooks;
  String author;
  String Title;
  String isbn;
  boolean Isborrowed;

  static {
   no_ofBooks = 0;
  }

  {
   no_ofBooks++;
  }


  Book(String author, String title, String isbn) {
   this.author = author;
   this.Title = title;
   this.isbn = isbn;
  }

  Book(String isbn) {
   this(isbn, "unknown", "unknown");
  }


  static int getBookCount() {
   return no_ofBooks;
  }

  void boorowBook() {
   if (Isborrowed) {
    System.out.println("The book is already borrowed");
    return;

   } else {
    this.Isborrowed = true;
    System.out.println("enjoy the book");
   }


  }
  void returnBook() {
   if (Isborrowed) {
    this.Isborrowed = false;
    System.out.println("Thank you for returning the book");
   } else {
    System.out.println("This book was not borrowed");
   }
  }


  static void main() {
   Book book1 = new Book("1234", "Java Programming", "John Doe");
   Book book2 = new Book("5678");
   Book book3 = new Book("2345", "Python Programming", "Jane Smith");
    System.out.println("Total number of books: " + Book.getBookCount());
   System.out.println("Borrowing book1:");
   System.out.println(book2.Title);
   System.out.println(book1.Title);
    book1.boorowBook();
    Book.getBookCount();
    book1.returnBook();
  }
 }
