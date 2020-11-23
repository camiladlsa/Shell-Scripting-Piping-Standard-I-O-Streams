import java.util.Scanner;

public class Exercise9 {

    public static void main(String[] args) {

            int n; 

            Scanner in = new Scanner(System.in);

            System.out.print("\nFavor ingresar un valor: ");

            n = in.nextInt();

            if (n > 0) {

                System.out.println("\nGood one <" + n + ">.\n");

            } else {

                System.out.println("\nInvalid input <" + n + ">.\n");
        }
    }
}