package math.problems;

public class RecursiveFactorial {
    public static void main(String[] args) {
        long nFactorial = factorialFunction(5);
        System.out.println(nFactorial);

    }
    public static long factorialFunction(long n){
        if (n<=1) return 1;
        return n * factorialFunction(n-1);
    }

    public static int recursiveFactorial() {
        return 0;
    }
}
