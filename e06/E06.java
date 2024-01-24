import java.util.Scanner;
class E06 {
    public static void main(String[] args) {
        //creating scanner obj
        Scanner scanner= new Scanner(System.in);
        //getting user input
        System.out.println("Which multiplication table to show?");
        int userInput = scanner.nextInt();
        
        //for loop to handle the multiplication calculations and printing out the product
        for(int i = 0; i <=10;i++){
            System.out.println(userInput + " x " + i + " = " + (userInput*i));
        }
        //closing scanner
        scanner.close();
    }
}