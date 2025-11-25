package sort_algorithms;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {4,3,7,8,1,2,6,9};

        mergeSort(nums, 0, nums.length - 1);

        for (Integer i : nums){
            System.out.print(i + " ");
        }
    }

    public static void mergeSort(int[] nums, int left, int right){
        if(left < right){
            int mid = (left + right)/2;
            mergeSort(nums, left, mid);
            mergeSort(nums, mid + 1, right);

            System.out.println("left: " + left + ", right: " + right+ ", mid: " + mid);
            merge(nums, left, mid, right);
        }
    }

    private static void merge(int[] nums, int left, int mid, int right){

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] lArr = new int[n1];
        int[] rArr = new int[n2];

        for(int x = 0; x < n1; x++){
            lArr[x] = nums[left+x];
        }

        for(int x = 0; x < n2; x++){
            rArr[x] = nums[mid+1+x];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while(i < n1 && j < n2){
            if(lArr[i] <= rArr[j]){
                nums[k] = lArr[i];
                i++;
            }else {
                nums[k] = rArr[j];
                j++;
            }
            k++;
        }

        while(i < n1){
            nums[k] = lArr[i];
            i++;
            k++;
        }

        while (j < n2){
            nums[k] = rArr[j];
            j++;
            k++;
        }
    }
}
