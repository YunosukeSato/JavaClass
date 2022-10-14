import java.util.Scanner;

public class Lab4 {
  public static void main(String[] args) {
    String str = "continue";

    do {
      System.out.println("Please type the first number");
      Scanner scn = new Scanner(System.in);
      int num1 = scn.nextInt();
      
      System.out.println("Choose an operation: " + "\n" +
      "> Type + for addition" + "\n" + 
      "> Type - for subtraction" + "\n" +
      "> Type * for multiplication" + "\n" +
      "> Type / for division");
      Scanner scn2 = new Scanner(System.in);
      String op = scn2.next();

      System.out.println("Please type the secont number");
      Scanner scn3 = new Scanner(System.in);
      int num2 = scn3.nextInt();

      switch (op) {
      case "+":
        System.out.println(Calculator.add(num1, num2));
        break;
      case "-":
        System.out.println(Calculator.subtract(num1, num2));
        break;
      case "*":
        System.out.println(Calculator.multiply(num1, num2));
        break;
      case "/":
        if(num1 == 0 || num2 == 0) {
          System.out.println("Cannot divide by zero");
        } else {
          System.out.println(Calculator.divide(num1, num2));
        }
        break;
      }

      System.out.println("Do you want to continue or quit?");
      Scanner scn4 = new Scanner(System.in);
      str = scn4.next();
    } while (str.equals("continue"));
  }
}
