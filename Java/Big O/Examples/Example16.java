package Examples;
/*
 prints the powers of 2
 from 1 through n (inclusive)

 ie n = 4, prints 1,2,4
 ie n = 50, prints 25,12,6,3,1,2,4,8,16,32

 approach the runtime;
		what the code is supposed to be doing
			computing the powers of 2 from 1 through n

*/

public class Example16 {

	public static int powersOf2(int n) {
		if (n < 1) {
			System.out.println("n < 1");
			return 0;
		} else if (n == 1) {
			System.out.println("n == 1");
			System.out.println(1);
			return 1;
		} else {
			int prev = powersOf2(n / 2);
			System.out.println("prev: " + prev);
			int curr = prev * 2;
			System.out.println("curr: " + curr);
			// System.out.println(curr);
			return curr;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		powersOf2(4);
		powersOf2(50);

	}
}
