package Case_Studyy.services.Impl;


import Case_Studyy.models.Furama.Villa;

import Case_Studyy.services.VillaServices;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class VillaSericesImp implements VillaServices {
    static List<Villa> villaList=new LinkedList<>();
    static Scanner scanner= new Scanner(System.in);

    @Override
    public void display() {
        for (Villa employee : villaList){
            System.out.println(employee.toString());
        }
    }

    @Override
    public void add() {
        System.out.println("Nhập name:");
        String name =scanner.nextLine();
        System.out.println("Nhập diện tích sử dụng:");
        int are =Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập chi phí thuê:");
        String MoneyRead =scanner.nextLine();
        System.out.println("Nhập Số người:");
        int maxPeople =Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập kiểu thuê:");
        String rentalType =scanner.nextLine();
        System.out.println("Nhập tiêu chuẩn phòng:");
        String tieuChuanPhong=scanner.nextLine();
        System.out.println("Nhập mô tả:");
        String moTa= scanner.nextLine();
        System.out.println("Nhập số tầng:");
        float soTang= scanner.nextFloat();

//      Villa employee =new Villa(name,area,moneyRend,maxPeople,rentalType,tieuChuanPhong,moTa,dienTich,soTang);
//        villaList.add(employee);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
