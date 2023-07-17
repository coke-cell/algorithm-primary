package class01_2;

public class Code03_Sort{
    public static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
    
    public static void selectSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i = 0; i < arr.length; i++){
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++){
                minIndex = arr[j] < arr[minIndex] ? j : minIndex; 
            }
            swap(arr, i, minIndex);
        }
    }

    public static void bubbleSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        for (int i = arr.length - 1; i >= 0; i--){
            for (int second = 1; second <= i - 1; second++){
                if (arr[second - 1] < arr[second]){
                    swap(arr, second - 1, second);
                }
            }
        }
        
    }

    public static void insertSort(int[] arr){
        if (arr == null || arr.length < 2){
            return;
        }
        int j;
        for (int i = 0; i < arr.length; i ++){
            int cur = arr[i];
            for (j = i; j > 0 && arr[j] < arr[j-1] ; j--){
                arr[j] = arr[j-1];
            }
            arr[j] = cur;
        }
    }

}