import java.util.ArrayList;
import java.util.List;

class IntegerSubsets {
    static void findSubsets(int[] arr, List<Integer> subset, int i, List<List<Integer>> result) {
        if (i == arr.length) {
            result.add(new ArrayList<>(subset));
            return;
        }

        // Include the current element in the subset
        subset.add(arr[i]);
        findSubsets(arr, subset, i + 1, result);

        // Exclude the current element from the subset
        subset.remove(subset.size() - 1);
        findSubsets(arr, subset, i + 1, result);
    }

    public static void main(String args[]) {
        int[] arr = {1, 2, 3};
        List<Integer> subset = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();

        findSubsets(arr, subset, 0, result);

        for (List<Integer> subsetList : result) {
            System.out.println(subsetList);
        }
    }
}

