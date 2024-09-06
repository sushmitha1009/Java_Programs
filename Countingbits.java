import java.util.*;
public class Countingbits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int count=0;
        for(int i=n;i<=m;i++){
            int num=i;
            while(num>0){
                count+=num&1;
                num>>=1;
            }
        }
        System.out.print(count);
    }
}