import java.util.*;

public class SubsequenceSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> al = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            al.add(sc.nextInt());
        }
        
        while (al.size() > 1) {
            List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < al.size() - 1; i++) {
                temp.add(al.get(i) + al.get(i + 1));
            }
            al = temp;
            System.out.println(al);  // Print intermediate results
        }
    }
}
//input: 5
//1 2 3 4 5
//output: [3, 5, 7, 9, 11]
        //[8, 12, 16]
        //[20, 28]
        //[48]