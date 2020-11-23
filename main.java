import java.util.Scanner;

class Main {  

  public static void main(String args[]) { 

    Scanner input = new Scanner(System.in);
    String num = input.nextLine();
    int sum = 0;

    while(num!=null) {

        if (num.isEmpty()) {
            System.out.println("Listo.");
            break;
        }

        if (input.hasNextLine()) {
            int ans = Integer.valueOf(num);
            sum = sum + ans;
            num = input.nextLine();
        } else {
            num = null;
        }
    }
    System.out.println(sum);

    }   
}