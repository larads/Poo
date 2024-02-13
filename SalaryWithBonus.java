import java.util.Scanner;

public class SalaryWithBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salarioFixo = scanner.nextDouble();
        double totalVendas = scanner.nextDouble();
        
        double salarioTotal = salarioFixo + (totalVendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", salarioTotal);

        scanner.close();
    }
}
