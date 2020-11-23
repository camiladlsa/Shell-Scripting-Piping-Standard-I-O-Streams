public class Exercise6 {
    public static void main(String[] args) {

    		while (args.length == 0) {
    			System.out.println("\nInvalid input <EMPTY>.\n"); 
    			System.exit(100);
			}

    		int n = Integer.parseInt(args[0]); 

    		if (n > 0) {
            	System.out.println("\nGood one <" + Integer.parseInt(args[0]) + ">.\n"); 
			} else {
            	System.out.println("\nInvalid input <" + Integer.parseInt(args[0]) + ">.\n");
        }
    }
}