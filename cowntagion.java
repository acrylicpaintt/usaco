import java.util.*;
import java.io.*;

public class cowntagion {

    public static void main(String[] args) throws IOException  {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); //num farms
        List<List<Integer>> graph = new ArrayList<List<Integer>>();

        for (int i = 0; i< n; i++ ){ 
            graph.add(new LinkedList<>());
        }
        for (int i = 0 ; i < n-1 ;i++ ) {
            int a = in.nextInt();
            int b = in.nextInt();
            graph.get(a-1).add(b-1);
            graph.get(b-1).add(a-1);
        }

        int nights = n-1; // min possible
        boolean done = false; 

        for (int i = 0; i < n; i ++ ) {
            if (graph.get(i).size() < 1){
                continue;
            }
            int goal = graph.get(i).size();
            if (i != 0 ) {
                goal --;
            }
            int temp = 1;
            while (temp < goal+1) { //why goal+1?
                temp *= 2;
                nights++;
            }
            
            
        }

        System.out.println(nights);
    }
    

}