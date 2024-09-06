import java.util.HashMap;
import java.util.Scanner;
public class Duplicate{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<n;i++){
            hash.put(arr[i],hash.getOrDefault(arr[i],0)+1);
        }
        for(int i=0;i<n;i++){
            if(hash.get(arr[i])==1){
                System.out.println(arr[i]);
            }
        }
    }
}