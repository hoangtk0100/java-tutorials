public class Recursion {
    static int factorial(int n) {
        if (n != 0) {
            return n * factorial(n -1);
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        int result = factorial(4);
        System.out.println("Factorial of 4: " + result);
    }
}
