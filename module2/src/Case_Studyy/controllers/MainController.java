package Case_Studyy.controllers;


import Case_Studyy.services.Impl.CustomerSericesImpl;
import Case_Studyy.services.Impl.EmployeeSericesImpl;

import java.util.Scanner;

public class MainController extends NewServices {

    public static void displayMainMenu() {
        boolean check = true;
        while (check) {
            System.out.println("Chon Chức năng\n" +
                    "1.Add New Services\n" +
                    "2.Show Services\n" +
                    "3.Add New Customer\n" +
                    "4.Show Information of Customer\n" +
                    "5.Add New Booking\n" +
                    "6.Show Information of Employee\n" +
                    "7.Exit\n");


            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {
                   displayNewServices();
                    break;
                }
                case 2: {
                    ShowServices.displayShowServices();
                    break;

                }
                case 3: {
                   new CustomerSericesImpl().add();
                    break;

                }
                case 4: {

                }
                case 5: {

                }case 6: {
                    EmployeeSericesImpl employeeServices= new EmployeeSericesImpl();
                    employeeServices.display();
                    break;
                }
                case 7: {

                }

            }
        }
    }

}

