import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InputProgram {
    private static final Logger logger = Logger.getLogger(InputProgram.class.getName());

    public static void main(String[] args) {
        try {
            int x = System.in.read();
            System.out.println("code=" + x + " x= " + (char)x);
        } catch (IOException e) {
            // Proper logging instead of printStackTrace()
            logger.log(Level.SEVERE, "Error reading input", e);

            // Optional: User-friendly message
            System.err.println("An error occurred. Please try again.");
        }
    }
}