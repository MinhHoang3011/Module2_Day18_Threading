package BT_Optional;

public class Test {
    public static void main(String[] args) {
        LazyPrimeFactorization lazyPrimeFactorization = new LazyPrimeFactorization();
        OptimizedPrimeFactorization optimizedPrimeFactorization = new OptimizedPrimeFactorization();

        Thread thread = new Thread(lazyPrimeFactorization);
        Thread thread1 = new Thread(optimizedPrimeFactorization);

        thread.start();
        thread1.start();
    }
}
