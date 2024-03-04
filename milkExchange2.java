import java.util.*;
import java.io.*;

public class milkExchange2 {


    public static void main(String[] args) throws IOException  {

		Scanner in = new Scanner(System.in);
		long n = in.nextLong(); // cows, goes to 10^5
        long m = in.nextLong(); //minutes, goes to 10^9
        in.nextLine();
        String direction = in.nextLine();
        long[] limit = new long[(int) n];
        long[] bucket = new long[(int) n];
        List<List<Integer>> graph = new ArrayList<List<Integer>>();
        for (int i = 0 ; i< n; i++ ) {
            limit[i] = in.nextInt();
            bucket[i] = limit[i];
            graph.add(new LinkedList<>());
        }

         

        for (int i = 0; i< n; i++ ) {
            if (direction.substring(i,i+1).equals("L")) {
                if (i == 0) {
                    graph.get(i).add((int)(n)-1);
                }
                else {
                    graph.get(i).add(i-1);
                }
            }
            else {
                if (i == n-1) {
                    graph.get(i).add(0);
                }
                else {
                    graph.get(i).add(i+1);
                }
                
            }
        }


        for (long x = 0; x < m; x++ ) {
            for (long i = 0 ; i< n; i++) { 
                if (bucket[(int)i] >0) {
                    bucket[graph.get((int)i).get(0)] += 1;
                    bucket[(int)i]-=1;
                }      
            }
            for (long i = 0 ; i< n ; i++ ) {
                if (bucket[(int)i] > limit[(int)i]) {
                    bucket[(int)i] = limit[(int)i];
                }
            }   
        }
        long sum = 0;

        for (int i = 0; i < n; i++ ) {
            sum += bucket[i];
        }

        System.out.println(sum);

    }
}
//28


