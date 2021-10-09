package ss3_array.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class them_phan_tu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào chiều dài của mảng");
        int N = Integer.parseInt(scanner.nextLine());
        int[] array = new int[N];

        int X;
        for(X = 0; X < array.length; X++) {
            System.out.println("hãy nhập phần tử có vị trí là " + X);
            array[X] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("mảng vừa tạo là" + Arrays.toString(array));


        System.out.println("nhập phần từ mà bạn muốn thêm");
        X = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập vị trí bạn muốn thêm");
        int a = Integer.parseInt(scanner.nextLine());
        if (a <= 1 && a >= array.length - 1) {
            System.out.println("không thêm được phần tử vào mảng");
        }

        array[a] = X;
        System.out.print("Mảng sau khi chèn phần tử " + X + " là: " + Arrays.toString(array));
    }
}