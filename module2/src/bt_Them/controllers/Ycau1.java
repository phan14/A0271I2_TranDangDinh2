package bt_Them.controllers;


import bt_Them.services.OtoServices;

import java.util.Scanner;

public class Ycau1 extends Menu {
    public static void addPhuongTien() {
        OtoServices otoServices =new OtoServices();
        boolean check = true;
        while (check) {
            System.out.println("Chon Chức năng\n" +
                    "1.Thêm xe tải \n" +
                    "2.Thêm ô tô \n" +
                    "3.Thêm xe máy \n" +
                    "4.Thoát\n");

            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {

                    break;
                }
                case 2: {
                    otoServices.add();
                    break;

                }
                case 3: {
                    break;

                }
                case 4: {
                    displayMainMenu();
                    break;


                }
            }
        }

    }
}


