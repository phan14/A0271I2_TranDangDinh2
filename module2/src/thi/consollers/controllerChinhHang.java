package thi.consollers;

import thi.lib.CheckChoice;

import thi.services.DienThoaiChinhHangService;

import java.util.Scanner;

public class controllerChinhHang {
    public static Scanner sc = new Scanner(System.in);

    public static void addNew() {
        DienThoaiChinhHangService dienThoaiChinhHangService = new DienThoaiChinhHangService();

        System.out.println("QUẢN LÝ ĐIỆN THOẠI CHÍNH HÃNG \n" +
                "Chọn chức năng theo số (để tiếp tục):\n" +
                "1. Thêm mới\n" +
                "2. Xóa\n" +
                "3. Xem danh sách điện thoại\n" +
                "4. Tìm kiếm\n" +
                "5. Thoát\n");
        int choice = CheckChoice.soNguyen();
        switch (choice) {
            case 1:
                dienThoaiChinhHangService.addNew();
                break;
            case 2:
                dienThoaiChinhHangService.xoa();
                break;
            case 3:
                dienThoaiChinhHangService.displayList();
                break;
            case 4:
                dienThoaiChinhHangService.timKiem();
                break;
            case 5:
                controller.displayMenu();
            default:
                System.out.println("Chọn sai,vui lòng chỉ chọn số nguyên từ 1 đến 5");
        }
    }

}

