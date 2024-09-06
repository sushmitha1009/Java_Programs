import java.util.*;
public class TheGreatRun {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int s=0;s<t;s++){
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int j=0;j<n;j++){
            arr[j]=sc.nextInt();
        }
        int left=0;
        int right=k-1;
        int max=Integer.MIN_VALUE;
        while(right<n){
            int sum=0;
            for(int i=left;i<=right;i++){
            sum+=arr[i];
            }
            if(sum>max){
                max=sum;
            }
            left++;
            right++;
        }
        System.out.print(max);
    }
    }
}
