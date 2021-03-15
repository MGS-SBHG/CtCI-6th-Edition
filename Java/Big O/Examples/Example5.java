package Examples;
/*
for each element of arrayA,
	the inner loop goes through b iterations
		where b = arrayB.length
			  a = arrayA.length,

100000 units of work is Still constant

the runtime is O(ab)

 */

public class Example5 {

	void printUnorderedPairs(int[] arrayA, int[] arrayB ) {
		for (int i = 0; i < (arrayA.length); i++) {
			for (int j = 0; j < (arrayB.length); j++) {
				// if statement O(1) work - series of constant-time statements
				for (int k = 0; k < 100000; k++) {
					System.out.print("\t" + arrayA[i] + "," + arrayB[j]);
				}
			}
		}
	}

		public static void main (String[]args){
			System.out.println("main");

			int[] exArray1 = {0,1,2,3,4,5,6,7};
			int[] exArray2 = {0,1,2,3,4,5,6,7};

			Example5 printUnorderedPairsObj = new Example5();

			printUnorderedPairsObj.printUnorderedPairs(exArray1,exArray2);

		}
	}

