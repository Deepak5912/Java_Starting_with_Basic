package Exception;

        class BookunavailableException extends Exception {
            public BookunavailableException(String message) {
                super(message);
            }
        }
        class library {

            int avialbaleBooks = 3;


            public void borrowBook(int bookrequestedCount) throws Exception {
                if (bookrequestedCount > avialbaleBooks) {
                    throw new BookunavailableException("Requested book count is more than available books");
                }
                if (bookrequestedCount < 0) {
                    throw new Exception("Requested book count cannot be negative");
                }


            }
        }


    public class CustomeException {
//

        public static void main(String[] args) {
            CustomeException library = new CustomeException();
            try {
                library.borrowBook(5);
            } catch (Exception e) {
                System.out.println("exception occured :" + e.getMessage());
            }

        }
}


