package two_sum;

import java.util.Arrays;

public class TwoSumBruteForce {
    public static void main(String[] args) {
        
        int[] nums_1 = {3,4,5,6};
        int target_1 = 7;

        int[] nums_2 = {4,5,6};
        int target_2 = 10;

        int[] nums_3 = {5,5};
        int target_3 = 10;
        System.out.println(Arrays.toString(twoSumCaculated(nums_1, target_1)));
        System.out.println(Arrays.toString(twoSumCaculated(nums_2, target_2)));
        System.out.println(Arrays.toString(twoSumCaculated(nums_3, target_3)));
    }

    private static int[] twoSumCaculated(int[] nums, int target) {

        int [] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target){
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}
