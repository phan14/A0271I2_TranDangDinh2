package ss3_array.bai_tap;

import java.util.Arrays;

public class gop_mang {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int length = a.length + b.length;

        int [] c =new int[length];

        int i=0;
        for( int elment :a){
            c[i]=elment;
            i++;
        }
        System.out.println("mảng a:"+ Arrays.toString(a));

        for( int elment :b){
            c[i]=elment;
            i++;
        }
        System.out.println("mảng b:"+ Arrays.toString(b));

        System.out.println("\n-----------");
        System.out.println("mảng 1 và mảng 2"+Arrays.toString(c));



    }
}
