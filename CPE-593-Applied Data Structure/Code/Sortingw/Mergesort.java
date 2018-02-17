package Sortingw;


import java.io.IOException;

/**
 * author Jiawei Wang
 * CWID 10431455
 * content: firstly split the array, until there are maxium 2 number in one part. then two part merge in order untill final.
 */
public class Mergesort {

    public static void main(String[] args) throws IOException{
        int a[] = {49, 37, 63, 87, 76, 13, 27, 49};
        mergesort(a,  0, a.length - 1);
        for(int i = 0; i < a.length -1; i++){
            System.out.print(a[i]);
            System.out.print(" ");
        }

    }

    public static int [] mergesort(int a[], int left, int right) {
        int mid;
        if(right > left){
            mid = (left + right) / 2;
            mergesort(a, left, mid);
            mergesort(a, mid + 1, right);
            merge(a, left, mid, right);
        }
        return a;

    }

    public static void merge( int a[], int left, int mid, int right) {
        int arr[] = new int[a.length];
        int i, j;
        i = left;
        mid = (left + right) / 2;
        j = mid + 1;
        int n = 0;
        while (i <= mid && j <= right) {
            if (a[i] < a[j]) {
                arr[n++] = a[i++];

            } else {
                arr[n++] = a[j++];

            }
            while (i <= mid) {
                arr[n++] = a[i++];

            }
            while (j <= right) {
                arr[n++] = a[j++];

            }

            for (int h = 0; h <= a.length - 1; h++) {
                a[h] = arr[h];
//            System.out.println(a[h]);
            }
        }

    }
}