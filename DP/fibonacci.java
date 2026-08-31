
import java.util.*;
public class fibo {
public static int f(int n, int[] dp){
    if(n==1 || n==2){
        return n-1;
    }
    if(dp[n]!=-1){
        return dp[n];
    }
    dp[n]=f(n-1,dp)+f(n-2,dp);
    return dp[n];

}
public static void main(String[] args) {
    int n=10;
    int[] dp = new int[n+1];
    Arrays.fill(dp,-1);
    int k=f(n,dp);
    System.out.println(k);
  }   
}
