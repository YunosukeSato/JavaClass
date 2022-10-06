package Lab1;
import java.util.Scanner;

public class Ex1of3 
{
  public static void main(String[] args)
  {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a number");

    int num = scn.nextInt();
    int result;
    for(int i = 1; i <= 10; i++) {
      result = num * i;
      System.out.println(num + " x " + i + " = " + result);
    }
    scn.close();
  } 
}
