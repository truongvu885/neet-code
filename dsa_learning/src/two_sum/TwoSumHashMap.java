package two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumHashMap {
    public static void main(String[] args) {
        int[] nums_1 = {3,4,5,6};
        int target_1 = 7;

        int[] nums_2 = {4,5,6};
        int target_2 = 10;

        int[] nums_3 = {5,5};
        int target_3 = 10;
        System.out.println(Arrays.toString(twoSumCalculated(nums_1, target_1)));
        System.out.println(Arrays.toString(twoSumCalculated(nums_2, target_2)));
        System.out.println(Arrays.toString(twoSumCalculated(nums_3, target_3)));
    }

    private static int[] twoSumCalculated(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int diffValue = target - nums[i];
            if (map.containsKey(diffValue)){
                return new int []{map.get(diffValue), i};
            }
            map.put(nums[i],i);
        }
        return new int[]{};
    }

}
