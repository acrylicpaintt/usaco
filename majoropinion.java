import java.util.*;
import java.io.*;

//Alicia Yoon
//aliciayyoon

public class majoropinion{
    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(System.in);
        int t = in.nextInt(); //test case

        for (int x = 0 ; x < t ; x++ ) {
            int n = in.nextInt(); // cows
            int[] h = new int[n]; // hay
            String ans = "";
            int[] possible = new int[n+1];


            for ( int i = 0 ; i  <  n ; i ++ ) {
                h[i] = in.nextInt();

            }

            for (int i = 0 ; i < n-2;i++) {
                
                if (h[i] == h[i+1] || h[i] == h[i+2]) {
                    possible[h[i]] = 1;
                }
                if (h[i] == h[i+1] || h[i+1] == h[i+2]) {
                    possible[h[i+1]] = 1;
                }
            
            }

            if (h[0] == h[1]) {
                possible[h[0]] = 1;
            }
            

            
            for (int i = 0 ; i < possible.length ; i++ ) {
               
                if (possible[i] ==  1) {
                    ans += "" + i + " ";
                }
            }

            if (ans.length() == 0 ) {
                System.out.println("-1");
            }
            else {
                System.out.println(ans.substring(0,ans.length()-1));
            }
        }
    }
}
        
