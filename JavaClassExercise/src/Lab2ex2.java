import java.util.Scanner;

public class Lab2ex2 {
  public static void main(String[] args) {
    // Scanner scan = new Scanner(System.in);

    // System.out.print("Input the N: ");
    // int num = scan.nextInt();

    // int result = 0;

    // for(int i = 1; i <= num; i++) {
    //   result += i;
    // }

    // System.out.println("The sum of 1 to " + num + " is " + result);

    // scan.close();

    // Answer

    int n;
        Scanner scan1 = new Scanner(System.in);

        System.out.println("Input the N:");
        n = scan1.nextInt();

        System.out.println("The sum of 1 to n is: " + (n * (n + 1) / 2));

        scan1.close();
  }
}
