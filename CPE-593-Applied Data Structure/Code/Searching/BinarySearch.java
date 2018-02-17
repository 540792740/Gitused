package Searching;

import java.util.Random;

/**
 * author: Jiawei Wang
 * CWID: 10431455
 * content: compare the specific number with the 1/2 array number, if different, compare with it and compard with another part.
 */

public class BinarySearch {
    private static Random r;    //for testing try a bunch of seeds. if you get one that does not work, keep tring


    public static int[] generateRandom(int n) {
        int[] a = new int[n];   //O(n)
        for (int i = 0; i < n; i++) {
            a[i] = r.nextInt();

        }
        return a;
    }


    public static int binarySearch(int [] x, int target){
        int L = 0;
        int R = x.length -1;
        while (L < R){
            int g = (L + R) / 2;
            if (x[g] < target)
                L = g + 1;
            else if(x[g] > target)
                R = g - 1;
            else
                return g;
        }

        return 0;
    }

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        int[] x = generateRandom(n);
    }

    public static void print(int [] a){
        for(int x : a){
            System.out.print(x + " ");
        }
    }
}
