import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double r = sc.nextDouble();  // Radius
        double l = sc.nextDouble();  // Length
        double b = sc.nextDouble();  // Breadth
        double ba = sc.nextDouble(); // Base
        double h = sc.nextDouble();  // Height

        double carea = Math.PI * r * r;
        double rarea = l * b;
        double tarea = 0.5 * ba * h;
        System.out.printf("%.2f%n", carea);
        System.out.printf("%.2f%n", rarea);
        System.out.printf("%.2f%n", tarea);
        
        sc.close();
    }
}
