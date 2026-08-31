class Solution {
    public static int f(int n, int[] dp){
        if(n==1 || n==2){
            return n;
        }
        if(dp[n]==-1){
            dp[n]=f(n-1,dp)+(n-1) * f(n-2,dp);
        }
        else{
            return dp[n];
        }
        return dp[n];
    }
    public int countFriendsPairings(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        int k=f(n,dp);
        return (k);
    }
}
