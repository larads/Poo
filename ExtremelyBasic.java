import java.util.Scanner;

public class ExtremelyBasic {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int X = A + B;

            System.out.println("X = " + X);
        }
    }
}
