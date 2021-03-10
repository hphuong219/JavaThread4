public class LazyPrimeFactorization implements Runnable{
    private String name;

    public LazyPrimeFactorization(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int number = 100;
        for (int i = 0; i < number; i++) {
            if(isPrime(i)){
                System.out.println(this.name +" "+i+"  is prime");
            }
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
        }

    }
    public  boolean isPrime(int n) {
        if (n <= 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
