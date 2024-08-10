import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int num1 = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int num2 = scanner.nextInt();

        if (num1 == 0 || num2 == 0) {
            System.out.println("У нулей нет НОД");
        } else {
            int nod = findNod(num1, num2);
            if (nod == 1) {
                System.out.println("Числа " + num1 + " и " + num2 + " взаимно простые");
            } else {
                System.out.println("Числа " + num1 + " и " + num2 + " не взаимно простые");
            }
            System.out.println("Nod: " + nod);
        }
    }

    public static int findNod(int a, int b) {
        while (b != 0) {
            int ost = a % b;
            a = b;
            b = ost;
        }
        return a; //а=НОД
    }
}