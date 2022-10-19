import java.util.ArrayList;
import java.util.Random;

public class Lab5_2 {
  public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    Random rand = new Random();
    
    for(int i = 0; i < 10; i++) {
      list.add((rand.nextInt(50) + 1));
    }

    ArrayList<Integer> list2 = new ArrayList<>(list);

    list.set(9, -5);

    System.out.println(list);
    System.out.println(list2);
 
  }
}