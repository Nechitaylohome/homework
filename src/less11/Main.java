package less11;

import java.util.Scanner;

public class Main {
    static Scanner num = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println( "Введите цифру месяца");
        int a = num.nextInt();
        String w;
        switch (a){
            case 1: w = "Январь 31 день";
                break;
            case 2: w = "Февраль 28 29 Высокосный";
                break;
            case 3: w = "Март 31";
                break;
            case 4: w = "Апрель 30";
                break;
            case 5: w = "Май 31";
                break;
            case 6: w = "Июнь 30";
                break;
            case 7: w = "Июль 31";
                break;
            case 8: w = "Август 31";
                break;
            case 9: w = "Сентябрь 30 ";
                break;
            case 10: w = "Октябрь 31";
                break;
            case 11: w = "Ноябрь 30 ";
                break;
            case 12: w = "Декабрь 31";
                break;
            default:
                w = "Ошибка ввода";
        }
        System.out.println(w);

    }

}




