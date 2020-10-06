package less5;

public class Main {
    public static void main(String[] args) {
        Boolean a = false;
        Boolean b = false;
        Boolean c = true;
        Boolean d1 = a | b & !c;
        Boolean d2 = !(a & c) | b;
        Boolean d3 = a & (!b & !c);
        System.out.println(d1 + "  " + d2 + "  " + d3);
    }
}