import java.util.Scanner;

public class Average_2 {
      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double media = ((A * 2) + (B * 3) + (C * 5)) / 10;

        System.out.printf("MEDIA = %.1f\n", media);

        scanner.close();
    }
}
