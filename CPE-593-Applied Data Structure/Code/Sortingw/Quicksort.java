package Sortingw;


/**
 * author Jiawei Wang
 * CWID 10431455
 * content: find a pivot number, put the number which is smaller than pivot number in forward to pivot number
 *                               put the number which is larger than pivot number in backward to pivot number
 *                               split the array untill there are no more than two number in each part.
 */
public class Quicksort {

    public static void main(String[] args) {
        int a[] = {49, 37, 63, 87, 76, 13, 27, 49};
        quicksort(a);
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print(a[i]);
            System.out.print(" ");
        }
    }

    public static void quicksort(int a[]){
        Sort(a, 0, a.length -1);

    }

    public static void Sort(int a[], int low, int hight){
        int i, j, index;
        if(low > hight){
            return;
        }
        i = low;
        j = hight;
        index = a[i];
//        index = (low + hight) / 2;
        while(i < j){
            while(i < j && a[j] >= index){
                j--;
            }
            if(i < j){
                a[i] = a[j];
                i++;
            }
            while(i < j && a[i] <= index){
                i++;
            }
            if(i < j){
                a[j--] = a[i];
            }
            a[i] = index;
            Sort(a, low, i -1);
            Sort(a, i + 1, hight);
        }

    }
}
