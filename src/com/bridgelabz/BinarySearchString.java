package com.bridgelabz;
//import java.util.*;

public class BinarySearchString<T extends Comparable<T>> {

    /*
     * This method search the word from list of words
     * @ arr - Takes String type of array
     * @ x - The key to be found
     * @ return
     */
    public int BinarySearchString(T [] arr, T x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            int res = x.compareTo(arr[m]);
            if (res == 0)
                return m;
            if (res > 0)
                l = m + 1;
            else
                r = m - 1;
        }
        return -1;
    }
}
class BinarySearchMain {
    public static void main(String[] args) {
        String[] arr = { "contribute", "geeks", "rahul", "practice" };
        String x = "rahul";
        BinarySearchString<String> bs = new BinarySearchString<String>();
        int result = bs.BinarySearchString(arr, x);
        if (result == -1)
            System.out.println("Element is not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}