import java.util.*;
public class Checkbit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=sc.nextInt();
        int shift=1<<i;
        boolean isSet=(n&shift)!=0?true:false;
        System.out.println(isSet);
    }
}