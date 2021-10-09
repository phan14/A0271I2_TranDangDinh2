package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MangHaiChieuLonNhat {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Hãy nhập số hàng của mảng : ");
    int row = Integer.parseInt(input.nextLine());
        System.out.println("Hãy nhập số cột của mảng : ");
    int col = Integer.parseInt(input.nextLine());
    int[][] arr = new int[row][col];

        System.out.println("Nhập các phần tử cho ma trận: ");
    int max;
    int x;
        for(max = 0; max < arr.length; ++max) {
        for(x = 0; x < arr[max].length; ++x) {
            System.out.print("A[" + max + "]["+ x + "] = ");
            arr[max][x] = Integer.parseInt(input.nextLine());
        }
    }

        System.out.println("Mảng vừa tạo là: ");

        for(max = 0; max < arr.length; ++max) {
        for(x = 0; x < arr[max].length; ++x) {
            System.out.print(arr[max][x]+"\t");
        }
    }

    max = arr[0][0];
    x = 0;
    int y = 0;

        for(int i = 0; i < arr.length; ++i) {
        for(int j = 0; j < arr[i].length; ++j) {
            if (arr[i][j] > max) {
                max = arr[i][j];
                x = i;
                y = j;
            }
        }
    }

        System.out.print("\nSố lớn nhất trong ma trận là: " + max + " ở vị trí " + x + ", " + y);
}
}
