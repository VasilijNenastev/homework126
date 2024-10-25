public class Main {
    public static void main(String[] args) {
        System.out.println("Циклы. Задача 1.");
        for (int i = 1; i <= 10; i++) {
            System.out.println(+i);
        }

        System.out.println("Циклы. Задача 2.");
        for (int i = 10; i >= 1; i--) {
            System.out.println(+i);
        }

        System.out.println("Циклы. Задача 3.");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(+i);
        }

        System.out.println("Циклы. Задача 4.");
        for (int i = 10; i >= -10; i--) {
            System.out.println(+i);
        }

        System.out.println("Циклы. Задача 5.");
        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }

        System.out.println("Циклы. Задача 6.");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(+i);
        }

        System.out.println("Циклы. Задача 7.");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(+i);
        }

        System.out.println("Циклы. Задача 8.");
        int cash = 29000;//введите сумму в рублях//
        int total = 0;
        for (int i = 1; i <= 12; i++) {
            total = total + cash;
            System.out.println("Месяц " + i + " сумма накоплений составила " + total + " рублей");
        }

        System.out.println("Циклы. Задача 9.");
        int cash1 = 29000;//введите сумму в рублях//
        int total1 = 0;
        for (int i = 1; i <= 12; i++) {
            total1 = total1 + total1 / 100;
            total1 = total1 + cash1;
            System.out.println("Месяц " + i + " сумма накоплений  с учетом процентов составила " + total1 + " рублей");
        }

        System.out.println("Циклы. Задача 10.");
        int figure = 2;
        for (int i = 1; i <= 10; i++) {
            figure = 2 * i;
            System.out.println("2 * " + i + " = " + figure + ".");
        }

    }
}

