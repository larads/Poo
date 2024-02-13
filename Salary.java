import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroFuncionario = scanner.nextInt();
        int horasTrabalhadas = scanner.nextInt();
        double valorPorHora = scanner.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

        scanner.close();
    }
}
