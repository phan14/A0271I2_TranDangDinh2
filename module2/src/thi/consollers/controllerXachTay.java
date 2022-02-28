package thi.consollers;

import thi.lib.CheckChoice;
import thi.services.DienThoaiXachTayService;


import java.util.Scanner;

public class controllerXachTay {
    public static Scanner sc = new Scanner(System.in);

    public static void addNew() {
        DienThoaiXachTayService xachTayService = new DienThoaiXachTayService();

        System.out.println("QUẢN LÝ ĐIỆN THOẠI XÁCH TAY \n" +
                "Chọn chức năng theo số (để tiếp tục):\n" +
                "1. Thêm mới\n" +
                "2. Xóa\n" +
                "3. Xem danh sách điện thoại\n" +
                "4. Tìm kiếm\n" +
                "5. Thoát\n");
        int choice = CheckChoice.soNguyen();
        switch (choice) {
            case 1:
                xachTayService.addNew();
                break;
            case 2:
                xachTayService.xoa();
                break;
            case 3:
                xachTayService.displayList();
                break;
            case 4:
                xachTayService.timKiem();
                break;
            case 5:
                controller.displayMenu();
            default:
                System.out.println("Chọn sai,vui lòng chỉ chọn số nguyên từ 1 đến 5");
        }
    }

}

