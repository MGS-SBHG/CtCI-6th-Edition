package Examples;
/*
for each element of arrayA,
	the inner loop goes through b iterations
		where b = arrayB.length
if a = arrayA.length,
	the runtime is O(ab)
		NOT runtime O(N^2) because there two different inputs
 */

public class Example4 {

	void printUnorderedPairs(int[] arrayA, int[] arrayB ) {
		for (int i = 0; i < (arrayA.length); i++) {
			for (int j = 0; j < (arrayB.length); j++) {
				// if statement O(1) work - series of constant-time statements
				if (arrayA[i] < arrayB[j]) {
					System.out.print("\t" + arrayA[i] + "," + arrayB[j]);
				}
			}
		}
	}

		public static void main (String[]args){
			System.out.println("main");

			int[] exArray1 = {0,1,2,3,4,5,6,7};
			int[] exArray2 = {0,1,2,3,4,5,6,7};

			Example4 printUnorderedPairsObj = new Example4();

			printUnorderedPairsObj.printUnorderedPairs(exArray1,exArray2);

		}
	}

