import java.util.*;
import java.io.*;

public class maxProd {

    //find sums of things that equal ot n
    

    public static void main(String[] args) throws IOException  {
        //initialize variables

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
        int q = in.nextInt();
        int[] closing = new int[n+1];
        int[] bstart = new int[n+1];
        int[] difference = new int[n+1];

        for (int i = 0; i < n ; i++ ) {
            difference[i+1] = in.nextInt();
            closing[i+1] = closing[i] +difference[i+1];
        }
        for (int i = 0; i < n ; i++ ) {
             bstart[i+1] = bstart[i] + in.nextInt();
             difference[i+1] -= (bstart[i+1]-bstart[i]);
        }

        Arrays.sort(difference);

        for (int x = 0; x < q; x++ ) {
            int v = in.nextInt();
            int s = in.nextInt();


            if(difference[difference.length-v] > s ){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }

        }
    }
}