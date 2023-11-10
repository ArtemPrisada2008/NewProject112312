package lesson13;

public class Factorial {
    public static void main(String[] args) {
        int a = 3;
        int b = factorial(a);
        System.out.println(b);
    }

    //1x2x3x4x5
    private static int factorial(int a) {
        if (a == 1) {
            return a;
        }
        int b = a * factorial(a-1);
        return b;
    }
}
