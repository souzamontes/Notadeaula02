import java.util.Scanner;

public class ControleEstoque {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a quantidade atual em estoque:");
        int quantidadeAtual = scanner.nextInt();

        System.out.println("Informe a quantidade máxima em estoque:");
        int quantidadeMaxima = scanner.nextInt();

        System.out.println("Informe a quantidade mínima em estoque:");
        int quantidadeMinima = scanner.nextInt();

        double quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2.0;

        if (quantidadeAtual >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }

        scanner.close();
    }
}
