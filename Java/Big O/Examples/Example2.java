package Examples;
/*
meaning of the code: print All pairs (two element sequences)
	there are O(N^2) pairs
	therefore O(N^2) runtime

the inner loop has O(N); it is called N times
	the runtime is O(N^2)

*/

public class Example2 {

	void printPairs(int[] array) {
		for (int i = 0; i < (array.length - 1); i++) {
			for (int j = 0; j < (array.length - 1); j++) {
				System.out.println(array[i] + "," + array[j]);
			}
		}
	}

		public static void main (String[]args){
			System.out.println("main");

			int[] exArray = {2, 5, 6, 8, 1, 12};

			Example2 printPairsObj = new Example2();

			printPairsObj.printPairs(exArray);

		}
	}

