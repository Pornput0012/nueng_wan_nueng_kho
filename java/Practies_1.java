import java.util.Scanner;

class Practies_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Start Practies #1 ===");

        String firstName = sc.nextLine();
        String lastName = sc.nextLine();

        System.out.printf("สวัสดี %s %s\n", firstName, lastName);

        String twoCharFirstName = firstName.length() < 2 ? firstName
                : firstName.charAt(0) + "" + firstName.charAt(1);

        String twoCharLastName = lastName.length() < 2 ? lastName
                : lastName.charAt(0) + "" + lastName.charAt(1);

        System.out.printf("%s%s",
                twoCharFirstName,
                twoCharLastName);

        sc.close();
    }
}
