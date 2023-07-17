package class02_2;

/**
 * 题：从等概率得到1-5的函数得到等概率得到1-7的函数
 * 思路：
 * 1. 等概率得到0 1
 * 2. 1-7有7个数，接近8，为3个二进制位，从等概率0 1的函数可以得到等概率8个数的函数，其中一个命中时重算即可
 */
public class Code02_RandToRand {
    public static int f(){
        return (int) (Math.random() * 5) + 1;
    }

    // 先得到等概率 0 1函数
    public static int a(){
        int ans = 0;
        do {
            ans = f();
        }while (ans == 3);
        return ans < 3 ? 0 : 1;
    }

    // 等概率返回0-6
    public static int b(){
        int ans = 0;
        do {
            ans = (a() << 2) + (a() << 1) + a();
        } while (ans == 7);
        return ans;
    }

    // 等概率返回 1-7
    public static int c(){return b() + 1;}




}
