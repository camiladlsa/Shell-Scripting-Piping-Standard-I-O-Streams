import java.util.Scanner;

public class Exercise13 {

    public static void main(String args[]) {

        System.out.println("\nFavor ingresar sus valores: \n");
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();

        int sqr = 0;

            while(num!=null) {

                try {

                    if (num.isEmpty()) {
                        break; 
                    } 

                    int ans = Integer.valueOf(num);
                    sqr = ans * ans;
                    System.out.println(sqr); 
                    num = input.nextLine();

                } catch (NumberFormatException nfe) {

                            System.out.println("Invalid input <" + num + ">.");
                            num = input.nextLine(); 
                    }   
                }
            }
        }