import java.util.Scanner;

public class SimpleCalculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoProduto1 = scanner.nextInt();
        int quantidadeProduto1 = scanner.nextInt();
        double precoProduto1 = scanner.nextDouble();

        int codigoProduto2 = scanner.nextInt();
        int quantidadeProduto2 = scanner.nextInt();
        double precoProduto2 = scanner.nextDouble();

        double valorTotal = (quantidadeProduto1 * precoProduto1) + (quantidadeProduto2 * precoProduto2);

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", valorTotal);

        scanner.close();
    }
}
