package ss2_loop.bai_tap;

import java.util.Scanner;

public class hien_thi_loai_hinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. In hình chữ nhật ");
            System.out.println("2. In hình tam giác vuông ");
            System.out.println("3. Exit");
            System.out.println("Enter your choice: ");
            choice = Integer.parseInt(input.nextLine());
            int a, i, j;
            switch (choice) {
                case 1:
                    System.out.println("nhap chieu dai: ");
                    int width = Integer.parseInt(input.nextLine());
                    System.out.println("nhap chieu rong: ");
                    int height = Integer.parseInt(input.nextLine());

                    for (a = 0; a <= height; a++) {
                        for (j = 0; j < width; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println(" Nhập cạnh của tam giác: ");
                    a = Integer.parseInt(input.nextLine());
                    System.out.println("Bạn muốn tam giác ở vị trí nào : " + "\n" +
                            "1.Có cạnh góc vuông ở botton-left " + "\n" +
                            "2.Có cạnh góc vuông ở top-left" +"\n"+
                            "3.In tam giác cân ");
                    j = Integer.parseInt(input.nextLine());
                    switch (j) {
                        case 1:
                            i = a;

                            for (i = 1; i <= a; i++) {
                                for (j = 1; j < i; j++) {
                                    System.out.print("*");
                                }
                                System.out.println();
                            }
                            break;
                        case 2:
                            i = a;
                            for (i = a; i >= 1; i--) {
                                for (j = 1; j <= i; j++) {
                                    System.out.println("*");
                                }
                                System.out.println();

                            }
                            break;
                        case 3:
                            i = a;
                            for (i = 1; i <= a; i++) {

                                for (int k = a; k > i; k--) {
                                    System.out.print(" ");
                                }
                                //theo công thức i=i*2-1
                                for (j = 1; j <= i * 2 - 1; j++) {
                                    System.out.print("*");
                                }
                                System.out.print(" ");
                                System.out.println();

                            }
                            break;

                    }


                case 3:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
