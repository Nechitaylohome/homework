import java.util.Scanner;

public class Main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 6;
        int x2 = 6;
        int y2 = 4;
        int x12 = 3;
        int y12 = 5;
        int x22 = 9;
        int y22 = 2;
        System.out.println(" Введите координаты точки ");
        int x = tt.nextInt();
        int y = tt.nextInt();
        boolean p = (x > x1 & x < x2 & y > y2 & y < y1) & (x > x12 & x < x22 & y > y22 & y < y12);

        if (p) {
            System.out.println(" Точка входит в 2 прямоугольник  ");
        }
        else {
            System.out.println(" Точка не входит в 2 прямоугольник");
        }



    }
}
