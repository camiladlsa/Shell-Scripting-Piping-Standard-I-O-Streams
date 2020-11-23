import java.util.Scanner;

public class Exercise111 {

    public static void main(String[] args) {

            while (args.length == 0) {
                System.out.println("\nInvalid input <EMPTY>.\n"); 
                System.exit(100);
            }

            try {

                int n = Integer.parseInt(args[0]); 

                if (n > 0) {


                    for(int i = 1; i < (n+1); i++) {
                        System.out.println(i);
                    }   

                System.out.println("");

                } else {

                    System.out.println("\nInvalid input <" + Integer.parseInt(args[0]) + ">.\n");
                }
            }
                
            catch (NumberFormatException nfe) {

                    System.out.println("\nInvalid input <" + args[0] + ">.\n");
                    System.exit(100);
            }
        }
    }