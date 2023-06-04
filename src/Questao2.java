public class Questao2 {
    public static void main(String[] args) {
        double S = 0.0;
        for (double x = 1, y = 1; x <= 99; x+=2, y++) {
            S += x/y;
            System.out.println("O valor de x é: " + x);
            System.out.println("O valor de y é: " + y);
            System.out.println("O valor de x/y é: " + x/y);
            System.out.println("O valor de S é: " + S);
            System.out.println("-----------------------");
        }
    }
}