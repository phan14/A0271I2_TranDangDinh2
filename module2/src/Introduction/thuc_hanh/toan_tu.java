package Introduction.thuc_hanh;

import java.util.Scanner;

public class toan_tu {
    public static void main(String[] args) {
        float width ;
        float height;

        Scanner sc= new Scanner(System.in);

        System.out.println("enter width: ");
        width = sc.nextFloat();

        System.out.println("enter width: ");
        height = sc.nextFloat();

        float area = height*width;

        System.out.println("Area is :"+area);
    }
}
