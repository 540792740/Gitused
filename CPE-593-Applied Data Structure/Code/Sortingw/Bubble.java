package Sortingw;


/**
 * author Jiawei Wang
 * CWID 10431455
 */
public class Bubble {
    public static void main(String[] args) {
        int a[] = {6, 5, 6, 7, 1, 2, 8, 9};
        bubble(a);
        System.out.println(a.length);
        for (int i1 = 0; i1 <= a.length - 1; i1++) {
            System.out.print(a[i1]);
            System.out.print(" ");

        }
    }

    public static void bubble(int a[]) {
        int temp = 0;
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = 0; j <= a.length - 2 - i; j++) {
                if (a[j] < a[j + 1]) {
                    a[j] = a[j];

                } else {
                    temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}

//    public static void main(String[] args) {
//        int[] arr = {6, 5, 6, 7, 1, 2, 8, 9};
////        for (int i1 = 0; i1 <= arr.length - 1; i1++) {
////            System.out.print(arr[i1]);
////        }
//        System.out.println(" ");
//        for (int j = 0; j <= arr.length - 1; j++) {
//            for (int i = 0; i <= arr.length - 2 - j; i++) {
//                if (arr[i] >= arr[i + 1]) {
//                    int temp;
//                    temp = arr[i + 1];
//                    arr[i + 1] = arr[i];
//                    arr[i] = temp;
//                }
//                else arr[i] = arr[i];
//            }
//        }
//        for (int i2 = 0; i2 <= arr.length - 1; i2++) {
//            System.out.print(arr[i2]);
//        }
//    }
//}


