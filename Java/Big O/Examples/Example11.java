package Examples;

/* computes n! or n factorial

time complexity
straight recursion from n to n-1 to 1
is O(n) time
*/


public class Example11 {

    int factorial(int n) {
        if(n<0) {
            return -1;
        } else if (n==0){
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {

        Example11 exampleobj = new Example11();

        System.out.println(exampleobj.factorial(3));
    }
}
