import java.util.Scanner;
public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int id = 1;
        double productValue, increasePercent, newValue, totalValueNoIncrease = 0;
        int expensiveProductsCount = 0, productsNoIncreaseCount = 0;
        double maxValue = Double.MIN_VALUE;

        while (true) {
            System.out.println("Digite o ID do produto (0 para sair): ");
            id = input.nextInt();
            if (id == 0) break;

            System.out.println("Digite o valor do produto: ");
            productValue = input.nextDouble();

            System.out.println("Digite o percentual de aumento: ");
            increasePercent = input.nextDouble();

            newValue = productValue + (productValue * increasePercent / 100);

            System.out.println("O novo valor do produto " + id + " é R$ " + newValue);

            if (increasePercent == 0) {
                totalValueNoIncrease += productValue;
                productsNoIncreaseCount++;
            }

            if (newValue > 100 && increasePercent > 5) {
                expensiveProductsCount++;
            }

            if (newValue > maxValue) {
                maxValue = newValue;
            }
        }

        double averageNoIncreaseValue = productsNoIncreaseCount > 0 ? totalValueNoIncrease / productsNoIncreaseCount : 0;

        System.out.println("Quantidade de produtos mais caros que R$ 100,00 e que tiveram aumento superior a 5%: " + expensiveProductsCount);
        System.out.println("Média de valor dos produtos que não sofreram aumento: R$ " + averageNoIncreaseValue);
        System.out.println("Valor do produto mais caro (após aumento): R$ " + maxValue);
    }
}
