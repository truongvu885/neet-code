package neet_code.majority_element;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
//        int[] nums = {5,5,1,1,1,5,5,2,2};
        int[] nums = {5,5,1,1,5,5,1};

//        System.out.println(majorityElement(nums));
        System.out.println(majorityElementBoyerMooreVoting(nums));
    }

    public static int majorityElementBoyerMooreVoting(int[] nums) {
        int res = 0, count = 0;

        for (int num : nums) {
            if (count == 0) {
                res = num;
            }
            count += (num == res) ? 1 : -1;
        }
        return res;
    }
    public static int majorityElementHashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int res = 0, maxCount = 0;
        for (int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
            if(map.get(num) > maxCount){
                res = num;
                maxCount = map.get(num);
            }
        }
        return res;
    }

    public static int majorityElement(int[] nums) {
        int avergrege = nums.length/2;
        for(int i=0; i<nums.length ; i++){
            int count = 1;
            for(int j = 1; j < nums.length; j++){
                if(nums[i] == nums[j]){
                    count++;
                }
            }
            if (count > avergrege){
                System.out.println(nums[i]+ ","+count);
                return nums[i];
            }
        }
        return nums[0];
    }
}
