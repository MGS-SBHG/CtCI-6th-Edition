package Examples;
/*
counts all permutations of a string


how many times permutation gets called In its base case?
        need to pick characters for each "slot"
            if 7 characters,
                slot 1, 7 choices;
                    pick a character
                slot 2, 6 choices left
                    pick a character
                slot 3, 5 choices left
                    pick a character
                ...
                slot 7, 0 choices left

    7*6*5*4*3*2*1 options or 7 factorial or 7!

    n! permutations

    permutation is called n! times in its base case
        when prefix is the full permutation

how many times permutation gets called Before its base case?
    how many times the "for" loop is called
        a large call tree representing All call
            n! leaves
            each leaf is attached to a path of length n
        No More than
                n * n! function calls (or nodes) in the tree

how long each function call take
    "O(n)" time - each char needs to be printed
        System.out.println(prefix);

    "O(n)" time combined: body of "for" loop
        String rem = str.substring(0,i) + str.substring(i + 1);
        permutation(rem, prefix + str.charAt(i));

    "n" time for sum of lengths
        rem, prefix + str.charAt(i)

    each node corresponds to "O(n)" work

total runtime:
    we are calling permutation O(n * n!) times as an upper bound
        each one takes O(n) time
    total runtime will Not exceed O(n^2 * n!)

*/
public class Example12 {
    void permutation(String str) {
        permutation(str, "");
    }//permutation

    void permutation(String str, String prefix){
        if (str.length()==0) {
            System.out.println(prefix);
        }else {
            for (int i = 0; i < str.length(); i++) {
                String rem = str.substring(0,i) + str.substring(i + 1);
                permutation(rem, prefix + str.charAt(i));
            } // for
        }//else
    }//permutation

}
