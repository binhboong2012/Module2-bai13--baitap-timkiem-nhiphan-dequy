package com.codegym;

import static com.codegym.BinarySearchRecursive.binaryRecursive;

public class Main {
    public static void main(String[] args) {
        int [] list = {1, 4, 5, 7, 8, 10, 12, 34, 54, 80};
        int index = binaryRecursive(list, 7, 0, list.length - 1);
        if (index == -1){
            System.out.println(" Không có trong mảng");
        } else {
            System.out.println("Có trong mảng");
        }

    }
}
