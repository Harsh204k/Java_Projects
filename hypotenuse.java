import java.util.Scanner;

public class hypotenuse {
    public static void main(String[] args) {
        double a;
        double b;
        double c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of side a: ");
        a = input.nextDouble();
        System.out.println("Enter the length of side b: ");
        b = input.nextDouble();
        c = Math.sqrt((a*a) + (b*b));
        System.out.println("The length of the hypotenuse side: " + c);
    }
}
