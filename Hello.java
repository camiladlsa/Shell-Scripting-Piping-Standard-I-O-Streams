public class Hello {
    public static void main(String[] args) {
        if (args.length > 0){
            System.out.println("\nHola " + args[0] + "." + "\n");
        } else {
            System.out.println("\nError Code 100." + "\n");
            System.exit(100);
        }
    }
}