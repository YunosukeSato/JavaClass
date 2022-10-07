import java.util.Scanner;

public class Test1 {
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Input an integer number: ");
    int a = scan.nextInt();
    System.out.print("Input a float number: ");
    float b = scan.nextFloat();

    double value = (a * a) + (2 * a * b) + (b * b);
    System.out.println("Value of the equation is  " + value);

    scan.close();

  }
}
