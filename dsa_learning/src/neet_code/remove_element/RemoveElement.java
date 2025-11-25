package neet_code.remove_element;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums1 = {1,1,2,3,4};
        int val = 1;
        int[] nums2 = {1,1,2,3,4};

        System.out.println(removeElementArrayList(nums1, val));
        System.out.println(removeElementTwoPointer(nums2, val));

    }

    public static int removeElementArrayList(int[] nums, int val) {
        List<Integer> res = new ArrayList<>();
        for (int i : nums){
            if (i != val){
                res.add(i);
            }
        }
        for (int i =0 ; i< res.size(); i++){
            nums[i] = res.get(i);
        }
        System.out.println(res);
        return res.size();
    }

    public static int removeElementTwoPointer(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return k;
    }
}
