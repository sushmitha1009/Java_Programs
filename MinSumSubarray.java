import java.util.*;
public class MinSumSubarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=arr[0];
        int maxsum=arr[0];
        for(int i=0;i<n;i++){
            if(sum>=0){
                sum+=arr[i];
            }
            else{
                sum=arr[i];
            }
            if(sum<maxsum){
                maxsum=sum;
        }
    }
    System.out.println(maxsum);
}
}

