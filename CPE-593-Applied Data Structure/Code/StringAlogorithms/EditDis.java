package StringAlogorithms;

import java.io.*;
import java.util.*;

/**
 * author Jiawei Wang
 * CWID 10431455
 */

public class EditDis {
    public static void main (String[] args) throws IOException{
        Scanner sc1 = new Scanner (new File(args[0]));
        Scanner sc2 = new Scanner (new File(args[1]));

        sc1.useDelimiter("\\z");
        sc2.useDelimiter("\\z");

        String s1  = sc1.next();
        String s2  = sc2.next();

        Edit(s1, s2);

        int l = Edit(s1,s2);
        System.out.println(l);

    }

    private static int Edit(String s1, String s2) {
        int i1 = s1.length();
        int j1 = s2.length();
        int[][] dp = new int[i1 + 1][j1 + 1];
        for(int i = 1; i < s1.length() + 1; i++){
            for(int j = 1; j < s2.length() + 1; j++){
                if(s1.charAt(i - 1) == s2.charAt( j - 1)){
                    dp[i][j] = dp[i - 1][j - 1];
                }
                else
                    if(dp[i - 1][j] <= dp[i][j - 1]){
                        dp[i][j] = dp [i - 1][j] + 1;
                    }
                    else {
                        dp[i][j] = dp[i][j - 1] + 1;
                    }
            }

        }
        return dp[i1][j1];
    }

}
