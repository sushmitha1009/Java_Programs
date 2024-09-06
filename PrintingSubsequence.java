import java.util.ArrayList;
public class PrintingSubsequence {
    public static void subsequences(int i,int[] nums,ArrayList<Integer> arr, int n){
        //base condition for recursion
        if(i>=n){
            System.out.print(arr);
            return;
        }
        //pick
        arr.add(nums[i]);
        subsequences(i+1, nums, arr, n);
        //not pick
        arr.remove(arr.size()-1);//removing the last element
        subsequences(i+1, nums, arr, n);
    }
    public static void main(String[] args) {
        int i=0;
        int[] nums={4,5,6};
        int n=nums.length;
        ArrayList<Integer> arr=new ArrayList<>();
        subsequences(i,nums,arr,n);
    }
}
