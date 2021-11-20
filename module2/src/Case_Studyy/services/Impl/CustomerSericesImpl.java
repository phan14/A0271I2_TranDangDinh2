package Case_Studyy.services.Impl;


import Case_Studyy.models.People.Customer;
import Case_Studyy.services.CustomerServices;
import Case_Studyy.util.ReadAndWriteFileByStream;
import Case_Studyy.util.RegexClass;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerSericesImpl implements CustomerServices {
    static List<Customer> customerList=new LinkedList<>();
    static Scanner scanner= new Scanner(System.in);
    static ReadAndWriteFileByStream<Customer> rawfbs = new ReadAndWriteFileByStream<>();
    RegexClass regexClass =new RegexClass();
    static final String FILE_PATH ="src\\Case_Studyy\\data\\customer.csv";

    @Override
    public void display() {
        for (Customer employee : customerList){
            System.out.println(employee.toString());
        }
    }
    //
    @Override
    public void add() {

        System.out.println("Nhập id:");
        int id =Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập họ và tên:");
        String hoTen=scanner.nextLine();
        System.out.println("Nhập ngày sinh:");
        String NgaySinh =scanner.nextLine();
        System.out.println("Nhập CMND:");
        String CMND = scanner.nextLine();
        System.out.println("Nhập số điện thoại:");
        int soDT =Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Email:");
        String Email =scanner.nextLine();
        System.out.println("Nhập giới tính:");
        String gioitinh=scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String diaChi= scanner.nextLine();
        System.out.println("Nhập loại khác:");
       String loaiKhac =scanner.nextLine();

        Customer employee =new Customer(id,hoTen,NgaySinh,CMND,soDT,Email,diaChi,gioitinh,loaiKhac);

        customerList.add(employee);
        rawfbs.writeFileByByteStream(customerList,FILE_PATH);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }

}
