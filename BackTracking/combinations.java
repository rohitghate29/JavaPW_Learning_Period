import java.util.ArrayList;
import java.util.List;

public class combinations {

    public static void backtrack(List<List<Integer>> result, List<Integer> comb, int start, int n, int k) {
        if (comb.size() == k) {
            result.add(new ArrayList<>(comb));
            return;
        }
        for (int i = start; i <= n; i++) {
            comb.add(i);
            backtrack(result, comb, i + 1, n, k);
            comb.remove(comb.size() - 1);
        }
    }

    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), 1, n, k);
        return result;
    }

    public static void main(String[] args) {

        List<List<Integer>> res = combine(4,2);
        System.out.println(res);
    }
}
