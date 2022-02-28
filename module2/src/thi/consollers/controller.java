package thi.consollers;

import thi.lib.CheckChoice;


public class controller {
    public static void displayMenu() {
        System.out.println("----------CHƯƠNG TRÌNH QUẢN LÝ DIỆN THOẠI--------");
        System.out.println("Chọn chức năng theo số ( để tiếp tục)\n" +
                "1. Điện thoại chính hãng\n" +
                "2. Điện thoại xách  tay\n" +
                "3. Thoát\n");
        int choiceOne = CheckChoice.soNguyen();
        while (true) {
            switch (choiceOne) {
                case 1:
                    controllerChinhHang.addNew();
                    break;
                case 2:
                    controllerXachTay.addNew();
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
