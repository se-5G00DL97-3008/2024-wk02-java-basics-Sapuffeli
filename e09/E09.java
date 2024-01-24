import java.util.Scanner;
class E09 {
    public static void main(String[] args) {
        //creating scanner obj
        Scanner scanner = new Scanner(System.in);

        double total=0;
        double count=0;

        while (true) {
            System.out.println("Give a test score (-1 to quit): ");
            double input= scanner.nextDouble();

            //checking if user wants to quit and if not the program continues to work and calculate the average and print it
            if(input==-1){
                break;
            }else{
                total=total+input;
                count++;

                double average=total/count;
                System.out.println("Average: " + average);
            }
        }
        //closing scanner
        scanner.close();
    }
}