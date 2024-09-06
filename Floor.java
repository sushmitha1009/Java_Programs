import java.util.Scanner;
public class Floor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }}
        int num=sc.nextInt();
        for(int i=0;i<num;i++){
            int target=sc.nextInt(); 
            if(arr[0]>target){
                System.out.println(Integer.MIN_VALUE);
                continue;
            }
            for(int j=0;j<n;j++){
                if(arr[j]==target){
                    System.out.println(arr[j]);
                    break;
                }
                else if(arr[j]>target){
                    System.out.println(arr[j-1]);
                    break;
                }
                }
        }
        }
    }

