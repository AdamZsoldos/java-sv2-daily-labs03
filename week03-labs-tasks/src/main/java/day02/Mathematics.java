package day02;

public class Mathematics {

    public static void main(String[] args) {
        System.out.println("Prime numbers up to 500:");
        for (int i = 0; i < 500; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
