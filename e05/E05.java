import java.util.Scanner;
class E05 {
    public static void main(String[] args) {
        //creating scanner obj
        Scanner scanner = new Scanner(System.in);

        //getting user input
        System.out.println("Enter a number: ");
        int day= scanner.nextInt();
        //switch structure to print the corresponding day
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Only 7 days in a week");
            
        }
        //closing scanner
        scanner.close();

    }
}