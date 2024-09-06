import java.util.*;
public class Frequency{
    public static void main(String[] args) {
        HashMap<Integer,Integer> hash=new HashMap<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(hash.containsKey(arr[i])){
                hash.put(arr[i],hash.get(arr[i])+1);
            }
            else{
                hash.put(arr[i],1);
            }
        }
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            int target=sc.nextInt();
            if(hash.containsKey(target)){
                System.out.println(hash.get(target));
            }
            else{
                System.out.println(0);
            }
        }
    }
}