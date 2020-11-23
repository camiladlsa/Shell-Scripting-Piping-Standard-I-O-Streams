import java.util.Scanner;

public class Exercise12 {

    public static void main(String args[]) {

        System.out.println("\nFavor ingresar sus valores: \n");
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();

        int sum = 0;

            while(num!=null) {

                try {

                    if (num.isEmpty()) {
                        break; 
                    } 

                    int ans = Integer.valueOf(num);
                    sum = sum + ans;
                    num = input.nextLine();

                } catch (NumberFormatException nfe) {

                        System.out.println("Invalid input <" + num + ">.");
                        num = input.nextLine();
                }   
            }

            System.out.println(sum); 
            System.out.println("");
        }
    }