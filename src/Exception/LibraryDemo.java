package Exception;
class Library{
    int avialbaleBooks = 3;
    public void borrowBook(int bookrequestedCount){
        try{
//            int [] books = {101,102,103};
//            System.out.println("book requested :"+ books[bookrequested]);
            if(bookrequestedCount > avialbaleBooks){
               throw new ArrayIndexOutOfBoundsException("Requested book count is more than available books");
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occured :  so thay why books are not availabe");
        }catch (Exception e){
            System.out.println("Null Pointer Exception occured ");
        }finally {
            System.out.println("Available books are :"+ avialbaleBooks);
        }

    }

}
public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();
        library.borrowBook(5);

    }
}



//public void borrowBook(int bookrequested){
//    try{
//        int [] books = {101,102,103};
//        System.out.println("book requested :"+ books[bookrequested]);
//    }catch (ArrayIndexOutOfBoundsException e){
//        System.out.println("Exception Occured :  so thay why books are not availabe");
//    }catch (NullPointerException e){
//        System.out.println("Null Pointer Exception occured ");
//    }finally {
//        System.out.println("Available books are :"+ avialbaleBooks);
//    }
//
//}