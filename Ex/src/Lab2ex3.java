import java.util.Scanner;

public class Lab2ex3 {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    
    System.out.print("Enter a word: ");
    String word = scan.nextLine();

    for(int i = 0; i < word.length(); i++) {
      System.out.println(word);
    }

    scan.close();
  }
}
