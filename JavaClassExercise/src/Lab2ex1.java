import java.util.Scanner;

public class Lab2ex1 {
  
  public static void main(String[] args) {

    // Scanner scan1 = new Scanner(System.in);
    // System.out.print("Input the start: ");
    // String input1 = scan1.nextLine();

    // Scanner scan2 = new Scanner(System.in);
    // System.out.print("Input the end: ");
    // String input2 = scan2.nextLine();
    
    // int start = Integer.parseInt(input1);
    // int end = Integer.parseInt(input2);

    // Francios Answer

    Scanner scan1 = new Scanner(System.in);

    System.out.println("start");
    int start = scan1.nextInt();
    System.out.println("end");
    int end = scan1.nextInt();

    for(int i = start; i <= end; i++) {
      System.out.println(i);
    }
    scan1.close();
    // scan2.close();
  }
}
