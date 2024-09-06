
import java.util.*;
public class SubArraySum {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            count+=arr[i];
            if(count==x){
                
            }
        }
        System.out.println(count);
    }
}
