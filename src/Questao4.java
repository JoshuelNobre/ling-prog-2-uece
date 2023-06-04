import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Person {
    int age;
    int id;
    int opinion;

    Person(int age, int id, int opinion) {
        this.age = age;
        this.id = id;
        this.opinion = opinion;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", id=" + id +
                ", opinion=" + opinion +
                '}';
    }
}

public class Questao4 {
    public static void main(String[] args) {
        final int NUMBER_OF_PEOPLE = 200;

        int totalAge = 0;
        int countOpinion10 = 0;
        int countOpinion5OrLess = 0;
        int maxAge = Integer.MIN_VALUE;
        int idOfOldestPerson = -1;

        List<Person> people = new ArrayList<>();

        Random rand = new Random();

        for (int i = 0; i < NUMBER_OF_PEOPLE; i++) {
            int age = rand.nextInt(100); // gera idade entre 0 e 99
            totalAge += age;

            int id = i + 1; // atribui um ID único para cada pessoa

            int opinion = rand.nextInt(11); // gera opinião entre 0 e 10

            if (opinion == 10) {
                countOpinion10++;
            }

            if (opinion <= 5) {
                countOpinion5OrLess++;
            }

            if (age > maxAge) {
                maxAge = age;
                idOfOldestPerson = id;
            }

            people.add(new Person(age, id, opinion));
        }

        double averageAge = (double) totalAge / NUMBER_OF_PEOPLE;
        double percentageOpinion5OrLess = (double) countOpinion5OrLess * 100 / NUMBER_OF_PEOPLE;

        System.out.println("Quantidade de respostas 10: " + countOpinion10);
        System.out.println("Média de idade das pessoas que responderam o questionário: " + averageAge);
        System.out.println("Percentagem de pessoas que responderam 5 ou menos para a opinião da peça: " + percentageOpinion5OrLess + "%");
        System.out.println("O identificador da pessoa mais velha: " + idOfOldestPerson);

        // Imprime a lista de pessoas
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
