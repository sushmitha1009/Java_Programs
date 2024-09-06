import java.util.Scanner;
public class Spiralmatrix{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tot=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
            a[i][j]=sc.nextInt();
        }}
        int l=0,r=n-1,t=0,b=n-1;
        while(l<=r && t<=b){
            for(int j=l;j<=r;j++){
                System.out.print(a[t][j]+" ");
            }
            t++;
            for(int j=t;j<=b;j++){
                System.out.print(a[j][r]+" ");
            }
            r--;
            if(t<=b){
            for(int j=r;j>=l;j--){
                System.out.print(a[b][j]+" ");
            }
            b--;
        }
        if(l<=r){
            for(int j=b;j>=t;j--){
                System.out.print(a[j][l]+" ");
            }
            l++;
        }
    }
}
}