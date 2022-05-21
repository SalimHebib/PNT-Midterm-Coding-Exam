package math.problems;

import org.junit.Test;

import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {

        int i = 1, n = 40, firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Series till " + n + " terms:");

        while (i <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

            i++;
        }

    }

    public static List<Integer> fibonacci() {

        return null;
    }
}