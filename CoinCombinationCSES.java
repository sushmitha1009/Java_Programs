import java.util.*;

public class CoinCombinationCSES {
    public static void main(String[] args) {
 Scanner sc= new Scanner(System.in);
	    int n=sc.nextInt();
	    int t=sc.nextInt();
	    
	    int[] a= new int[n];
	    for(int i=0;i<n;i++)
	     a[i]=sc.nextInt();
	    int[] dp=new int[t+1];
	    
	    dp[0]=1;
	    for(int i=1;i<=t;i++){
	        for(int j=0;j<n;j++){
	            if(i>=a[j])
	             dp[i]=(dp[i]+dp[i-a[j]])%1000000007;
	        }
	    }
		
	    System.out.println(dp[t]);        
    }
}