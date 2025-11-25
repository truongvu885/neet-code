package sort_algorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arrs = {4,3,7,8,1,2,6,9};

        for (int i = 0; i < arrs.length; i++) {
            for (int j = 0; j < arrs.length - i - 1; j++) {
                if (arrs[j] < arrs[j+1]){
                    int temp = arrs[j];
                    arrs[j] = arrs[j+1];
                    arrs[j+1] = temp;
                }
            }
        }

        for (Integer i : arrs){
            System.out.print(i + " ");
        }
    }
}
