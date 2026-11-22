public class Recursion {

	static int fib(int num, int[] dp) {
		if (num < 1) {
			return num;
		}

		if (dp[num] != -1) {
			return dp[num];
		}
		int fib = fib(num - 1, dp) + fib(num - 2, dp);
		dp[num] = fib;

		return fib;
	}

	public static void main(String args[]) {
		int n = 10;
		// int[] dp = new int[n + 1];

		// dp[0] = 0;
		// dp[1] = 1;
		int prev2 = 0;
		int prev = 1;

		for (int i = 2; i <= n; i++) {
			int curr = prev2 + prev;
			prev2 = prev;
			prev = curr;
		}

		System.out.println(prev);
		;
	}
}
