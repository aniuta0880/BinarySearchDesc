package com.company;

import java.util.ArrayList;
import java.util.Scanner;

class Main {

    /* Modify this method */
    public static int binarySearch(int[] A, int x) {
        int low = 0;
        int high = A.length - 1;
        int mid = -1;
        while (low <= high) {
            mid = low + (high-low)/2;
            if (x >= A[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        if (mid >= 0 && x == A[mid]) {
            return mid;
        }
        return -1;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elem = scanner.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()) {
            list.add(scanner.nextInt());
        }
        int[] array = new int[list.size()];
        for (int i = 0; i < array.length; i++) {
            array[i] = list.get(i);
        }
        System.out.println(binarySearch(array,elem));
    }
}

