import java.util.InputMismatchException;
import java.util.Scanner;

class Practies_2 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== Start Practies #2 ===");

            double fahrenheit = sc.nextDouble();
            double c = (fahrenheit - 32.0) * (5.0 / 9.0);

            System.out.printf("%.8f", c);

        } catch (InputMismatchException e) {
            throw new Error("ใส่ค่าเป็นทศนิยมเท่านั้น...");
        }
    }

}