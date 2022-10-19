import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab5_1 {
  public static void main(String[] args) {
    Random rand = new Random();
    
    ArrayList<Integer> aList = new ArrayList<>();
    for(int i = 0; i < 10; i++) {
      aList.add((rand.nextInt(50) + 1));
    }

    System.out.println(aList);

    System.out.print("Please enter a number: ");
    Scanner scn = new Scanner(System.in);
    int num = scn.nextInt();

    if(aList.contains(num)) {
      System.out.println("The number is in the list.");
    } else {
      System.out.println("The number is not in the list.");
    }

    scn.close();

  }  
}
