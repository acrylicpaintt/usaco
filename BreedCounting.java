import java.util.*;
import java.io.*;

public class BreedCounting {
    

    public static void main(String[] args) throws IOException  {
        //initialize variables

        BufferedReader br = new BufferedReader(new FileReader("bcount.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("bcount.out")));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int q = Integer.parseInt(st.nextToken());

        int[] h = new int[n+1];
        int[] g = new int[n+1];
        int[] j = new int[n+1];

        for (int i = 0 ; i < n ; i++ ) {
            int k = Integer.parseInt(br.readLine());
            h[i+1] = h[i];
            g[i+1] = g[i];
            j[i+1] = j[i];
            if (k == 1 ) {
                h[i+1] += 1;
            }
            else if (k == 2) {
                g[i+1] += 1;
            }
            else {
                j[i+1] += 1;
            }
        }

        for (int i = 0 ; i < q; i++ ) {
            StringTokenizer s = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(s.nextToken());
            int last = Integer.parseInt(s.nextToken());
            pw.println((h[last]-h[first-1])+ " " + (g[last]-g[first-1]) + " " +( j[last] - j[first-1]));
        }
        pw.close();
    }
}