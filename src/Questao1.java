import java.util.Scanner;
public class Questao1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o saldo médio do cliente: ");
        double saldoMedio = scanner.nextDouble();

        double percentualCredito;

        if (saldoMedio >= 0 && saldoMedio <= 200) {
            percentualCredito = 0;
        } else if (saldoMedio <= 400) {
            percentualCredito = 0.2 * saldoMedio;
        } else if (saldoMedio <= 600) {
            percentualCredito = 0.3 * saldoMedio;
        } else {
            percentualCredito = 0.4 * saldoMedio;
        }

        System.out.println("Saldo médio: " + saldoMedio);
        System.out.println("Valor do crédito: " + percentualCredito);
    }
}
