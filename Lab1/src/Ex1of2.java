package Lab1;
import java.util.Scanner;

public class Ex1of2 
{
  public static void main(String[] args) 
  {
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter the price");
    
    int original = scn.nextInt();
    int dollars = original / 100;
    int cents = original % 100;

    System.out.println("The value is " + dollars + " dollars and " + cents + " cents.");
    
    scn.close();
  } 
}
