import java.util.Scanner;

// public class Lab4 {
//   public static void main(String[] args) {
//     String str = "continue";

//     do {
//       System.out.println("Please type the first number");
//       Scanner scn = new Scanner(System.in);
//       int num1 = scn.nextInt();
      
//       System.out.println("Choose an operation: " + "\n" +
//       "> Type + for addition" + "\n" + 
//       "> Type - for subtraction" + "\n" +
//       "> Type * for multiplication" + "\n" +
//       "> Type / for division");
//       Scanner scn2 = new Scanner(System.in);
//       String op = scn2.next();

//       System.out.println("Please type the secont number");
//       Scanner scn3 = new Scanner(System.in);
//       int num2 = scn3.nextInt();

//       switch (op) {
//       case "+":
//         System.out.println(Calculator.add(num1, num2));
//         break;
//       case "-":
//         System.out.println(Calculator.subtract(num1, num2));
//         break;
//       case "*":
//         System.out.println(Calculator.multiply(num1, num2));
//         break;
//       case "/":
//         if(num1 == 0 || num2 == 0) {
//           System.out.println("Cannot divide by zero");
//         } else {
//           System.out.println(Calculator.divide(num1, num2));
//         }
//         break;
//       }

//       System.out.println("Do you want to continue or quit?");
//       Scanner scn4 = new Scanner(System.in);
//       str = scn4.next();
//     } while (str.equals("continue"));
//   }
// }

public class Lab4 {
  public static void main(String[] args) throws Exception {
    Calculator calc = new Calculator();
    Scanner scanner =  new Scanner(System.in);
    String exit = "";

    while(!exit.toLowerCase().equals("quit")) {
      try {
        System.out.println("Please type the first number: ");
        double n1 = scanner.nextDouble();
        System.out.println("Choose an operation:\n"
          + " > Type + for addition\n"
          + " > Type - for subtraction\n"
          + " > Type * for multiplication\n"
          + " > Tupe / for division\n");
          String op = scanner.next();
          System.out.println("Type the second number:");
          double n2 = scanner.nextDouble();

          calc.doCalculation(op, n1, n2);
          calc.printResult(op);

          System.out.println("Do you want to 'continue' or 'quit'?");

          exit = scanner.next();
      } catch (InvalidOperatorException e) {
        System.out.println(e.getMessage());
      } catch (ArithmeticException e) {
        System.out.println("Cannot divide by zero. Please try again...");
      }

    }

    System.out.println("Bye");
    scanner.close();
    System.exit(0);
  }
}