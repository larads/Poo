import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double raio = scanner.nextDouble();
        double pi = 3.14159;
        double area = pi * Math.pow(raio, 2);

        System.out.printf("A=%.4f\n", area);

        scanner.close();
    }
}
