import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            int num=s.nextInt();
            System.out.println((int)Math.sqrt(num));
           
        }
        s.close();
    }
}