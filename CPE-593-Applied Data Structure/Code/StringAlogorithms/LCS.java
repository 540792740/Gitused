package StringAlogorithms;

import java.io.*;
import java.util.*;

/**
 * author Jiawei Wang
 * CWID 10431455
 */

public class LCS {
    public static void main (String[] args) throws IOException {

        Scanner sc1 = new Scanner(new File(args[0]));   //java lcs args[0]
        Scanner sc2 = new Scanner(new File(args[1]));      //java lcs args[1]
        sc1.useDelimiter("\\Z");                        //定界符
        sc2.useDelimiter("\\Z");
        String s1 = sc1.next();                         //next
        String s2 = sc2.next();

        int l = LCS(s1,s2);
        System.out.println(l);
    }


    public static int LCS(String s1, String s2){
        int i1 = s1.length();
        int j1 = s2.length();
        int[][] dp = new int[i1 + 1][j1 + 1];
        for(int i = 1; i <= s1.length(); i++){
            for(int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else if (dp[i - 1][j] <= dp[i][j - 1]) {
                    dp[i][j] = dp[i][j - 1];
                } else
                    dp[i][j] = dp[i - 1][j];
                }
            }
            return dp[i1][j1];
        }
    }


