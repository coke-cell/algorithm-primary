package class01;

/**
 * 展现不同算法优劣
 * 1. 求1+2!+3!+...+N!的结果，每一步都求阶乘最后相加
 * 2. 求1+2!+3!+...+N!的结果，每一步先乘以当前数再和之前的和相加（更优秀）
 */
public class Code02_SumOfFactorial {

	public static long f1(int N) {
		long ans = 0;
		for (int i = 1; i <= N; i++) {
			ans += factorial(i);
		}
		return ans;
	}

	public static long factorial(int N) {
		long ans = 1;
		for (int i = 1; i <= N; i++) {
			ans *= i;
		}
		return ans;
	}

	public static long f2(int N) {
		long ans = 0;
		long cur = 1;
		for (int i = 1; i <= N; i++) {
			cur = cur * i;
			ans += cur;
		}
		return ans;
	}

	public static void main(String[] args) {
		int N = 10;
		System.out.println(f1(N));
		System.out.println(f2(N));
	}

}
