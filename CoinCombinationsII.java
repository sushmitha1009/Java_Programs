import java.util.*;
public class CoinCombinationsII {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int[] ns=new int[x+1];
    ns[0]=1;
    for(int i=n-1;i>=0;i--){
        int cs[]=new int[x+1];
        cs[0]=1;
        for(int j=1;j<=x;j++){
            int skip=ns[j];
            int take=0;
            if(j>=arr[i]){
                take=cs[j-arr[i]];
            }
            cs[j]=skip+take;

        }
        ns=cs;
    }
    System.out.println(ns[x]);
    }
}
