import java.util.*;
public class RainbowArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++){
            int n=sc.nextInt();
            int arr[]=new int[n];
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=arr.length-1;
        while(left<right){
            if(arr[left]==arr[right] ){
            if(arr[left]>=1 && arr[right]>=1){
                if(arr[left]<=7 && arr[right]<=7){
                left++;
                right--;
            }
        }
    }
}
        if(left==right){
        System.out.print("yes");
        }
        else{
            System.out.print("no");
        }
}
}