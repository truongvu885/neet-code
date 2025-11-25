package sort_algorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arrs = {4,3,7,8,1,2,6,9,5};

//        int size = arrs.length;
//        while(size > 0){
//            int idxSwap = 0;
//            for (int i = 0; i < size; i++) {
//                if (arrs[i] > arrs[idxSwap]){
//                    idxSwap = i;
//                }
//            }
//            int temp = arrs[size - 1];
//            arrs[size - 1] = arrs[idxSwap];
//            arrs[idxSwap] = temp;
//            size --;
//        }

        // Sắp xếp Tăng dần (Tìm MIN)
        for (int i = 0; i < arrs.length -1 ; i++) {
            int minIdx = i; // Giả sử phần tử đầu tiên là nhỏ nhất
            for (int j = i + 1; j < arrs.length; j++) {
                if (arrs[minIdx] < arrs[j]) {
                    minIdx = j; // Cập nhật chỉ số nhỏ nhất
                }
            }
            // Đổi chỗ phần tử nhỏ nhất tìm được với phần tử đầu tiên của phần chưa sắp xếp
            int temp = arrs[minIdx];
            arrs[minIdx] = arrs[i];
            arrs[i] = temp;
        }
        for (Integer i : arrs){
            System.out.print(i + " ");
        }
    }
}
