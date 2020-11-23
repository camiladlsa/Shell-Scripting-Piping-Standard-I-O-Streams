import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class Exercise8 {
    public static void main(String[] args) throws FileNotFoundException {

            while (args.length == 0) {
                System.out.println("\nInvalid input <EMPTY>.\n"); 
                System.exit(100);
            }

            int n = Integer.parseInt(args[0]); 

            if (n > 0) {

                System.out.println("\nGood one <" + Integer.parseInt(args[0]) + ">.\n"); 

            } else {

                File err = new File("err.txt");
                FileOutputStream fos = new FileOutputStream(err);
                PrintStream ps = new PrintStream(fos);
                System.setOut(ps);
                System.out.println("\nInvalid input <" + Integer.parseInt(args[0]) + ">.\n");
        }
    }
}