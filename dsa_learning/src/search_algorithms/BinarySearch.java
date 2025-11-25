package search_algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arrs = {4,7,8,1,19,9,10};
        int target = 9;

        int left = 0,right = arrs.length - 1, result = -1 ;

        Arrays.sort(arrs);
        //after sort => {1,4,7,8,9,10,19}

        while(left <= right){
            int mid = (left + right) / 2;

            if (arrs[mid] == target){
                result = mid;
                break;
            }else if(arrs[mid] < target){
                left = mid + 1;
            }else
                right = mid - 1;
        }

        if (result == -1 ){
            System.out.println("Not found");
        }else
            System.out.println("Found value : "+ target +" in the index: "+ result);
    }
}
