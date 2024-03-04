import java.util.*;
import java.io.*;

public class newbacteria {
    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Long> values = new ArrayList<Long>(n);
        long ideal = (long) in.nextInt();
        values.add(0, ideal);
      
        int k = 0;
        if (ideal < 0 ) {
            k = -1;
        }
        else {
            k = 1;
        }
        ideal = Math.abs(ideal);
        long ans = 0;

        for (int i = 1 ; i  < n  ; i ++ ) {
            values.add(i, (long) in.nextInt());            
            
        }

        long difference = 0;
        for (int j = 1; j <  n ; j++) {
            ideal++;
            difference = ideal *k - (long)values.get(j);//what it needs
            if (difference ==0 ) {
                continue;
            }
            
            for (int i = n-1; i >= j ; i-- ) {
                values.set(i, values.get(i) + (n-j-Math.abs(n-1-i))*difference);
            }
            ans+= Math.abs(difference);
        }
        ans++;
        System.out.println(ans+"");
    }
}