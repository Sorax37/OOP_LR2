import java.util.*;

public class Lab1 {

    public static void main(String[] args) {
        String input;
        System.out.println("Enter the data:");
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        String[] scString = input.split(" ");
        Double i[] = new Double[scString.length];
        for (int j = 0; j < scString.length; j++) {
            i[j] = Double.valueOf(scString[j]);
        }
        Point3d Point1 = new Point3d(i[0], i[1], i[2]);

        input = sc.nextLine();
        scString = input.split(" ");
        for (int j = 0; j < scString.length; j++) {
            i[j] = Double.valueOf(scString[j]);
        }
        Point3d Point2 = new Point3d(i[0], i[1], i[2]);

        input = sc.nextLine();
        scString = input.split(" ");
        for (int j = 0; j < scString.length; j++) {
            i[j] = Double.valueOf(scString[j]);
        }
        Point3d Point3 = new Point3d(i[0], i[1], i[2]);

        double result = ComputeArea(Point1, Point2, Point3);
        if ((Point1.comparison(Point2) == true) || (Point2.comparison(Point3) == true) || (Point3.comparison(Point1) == true))
            System.out.println("One of the point is equal to the other");
        else System.out.println(result);
    }

    public static double ComputeArea(Point3d Point1, Point3d Point2, Point3d Point3)
    {
        double a = Point1.distanceTo(Point2);
        double b = Point2.distanceTo(Point3);
        double c = Point3.distanceTo(Point1);
        double p = (a + b + c)/2;
        double S = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return S;
    }
}
