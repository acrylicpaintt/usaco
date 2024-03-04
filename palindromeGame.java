import java.util.*;
import java.io.*;

public class palindromeGame {

    //play optimally -> get to %10 == 0 basically
    public static void main(String[] args) throws IOException  {
        //initialize variables

		Scanner in = new Scanner(System.in);
		long t = in.nextInt();
        in.nextLine();

        for (int n = 0 ; n < t; n++) { 
            String s= in.nextLine();
            if (s.length() < 2) {
                System.out.println("B");
            }
            else if (isPalindrome(s)) {
                System.out.println("B");
            }
            else if(s.substring(s.length()-1).equals("0")) {
                System.out.println("E");
            }
            else {
                System.out.println("B");
            }

        }
    }


    public static boolean isPalindrome(String num) {
     
        for(int i = 0; i < num.length() / 2; i++) 
        { 
        if (num.charAt(i) != num.charAt(num.length() - i - 1)) 
            return false; 
        }   
        return true;

    }
}

    
