import java.util.Scanner;
class E04 {
    public static void main(String[] args) {
        //initializing scanner
        Scanner scanner = new Scanner(System.in);

        //getting user input
        System.out.println("Enter a day: ");
        int day = scanner.nextInt();
        System.out.println("Enter a month: ");
        int month = scanner.nextInt();
        //if stucture to check if user inputs christmas eve
        if( day == 24 && month == 12){
            System.out.println("Merry Christmas");
        }
        //closing scanner
        scanner.close();
    }
}