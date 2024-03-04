import java.util.*;
import java.io.*;

public class cowCrossTwo {
    

    public static void main(String[] args) throws IOException  {
        //initialize variables

        BufferedReader br = new BufferedReader(new FileReader("maxcross.in"));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("maxcross.out")));
        StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
        
        //read input

        int[] pSum = new int[n+1];
        int[] sigs = new int[n+1];
        // input broken signals
		for (int i = 0; i < b; i++) { sigs[Integer.parseInt(br.readLine())]++; }

		// prefix sums precomputation
		for (int i = 0; i < n; i++) { pSum[i + 1] = sigs[i + 1] + pSum[i]; }


        int ans = n+1;

        
        for (int i = 0 ; i <= n-k ; i++ ) {
       
            ans = Math.min(ans, pSum[i+k]-pSum[i]);
        }

        

        
        
        pw.println(ans);
        pw.close();
    }
}