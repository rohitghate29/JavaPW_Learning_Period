import java.util.ArrayList;
import java.util.List;

class permutation {

    public static void backtrack(List<List<Integer>> result, List<Integer> perm, int []nums){
        if(perm.size()==nums.length){
            result.add(new ArrayList<>(perm));
            return;
        }
        for(int i=0; i<nums.length; i++){
            if(perm.contains(nums[i]))
            continue;
            perm.add(nums[i]);
            backtrack(result,perm,nums);
            perm.remove(perm.size()-1);
        }
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }

    public static void main(String[] args) {
        int []nums = {1,2,3};
        List<List<Integer>> result1 = permute(nums);
        System.out.println(result1);
    }
}


/* 
permute method:
    This method initializes an empty list permutations to store all permutations.
    It then calls the backtrack method to generate permutations.
    Finally, it returns the list of permutations.

backtrack method:
    This method recursively generates permutations.
    If the size of tempList (the current partial permutation) is equal to the length of nums, it means we've formed a complete permutation, so it is added to the list of permutations.
    Otherwise, it iterates through each element of nums.
    If the element is already in tempList, it means it has been used before, so we skip it.
    Otherwise, we add it to tempList, recursively call backtrack, and then remove it from tempList to backtrack and try other possibilities.

main method:
    This is where we demonstrate how to use the permute function with the provided examples (nums1, nums2, and nums3). The results are printed to the console.
 */