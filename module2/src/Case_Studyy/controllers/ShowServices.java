package Case_Studyy.controllers;

import java.util.Scanner;

import static Case_Studyy.controllers.MainController.displayMainMenu;

public class ShowServices {
    static void displayShowServices() {
    boolean check =true;
    while (check){
        System.out.println("Chon Chức năng\n" +
                "1.Show all Villa\n" +
                "2.Show all House\n" +
                "3.Show all Room\n" +
                "4.Show All Name Villa Not Duplicate\n" +
                "5.Show All Name House Not Duplicate\n" +
                "6.Show All Name Name Not Duplicate\n" +
                "7.Back to menu\n" +
                "8.Exit\n");

        Scanner scanner =new Scanner(System.in);

        switch (scanner.nextInt()){
            case 1:{
                System.out.println("dfsf");

            }case 2:{

            }case 3:{

            }case 4:{

            }case 5:{

            }case 6:{

            }case 7:{

            }case 8:{
                displayMainMenu();
                break;

            }

        }

    }
}
}

