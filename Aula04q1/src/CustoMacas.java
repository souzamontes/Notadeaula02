import java.util.Scanner;

public class CustoMacas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de maçãs compradas: ");
        int quantidadeMacas = scanner.nextInt();

        scanner.close();

        double precoPorMaca;
        if (quantidadeMacas < 12) {
            precoPorMaca = 1.30;
        } else {
            precoPorMaca = 1.00;
        }

        double custoTotal = quantidadeMacas * precoPorMaca;

        System.out.println("O custo total da compra é: R$" + custoTotal);
    }
}
