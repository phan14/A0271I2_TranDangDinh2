package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class xoa_phan_tu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhập chiều dài mảng");
        int N=Integer.parseInt(sc.nextLine());
        int [] arr =new int[N];

        int X;
        for (X=0 ;X< arr.length;X++){
            System.out.println("nhập phần tử index thứ i :" +X);
            arr[X]=Integer.parseInt(sc.nextLine());
        }

        System.out.println("mảng vừa tạo là:"+ Arrays.toString(arr));
        System.out.println("nhập phân từ mà bạn muốn xóa");
        X = Integer.parseInt(sc.nextLine());
        boolean check = true;
        int n = 0;

        int i;
        for(i = 0; i < arr.length; i++) {
            if (X == arr[i]) {
                n = i;
                check = true;
                break;
            }

            check = false;
        }

        if (!check) {
            System.out.println("Phần tử cần xóa không có trong mảng này!!!");
        } else {
            for(i = n; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1]=0;
            System.out.print("Mảng mới sau khi xóa là: " + Arrays.toString(arr));
        }

    }
}