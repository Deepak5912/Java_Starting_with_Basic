package Exception;
class Library{
    int avialbaleBooks = 3;
    public void borrowBook(int bookrequested){
        int [] books = {101,102,103};
        System.out.println("book requested :"+ books[bookrequested]);

    }
}
public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();
        library.borrowBook(2);

    }
}
