package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class them_phan_tu {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 2};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử cần chèn: ");
        int x = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn: ");
        int index = scanner.nextInt();
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        if (index <= 1 && index >= arr.length - 1) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
            int[] result = new int[arr.length + 1];
            int j = 0;

            for(int i = 0; i < arr.length; ++i) {
                if (i == index) {
                    result[j++] = x;
                }

                result[j++] = arr[i];
            }

            System.out.println("Mảng sau khi thêm: " + Arrays.toString(result));
        }

    }
}
