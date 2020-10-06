package less6;

import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Введите два числа");
        int a = tt.nextInt();
        int b = tt.nextInt();
        int d = a * a + b * b;
        Boolean dd = d <= 4;
        if (dd) {
            System.out.println("есть решение");
        } else {
            System.out.println("Нет решения");
        }







    }
}