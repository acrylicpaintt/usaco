import java.util.*;
import java.io.*;

public class cannonball {
    public static void main(String[] args) throws IOException{

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int[][] line = new int[2][n+1]; //0 -> target/jump pad ; 1 -> v
        for (int i = 1 ; i  < n+1 ; i++ ) {
            line[0][i] = in.nextInt();
            line[1][i] = in.nextInt();
        }
        int[] broken = new int[n+1]; 
       // int[] count = new int[n+1];
        int pos = s;
        int k = 1;
        int direction = 1; //1 = right, -1 = left
        int ans=0;
        int notAdding = 0; 

        while (pos > 0 && pos <= n ) {
            if (line[0][pos] ==1 ) { //if it is a target
                if (line[1][pos] <= k && broken[pos] != 1) {
                    broken[pos] = 1;
                    notAdding = 0;
                }
                else {
                    notAdding++;
                }
            }
            else if (line[0][pos] ==0 ) {
                k += line[1][pos];
                direction *=-1;
                /*if (line[1][pos] == 0 ) {
                    count[pos] +=1;
                    
                }*/
                notAdding++;
                
                
            }



            /*if (count[pos] >3) {
                break;
                
            }*/

            if (notAdding > n) {
                break;
            }
            
            pos = pos + (direction*k);
            
           
        }

        for ( int i = 0 ; i < broken.length ; i++ ) {
            if (broken[i] == 1) {
                ans ++;
            }
        }

        System.out.println(ans);
    }
}