import java.util.*;

public class Angle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s, totalAngle, singleAngle, ar, a, l;
        System.out.print("Enter the number of sides: ");
        s = sc.nextDouble();
        System.out.print("Enter length of sides: ");
        l = sc.nextDouble();
        totalAngle = (s - 2) * 180;
        System.out.println("Sum of angle of " + s + " sides is " + totalAngle);
        singleAngle = totalAngle / s;
        System.out.println("One angle of a " + s + " sided regular polygon is " + singleAngle);
        a = l / (2 * Math.toDegrees(Math.tan(180 / s)));
        ar = (s * l * a) / 2;
        System.out.println("Area of a polygon of " + s + " sides is " + ar);
    }
}