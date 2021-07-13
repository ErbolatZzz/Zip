package HWStream1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamMain {

    public static void main(String[] args) {

        int[] a = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        int[] c = new int[a.length];

        printArray(a);

        int k = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[i] > k && a[i] % 2 == k) {
                    int b = a[i];
                    c[j] = b;
                    Arrays.sort(c);
                    System.out.print(b + " ");
                }
            }
        }
        System.out.print(Arrays.toString(c) + " ");
    }
        public static void printArray ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }




