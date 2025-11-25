package sort_algorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {4,3,7,8,1,2,6,9};
        int size = nums.length;

        for (int i = 1; i < size; i++) {
            int key = nums[i];
            int j = i - 1;
            while(j >=0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
        }

        for (Integer i : nums){
            System.out.print(i + " ");
        }
    }
}
