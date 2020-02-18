import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter rectangle's width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter rectangle's height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width,height);
        System.out.println(rectangle.toString());
        System.out.println("This rectangle's area is: " +rectangle.getArea());
        System.out.println("This rectangle's perimeter is: " +rectangle.getPerimeter());
    }
}
