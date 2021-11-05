package ss15_Xu_li_ngoai_le_Debug.bai_tap;


import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        System.out.println("Hãy nhập z: ");
        int z = scanner.nextInt();
        IllegalTriangleException calc = new IllegalTriangleException();
        calc.check(x, y ,z );

    }
    public void check(int x,int y,int z){
        try {
            if (x <= 0 || y <= 0 || z <= 0) {
                throw new InputMismatchException("Không phải là tam giác vì có cạnh nhỏ hơn 0");
            } else if (x + y <= z || y + z <= x || z + x <= y) {
                throw new InputMismatchException("Không phải tam giác vì tổng 2 cạnh nhỏ hơn 1 cạnh");
            } else {
                System.out.println("đúng");

            }
        } catch (Exception e) {
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }

}


