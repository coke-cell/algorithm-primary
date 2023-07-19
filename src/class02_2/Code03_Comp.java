package class02_2;

public class Code03_Comp {
    public static int[] lenRandomValueRandom(int maxLen, int maxValue){
        int len = (int) (Math.random() * maxLen);
        int[] ans = new int[len];
        for (int i = 0; i < len; i++){
            ans[i] = (int) (Math.random() * maxValue);
        }
        return ans;
    }

    public static int[] copyArray(int[] arr){
        int[] ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++){
            ans[i] = arr[i];
        }
        return ans;
    }

    public static boolean equalValues(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++){
            if (arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int[] arr){
        if (arr.length < 2){
            return true;
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            if (arr[i] < max){
                return false;
            }
            max = Math.max(max, arr[i]);
        }
        return true;
    }
}
