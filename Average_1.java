import java.util.Scanner;

public class Average_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();

        double pesoA = 3.5;
        double pesoB = 7.5;

        double MEDIA = (A * pesoA + B * pesoB) / (pesoA + pesoB);

        System.out.printf("MEDIA = %.5f\n", MEDIA);

        scanner.close();
    }
}
