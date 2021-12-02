package thi.consollers;

import thi.lib.CheckChoice;
import thi.modles.DienThoaiChinhHang;

import java.util.Scanner;

public class controller {
    public static Scanner sc = new Scanner(System.in);

    public static void displayMenu() {


        System.out.println("----------CHƯƠNG TRÌNH QUẢN LÝ DIỆN THOẠI--------");

        System.out.println("Chọn chức năng theo số ( để tiếp tục)"+
                "Chọn chức năng theo số (để tiếp tục):\n" +
                "1. Thêm mới\n" +
                "2. Xóa\n" +
                "3. Xem danh sách điện thoại\n" +
                "4. Tìm kiếm\n" +
                "5. Thoát\n");
        int choice = CheckChoice.soNguyen();
        while (true) {
            switch (choice) {
                case 1:
                    case1.newAdd();
                    break;
                case 2:

                    break;
                case 3:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Chọn sai,vui lòng chỉ chọn số nguyên từ 1 đến 3");
            }
        }

    }
}
