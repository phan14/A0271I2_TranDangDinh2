package ss15_Xu_li_ngoai_le_Debug.bai_tap;

import java.util.*;

public class Triangle {
    private float a;
    private float b;
    private float c;

    public Triangle(float a, float b, float c) throws IllegalTriangleException {
        this.a = a;
        this.b = b;
        this.c = c;
        if (a > 0 && b > 0 && c > 0) {
            if ((a + b) > c && (a + c) > b && (c + b) > a) {
                System.out.println("khởi tạo thành công");
            } else {
                throw new IllegalTriangleException("Tổng của hai cạnh bất kỳ phải lớn hơn cạnh còn lại ");
            }
        } else {
            throw new IllegalTriangleException("Cạnh của tam giác phải lớn hơn 0");
        }
    }

    public static void main(String[] args) {
        boolean check = false;
        Scanner sc = new Scanner(System.in);

        while (!check) {
            System.out.println("nhập cạnh a: ");
            float a = sc.nextFloat();
            System.out.println("nhập cạnh  b: ");
            float b = sc.nextFloat();
            System.out.println("nhập cạnh  c: ");
            float c = sc.nextFloat();
            try {
                Triangle myTriangle  = new Triangle(a,b,c);
                check = true;
            } catch (IllegalTriangleException ex) {
                System.err.println("Exception: " + ex + ". Vui lòng thử lại: ");
            }
        }
    }
}