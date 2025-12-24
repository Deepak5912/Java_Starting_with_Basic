package Exception;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomeExceptionTest {

    @Test
    public void testBorrowBookSuccess() {
        CustomeException library = new CustomeException();
        // Should not throw any exception for valid requests
        assertDoesNotThrow(() -> library.borrowBook(1));
        assertDoesNotThrow(() -> library.borrowBook(3));
        assertDoesNotThrow(() -> library.borrowBook(0));
    }

    @Test
    public void testBorrowBookUnavailable() {
        CustomeException library = new CustomeException();
        // Should throw BookunavailableException when requesting more than available (3)
        BookunavailableException exception = assertThrows(BookunavailableException.class, () -> {
            library.borrowBook(4);
        });
        assertEquals("Requested book count is more than available books", exception.getMessage());
    }

    @Test
    public void testBorrowBookNegative() {
        CustomeException library = new CustomeException();
        // Should throw Exception when requesting negative amount
        Exception exception = assertThrows(Exception.class, () -> {
            library.borrowBook(-1);
        });
        assertEquals("Requested book count cannot be negative", exception.getMessage());
        // Ensure it's not the specific subclass for this case
        assertFalse(exception instanceof BookunavailableException);
    }
}
