package Sortingw;


/**
 * author Jiawei Wang
 * CWID 10431455
 * just sort, if the second number is larger than first number, swap, then every time find smaller than the first number
 *          swap the two number.
 */
public class Selection {

    public static void main(String[] args){
        int arr[] = {6, 5, 6, 7, 1, 2, 8, 9};
        for(int i = 0; i < arr.length - 1; i++) {          //先找第0位，一直找到最后一位
            for (int j = i; j < arr.length - 1; j++) {     //第i位开始，如果后面的j比i小，ij互换
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(" ");
        for(int i = 0; i <= arr.length - 1; i++){
            System.out.print(arr[i]);
        }

    }
}
