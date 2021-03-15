package Examples;
/*
count the iterations
	first time through: j runs for N-1
	second time		  : j runs for N-2
	third time		  : j runs for N-3
	nbr of steps is (N-1) + (N-2) + (N-3) + ... 2 + 1
	= 1 + 2 + 3 + ... + N-1
	=sum of 1 through N-1
	= N(N-1)/2

	runtime = O(N^2)

what the code means
	it iterates through each pair of values for (i,j)
		where j > 1
	N^2 total pairs
		roughly half: 	1<j
		remaining half: i>J
	code goes through (N^2)/2 pairs
		it does O(N^2) work

*/

public class Example3 {

	void printUnorderedPairs(int[] array) {
		for (int i = 0; i < (array.length); i++) {
			for (int j = i + 1; j < (array.length); j++) {
				System.out.print("\t" + array[i] + "," + array[j]);
			}
			System.out.println("\t\t");
		}
	}

		public static void main (String[]args){
			System.out.println("main");

			int[] exArray = {0,1,2,3,4,5,6,7};

			Example3 printUnorderedPairsObj = new Example3();

			printUnorderedPairsObj.printUnorderedPairs(exArray);

		}
	}

