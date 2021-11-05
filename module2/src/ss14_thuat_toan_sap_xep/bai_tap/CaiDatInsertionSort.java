package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class CaiDatInsertionSort {
        public static void main (String[]args){
            int[] arr = {9, 8, 7, 6, 5, 4, 3, 2, 1};
            insertionSort(arr);
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }

        }

        public static void insertionSort ( int[] list){
            int pos, x;
            for (int i = 0; i < list.length; i++) {
                x = list[i];
                pos = i;
                while (pos > 0 && list[pos - 1] > x) {
                    list[pos] = list[pos - 1];
                    pos--;
                }
                list[pos] = x;
            }
        }
    }

