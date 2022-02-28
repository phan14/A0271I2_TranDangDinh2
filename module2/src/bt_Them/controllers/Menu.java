package bt_Them.controllers;

import Case_Studyy.controllers.ShowServices;
import Case_Studyy.services.Impl.CustomerSericesImpl;
import Case_Studyy.services.Impl.EmployeeSericesImpl;
import bt_Them.services.OtoServices;

import java.util.Scanner;

public class Menu {
    public static void displayMainMenu() {
        OtoServices otoServices=new OtoServices();
        boolean check = true;
        while (check) {
            System.out.println("Chon Chức năng\n" +
                    "1.Thêm mới phương tiện \n" +
                    "2.Hiển thị phương tiện \n" +
                    "3.Xóa phương tiện \n" +
                    "4.Thoát\n");

            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {
                    Ycau1.addPhuongTien();
                    break;
                }
                case 2: {
                    otoServices.display();

                    break;

                }
                case 3: {
                    otoServices.remove();
                    break;

                }
                case 4: {


                }
            }
        }

    }
}

