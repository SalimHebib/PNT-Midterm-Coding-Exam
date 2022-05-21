package math.problems;

public class IterativeFactorial {
    public static void main(String[] args) {
        int factorialProduct = 1;
        for (int i = 1; i <= 5; i++) {
            factorialProduct = factorialProduct * i;
            System.out.println(i);
        }
        System.out.println("\n Iterative java factorial result : " + factorialProduct);

    }

    public static int iterativeFactorial() {
        return 0;
    }
}
