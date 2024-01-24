import java.util.Scanner;
class E07 {
    public static void main(String[] args) {
        //creating scanner obj
        Scanner scanner= new Scanner(System.in);
        //getting user input
        System.out.println("Which multiplicand multiplication table to show?");
        int userInput = scanner.nextInt();
        System.out.println("Until which multiplyer?");
        int biggestMultiplicand = scanner.nextInt();
        
        //for loop to handle the multiplication calculations and printing out the product
        for(int i = 1; i <=biggestMultiplicand;i++){
            System.out.println(userInput + " x " + i + " = " + (userInput*i));
        }
        //closing scanner
        scanner.close();
    }
}