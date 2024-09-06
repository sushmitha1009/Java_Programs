import java.util.*;
public class SetBits{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int ans=(1<<k)|n;
        System.out.println(ans);
    }
}