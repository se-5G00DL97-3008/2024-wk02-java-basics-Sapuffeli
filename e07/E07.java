import java.util.Scanner;
class E07 {
    public static void main(String[] args) {
        //creating scanner obj
        Scanner scanner= new Scanner(System.in);
        //getting user input
        System.out.println("Which multiplication table to show?");
        int userInput = scanner.nextInt();
        System.out.println("Until which multiplyer should the table show?");
        int biggestMultiplicand = scanner.nextInt();
        
        //for loop to handle the multiplication calculations and printing out the product
        for(int i = 0; i <=biggestMultiplicand;i++){
            System.out.println(i + " x " + userInput + " = " + (userInput*i));
        }
        //closing scanner
        scanner.close();
    }
}