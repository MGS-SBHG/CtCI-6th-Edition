package Examples;
/*
what the code means
    the code "touches" Each node Once
    it does a constant amount of work with each "touch"
        (EXCLUDING recursive calls)

runtime will be linear in terms of number of nodes
    if N nodes, runtime is O(N)

recursive model
for recursive branch with multiple branches
runtime = O(branches^depth)

    2 branches at each call,
        O(2^depth)

depth
    tree is a balanced binary search tree
        if N total nodes,
            depth = logN roughly
O(2^logN)

log-sub-2 = 2^P = Q -> log-sub-2-Q = P

2^logN is a relationship between 2 and log

P = 2^logN
-> log-sub-2-P = log-sub-2-N
-> P = N
-> 2^(logN) = N

runtime of thee code = O(N)
    N = number of nodes

*/


public class Example9 {
/*
    int sum(Node node) {
        if (node == null) {
            return 0;
        }
        return sum(node.left) + node.value + sum(node.right);
    }
*/

    public static void main(String[] args) {

    }
}
