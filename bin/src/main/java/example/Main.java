package example;

import org.mindrot.jbcrypt.*;

public class Main {

    /**
     * Main unit test method.
     * @param args Command line arguments.
     *
     */
    public static void main(String args[]) {

        String plainText = "Hello World!";
        String stored = BCrypt.hashpw(plainText, BCrypt.gensalt());
        System.out.println("Original: " + plainText);
        System.out.println("Hash: " + stored);
        System.out.println("Verified: " + BCrypt.checkpw(plainText, stored));
    }

}
