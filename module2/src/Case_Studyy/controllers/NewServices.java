package Case_Studyy.controllers;

import java.util.Scanner;

import static Case_Studyy.controllers.MainController.displayMainMenu;

public class NewServices {

    static void displayNewServices() {

        boolean check = true;
        while (check) {
            System.out.println("Chon Chức năng\n" +
                    "1.Add New Villa\n" +
                    "2.Add New House\n" +
                    "3.Add New Room\n" +
                    "4.Back to menu\n" +
                    "5.Exit\n");


            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {

                }
                case 2: {

                }
                case 3: {

                }
                case 4: {

                }
                case 5: {
                    displayMainMenu();
                    break;

                }

            }

        }
    }
}
