import java.util.Arrays;
import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] salaries = new double[10];
        double maxSalary = Double.MIN_VALUE;

        for (int i = 0; i < salaries.length; i++) {
            System.out.print("Digite o salário " + (i + 1) + ": ");
            salaries[i] = input.nextDouble();
            if (salaries[i] > maxSalary) {
                maxSalary = salaries[i];
            }
        }
        System.out.println("O maior salário é: " + maxSalary);
        input.close();
    }
}
