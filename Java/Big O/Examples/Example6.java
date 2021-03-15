package Examples;
/*
running through Half the array does Not impact
Big O run time = O(N)
*/

public class Example6 {
	void reverse(int[] array) {
		for (int i = 0; i < (array.length / 2); i++) {
			int other = array.length - i - 1;
			int temp = array[i];
			array[i] = array[other];
			array[other] = temp;
			System.out.println("array[i] " + array[i]);
			System.out.println("array[other] " + array[other]);
		}
	}

		public static void main (String[]args){
			System.out.println("main");

			int[] exArray1 = {0,1,2,3,4,5,6,7};

			Example6 reverseObj = new Example6();

			reverseObj.reverse(exArray1);
		}
	}
