package less3;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class main {
    static Scanner tt = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Введите три числа");
        int a = tt.nextInt();
        int b = tt.nextInt();
        int c = tt.nextInt();
        int d = b*b - 4 * a *c;
        boolean dd = d<0;
        if(dd){
            System.out.println("нет корней");
        }else{
            System.out.println("корни есть");
            double x1 = (-b - sqrt(d))/(2*a);
            double x2 = (-b + sqrt(d))/(2*a);
            System.out.println("X1=" + x1);
            System.out.println("X2=" + x2);

    }

    }
}
