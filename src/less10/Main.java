package less10;

import java.util.Scanner;

public class Main {
    static Scanner num = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println( "Введите произвольную цифру");
        int a = num.nextInt();
        String w;
        switch (a){
            case 1: w = "Понедельник";
                break;
            case 2: w = "Вторник";
                break;
            case 3: w = "Среда";
                break;
            case 4: w = "Четверг";
                break;
            case 5: w = "Пятница";
                break;
            case 6: w = "Суббота";
                break;
            case 7: w = "Воскресенье ";
                break;
            default:
                w = "Ошибка ввода";
        }
        System.out.println(w);


    }
}
