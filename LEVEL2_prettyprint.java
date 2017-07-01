/**
 * Created by alex_
 * Checkpoint: Level 2
 * PRETTYPRINT
 */

public class Solution {
    public ArrayList<ArrayList<Integer>> prettyPrint(int a) {

        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

        int N = (a * 2) - 1;

        for (int i = 0; i < N; i++) {
            ans.add(new ArrayList<Integer>(Collections.nCopies(N, 0)));
        }

        for (int l = 0; l < a - 1; l++) {

            for (int i = 0; i < N - 1 - 2 * l; ++i) {

                ans.get(l).set(l + i, a - l);
                ans.get(l + i).set(N - 1 - l, a - l);
                ans.get(N - 1 - l).set(N - 1 - l - i, a - l);
                ans.get(N - 1 - l - i).set(l, a - l);

            }
        }
        ans.get(a - 1).set(a - 1, 1);
        return ans;
    }
}