package Array.Medium;

import java.util.*;

public class permutation {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};

        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);

        System.out.println(ans);
    }

    public static void helper(int[] nums, int index, List<List<Integer>> ans) {

        // base case
        if (index == nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.add(num);
            }
            ans.add(list);
            return;
        }

        // 🔥 duplicate avoid set
        Set<Integer> set = new HashSet<>();

        for (int i = index; i < nums.length; i++) {

            // skip duplicate
            if (set.contains(nums[i])) continue;

            set.add(nums[i]);

            swap(nums, i, index);

            helper(nums, index + 1, ans);

            swap(nums, i, index); // backtrack
        }
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}