import java.util.Scanner;
class E08 {
    public static void main(String[] args) {
        //creating scanner object
        Scanner scanner = new Scanner(System.in);

        int toPlay = 1;
        //while loop to which includes the main program
        while (toPlay==1) {
            System.out.println("Enter a number (0 to quit)");
            int userInput = scanner.nextInt();

            //if stucture to check if input is even or odd
            if (userInput==0) {
                break;
            }else{
                if (userInput%2==0) {
                    System.out.println("Even number");
                }else{
                    System.out.println("Odd number");
                }
            }
        }
        //closing scanner
        scanner.close();
    }
}