package HWStream1;
import java.util.*;
public class StreamMain {
    public static void main(String[] args) {

        int[] a = {1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4};
        List<Integer> list = new ArrayList<>();
        printArray(a);

        int k = 0;
        for (int j = 0; j < a.length; j++) {
            if (a[j] > k && a[j] % 2 == k) {
                list.add(a[j]);
            }
        }
        Collections.sort(list);
        System.out.println(list);
    }

    public static void printArray ( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}




