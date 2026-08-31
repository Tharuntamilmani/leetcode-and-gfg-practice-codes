class Solution {
    public int nCr(int n, int r) {
        int[][]dp=new int[n+1][r+1];
        for(int i=0;i<=n;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(n,r,dp);
    }
    public int solve(int n, int r,int[][]dp){
        if(n<r) return 0;
        if(n==r || r==0) return 1;
        if(dp[n][r]!=-1) return dp[n][r];
        dp[n][r]=solve(n-1,r,dp)+solve(n-1,r-1,dp);
        return dp[n][r];
    }
}
