import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter first side of the triangle");
        double side1= sc.nextDouble();

        System.out.println("Enter second side of the triangle");
        double side2= sc.nextDouble();

        System.out.println("Enter third side of the triangle");
        double side3= sc.nextDouble();

        if(side1 == side2&&side2 ==side3)
        {
            System.out.println("Equalaterial triangle");
        }
        else if (side1 == side2 || side2 == side3 || side1 == side3)
        {
            System.out.println("Isosceles triangle");
        }
        else if (((side1 + side2) > side3) && ((side3 + side2) > side1) && ((side1 + side3) > side2))
        {
            System.out.println("Scalene triangle");
        }
        else
        {
            System.out.println("This is not a triangle");
        }
    }
}