import java.util.ArrayList;
import java.util.List;

public class Lab5_3 {
  public static void main(String[] args) {
    List<Car> cars = new ArrayList<>();
    cars.add(new Car("Honda", "23", 2001));
    cars.add(new Car("Suzuki", "12", 1999));
    cars.add(new Car("Matsuda", "34", 2022));
    cars.add(new Car("BMW", "33", 2021));
    
    cars.sort(null);

    System.out.println(cars);
  }
}
  class Car implements Comparable<Car> {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
      this.brand = brand;
      this.model = model;
      this.year = year;  
    }

    @Override
    public String toString() {
      return "[" + this.brand + " " + this.model + " " + this.year + "]";
    }

    @Override
    public int compareTo(Car o) {
      return this.year - o.year;
    }


  }  

