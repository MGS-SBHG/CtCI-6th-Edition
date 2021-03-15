package Examples;
/*
 O(N) time
 even though iterate array twice
*/

public class Example1 {

	void foo(int[] array) {
		int sum = 0;
		int product = 1;
		for (int i = 0; i < (array.length - 1); i++){
			sum+=array[i];
		}
		for(int i=0; i < (array.length - 1); i++){
			product*=array[i];
		}
		System.out.println(sum + ", " + product);
	}
	
	public static void main(String[] args) {
		System.out.println("main");

		int[] exArray = {2,5,6,8,1,12};

		Example1 fooObj = new Example1();

		fooObj.foo(exArray);

	}
}
