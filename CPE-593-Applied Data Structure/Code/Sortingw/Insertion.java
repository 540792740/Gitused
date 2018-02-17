package Sortingw;


/**
 * author Jiawei Wang
 * CWID 10431455
 * content: insert the second number compared with the first number, then insert the latter number and compare the size.
 */
public class Insertion {

    public static void main(String[] args){
        int[] a = {38,65,97,76,13,27,49};
        Insertsort(a);
        for(int i = 0; i < a.length -1; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }
    public static void Insertsort(int a[]){
        int insert, i, j;
        for(i = 1; i < a.length ; i++){
            insert = a[i];
            j = i - 1;
            while(j >= 0 && insert < a[j] ){
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = insert;


        }

    }

}
