package class01_2;

public class Code02_SumOfFactorial {
    public static int getSumOfFactorial(int num){
        int ans = 0;
        int cur = 1;
        for (int i = 1; i <= num; i++){
            cur *= i;
            ans += cur;
        }
        return ans;
    }
}
