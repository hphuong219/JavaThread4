public class OptimizedPrimeFactorization implements Runnable{
    private String name;

    public OptimizedPrimeFactorization(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int number =100;
        for (int i = 2; i < number; i++) {
            if(isPrime(i)){
                System.out.println(this.name +"  "+i+"  is Prime");
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
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
