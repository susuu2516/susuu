public class PrimeNumbers {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i <= 20000; i++) {
            if (isPrime(i)) {
                System.out.printf("%-6d", i);
                count++;
                if (count % 5 == 0) {
                    System.out.println();
                }
            }
        }
    }
    
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}