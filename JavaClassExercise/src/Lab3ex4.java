import java.util.Scanner;

public class Lab3ex4 {
  public static void main(String[] args) {
    Scanner scan1 = new Scanner(System.in);
    System.out.print("How many integers will be added? ");
    int num1 = scan1.nextInt();

    int result = 0;

    for(int i = 0; i < num1; i++) {
      Scanner scan2 = new Scanner(System.in);
      System.out.print("Enter an integer: ");
      int num2 = scan2.nextInt();

      result += num2;
    }
    System.out.println("The sum is " + result);
    scan1.close();
  }
}
