package Case_Studyy.services.Impl;

import Case_Studyy.models.People.Employee;
import Case_Studyy.services.EmployeeServices;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class EmployeeSericesImpl implements EmployeeServices {
   static List<Employee> employeeList=new LinkedList<>();
   static Scanner scanner= new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee : employeeList){
            System.out.println(employee.toString());
        }
    }
//
    @Override
    public void add() {
        System.out.println("Nhập id:");
        int id =scanner.nextInt();
        System.out.println("Nhập họ và tên:");
        String hoTen=scanner.nextLine();
        System.out.println("Nhập ngày sinh:");
        String NgaySinh =scanner.nextLine();
        System.out.println("Nhập CMND:");
        String CMND = scanner.nextLine();
        System.out.println("Nhập số điện thoại:");
        int soDT =scanner.nextInt();
        System.out.println("Nhập Email:");
        String Email =scanner.nextLine();
        System.out.println("Nhập trình độ:");
        String trinhDo=scanner.nextLine();
        System.out.println("Nhập vị trí công việc:");
        String viTri= scanner.nextLine();
        System.out.println("Nhập lương:");
        float luong= scanner.nextFloat();

        Employee employee =new Employee(id,hoTen,NgaySinh,CMND,soDT,Email,trinhDo,viTri,luong);

        employeeList.add(employee);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
