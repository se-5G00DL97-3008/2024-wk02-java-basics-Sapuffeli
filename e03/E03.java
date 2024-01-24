import java.util.Scanner;
class E03 {
    public static void main(String[] args) {

        //initializing scanner
        Scanner scanner = new Scanner(System.in);
        //getting user input
        System.out.println("Enter a number: ");
        int userInput=scanner.nextInt();
        //if-stucture for checing if number is positive
        if (userInput>0){
            System.out.println("Positive number");
        }else{
            System.out.println("Negative number");
        }
        //closing scanner
        scanner.close();
    }
}