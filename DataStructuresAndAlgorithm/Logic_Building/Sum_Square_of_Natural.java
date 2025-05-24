import java.util.Scanner;

public class Sum_Square_of_Natural {
    static int findSum(int n){
        int sum = 0;

        for(int i = 0; i<=n; i++){
            sum = sum + (i*i);
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value n = ");

        int n = scanner.nextInt();

        System.out.println("Sum of Square of Natural Numbers = " + findSum(n));

        scanner.close();
    }
}
