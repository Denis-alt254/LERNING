import java.util.Scanner;

public class Swap {
  public static void main(String[] args){
    int a, b;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the vakue of a = ");
    a = scanner.nextInt();

    System.out.println("Enter the vakue of b = ");
    b = scanner.nextInt();
    
    int c = a;
    a = b;
    b = c;

    System.out.println("a =" + a + "  b = " + b);
    
    scanner.close();
  }  
}
