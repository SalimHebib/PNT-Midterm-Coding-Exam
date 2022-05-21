package math.problems;

import databases.ConnectToSqlDB;

public class PrimeNumber {

    public static void main(String[] args) {

        primeNumber(1000000);
    }

    public static int primeNumber(int maxNumber) {
        int num;
        for (num = 2; num <= maxNumber; num++) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == true) {
                System.out.println(num);
            }

        }
        return num;

    }


}