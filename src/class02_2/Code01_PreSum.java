package class02_2;

public class Code01_PreSum {
    public static class RangeSum1 {
        private int[] arr;

        public RangeSum1(int[] arr){
            this.arr = arr;
        }

        public int rangeSum(int L, int R){
            int sum = 0;
            for (int i = L; i <= R; i++){
                sum += arr[i];
            }
            return sum;
        }
    }

    public static class RangeSum2{
        private int[] preSum;

        public RangeSum2(int[] arr){
            preSum = new int[arr.length];
            int sum = 0;
            for (int i = 0; i < arr.length; i++){
                preSum[i] = sum + arr[i];
                sum = preSum[i];
            }
        }

        public int rangeSum(int L, int R){
            return L == 0? preSum[R] : preSum[R] - preSum[L - 1];
        }
    }
}
