package search_algorithms;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arrs = {4,7,8,1,19,9,10};

        int target = 9;
        int result = -1;
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i] == target){
                result = i;
            }
        }

        if (result == -1 ){
            System.out.println("Not found");
        }else
            System.out.println("Found value : "+ target +" in the index: "+ result);
    }
}
