package thi.consollers;

import thi.lib.CheckChoice;
import thi.services.DienThoaiChinhHangService;
import thi.services.DienThoaiXachTayService;

public class case1 {
    public static void newAdd(){
        System.out.println("Chọn chức năng theo số ( để tiếp tục)"+
                "Chọn chức năng theo số (để tiếp tục):\n" +
                "1. Điện thoại chính hãng\n" +
                "2. Điện thoại xách  tay\n" +
                "3. Thoát\n");
        int choiceOne = CheckChoice.soNguyen();
        switch (choiceOne) {
            case 1:
                new DienThoaiChinhHangService().addNew();
                break;
            case 2:
                new DienThoaiXachTayService().addNew();
                break;
            case 3:
            default:
        }
    }
}
