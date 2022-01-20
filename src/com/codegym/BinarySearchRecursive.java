package com.codegym;

public class BinarySearchRecursive {
    static int binaryRecursive(int[] list, int key, int low, int high){
        if (high >= low) {
            int mid = (low + high) / 2;
            if (list[mid] == key) {
                return mid;
            } else if (list[mid] > key) {
                high = mid - 1;
                return binaryRecursive(list, key, low, high);
            }else {
                low = mid + 1;
                return binaryRecursive(list, key, low, high);
            }
        }
        return -1;
    }


}
