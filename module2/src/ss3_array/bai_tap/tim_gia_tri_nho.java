package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class tim_gia_tri_nho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập size phần tử mảng:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] array = new int[size];

        int min;
        for(min = 0; min < array.length; ++min) {
            System.out.print(" phần tử vào mảng thứ " + min+" :");
            array[min] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mảng vừa tạo là :" + Arrays.toString(array));
        min = array[0];
        int index = 0;

        for(int j = 1; j < array.length; ++j) {
            if (array[j] < min) {
                min = array[j];
                index = j;
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là :" + min + " \ncó vị trí là : " + index);
    }
}


