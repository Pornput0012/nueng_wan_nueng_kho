import java.util.InputMismatchException;
import java.util.Scanner;

public class Practies_3 {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=== Start Practies #3 ===");

            int currentMoney = sc.nextInt();

            if (currentMoney <= 0) {
                throw new IllegalArgumentException();
            }

            int tenCoinCount = (int) Math.floor(currentMoney / 10);
            int fiveCoinCount = (int) Math.floor((currentMoney - (tenCoinCount * 10)) / 5);
            int twoCoinCount = (int) Math.floor((currentMoney - (tenCoinCount * 10 + fiveCoinCount * 5)) / 2);
            int oneCoinCount = currentMoney - (tenCoinCount * 10) - (fiveCoinCount * 5) - (twoCoinCount * 2);

            System.out.printf("10 บาท = %d\n", tenCoinCount);
            System.out.printf("5 บาท = %d\n", fiveCoinCount);
            System.out.printf("2 บาท = %d\n", twoCoinCount);
            System.out.printf("1 บาท = %d\n", oneCoinCount);

        } catch (InputMismatchException e) {
            System.out.println("กรุณากรอกเฉพาะตัวเลขจำนวนเต็มเท่านั้น!");
        } catch (Exception e) {
            System.out.println("กรุณากรอกเฉพาะตัวเลขจำนวนเต็มบวกเท่านั้น!");
        }
    }
}
