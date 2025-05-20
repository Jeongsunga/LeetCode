class Solution {
    public int climbStairs(int n) {
        int[] memo = new int[n + 1];
        return fibonacci(n, memo);
    }

    private int fibonacci(int n, int[] memo) {
        if (n == 0 || n == 1) return 1;
        if (memo[n] != 0) return memo[n];
        memo[n] = fibonacci(n - 1, memo) + fibonacci(n - 2, memo);
        return memo[n];
    }

}