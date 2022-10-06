package Lab1;
import java.util.Scanner;

public class Ex1of1 
{
    private static final double PI = Math.PI;

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Radius");
        double radius = scan.nextDouble();

        double area = radius * radius * PI;
        System.out.println(area);

        scan.close();
    }
}
