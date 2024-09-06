import java.util.*;
public class SearchInRotatedSortedArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target=sc.nextInt();
        int l=0,r=arr.length-1;
        while(l<=r){
            int mid=(l+r)/2;
            if(arr[mid]==target){
                System.out.println(mid);
            }
            //sort left to mid
            else if(arr[l]<=arr[mid]){
                if(arr[l]<=target && arr[mid]>=target){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            //sort mid to right
            else if(arr[mid]<=arr[r]){
                if(arr[mid]<=target && arr[r]>=target){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
        }
        System.out.print("-1");
    }

}