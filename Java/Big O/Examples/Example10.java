package Examples;

/*
how many iterations the "for" loop goes through

loop starts when x = 2;
stops when x * x = n Or x = sqrt of n

runtime is O(sqrt of n)

 */
public class Example10 {

    boolean isPrime(int n) {
        for (int x = 2; x * x <= n; x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }

    // sames as
    boolean isPrime2(int n) {
        for (int x = 2; x <= Math.sqrt(n); x++) {
            if (n % x == 0) {
                return false;
            }
        }
        return true;
    }

}
