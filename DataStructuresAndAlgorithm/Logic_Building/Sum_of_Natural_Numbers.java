import java.util.Scanner;

public class Sum_of_Natural_Numbers {

    static int findSum(int n){
            int sum = 0;

            for(int i = 0; i<= n; i++){
                sum = sum + i;
            }
            return sum;
        }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of n = ");

        int n = scanner.nextInt();

        System.out.println("Sum = " + findSum(n));
        
        scanner.close();
    }
    
}