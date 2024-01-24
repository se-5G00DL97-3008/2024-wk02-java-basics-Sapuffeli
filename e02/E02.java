import java.util.Scanner;
class E02 {
    public static void main(String[] args) {
        //initializing scanner
        Scanner scanner = new Scanner(System.in);

        //getting user input
        System.out.println("Give a number: ");
        int inputOne= scanner.nextInt();
        System.out.println("Give another number: ");
        int inputTwo= scanner.nextInt();

        //calculations
        int sum=inputOne+inputTwo;
        int product=inputOne*inputTwo;
        int difference=inputOne-inputTwo;
        int quontinent=inputOne/inputTwo;

        //printing results
        System.out.println(inputOne + " + "+inputTwo + " = "+ sum);
        System.out.println(inputOne + " * "+inputTwo + " = "+ product);
        System.out.println(inputOne + " - "+inputTwo + " = "+ difference);
        System.out.println(inputOne + " / "+inputTwo + " = "+ quontinent);

        //closing scanner
        scanner.close();
    }
}