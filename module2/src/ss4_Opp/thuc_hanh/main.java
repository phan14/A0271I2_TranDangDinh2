package ss4_Opp.thuc_hanh;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the width:");
        double width=input.nextDouble();
        System.out.println("Enter the height:");
        double height=input.nextDouble();

        HinhChuNhat hinhChuNhat=new HinhChuNhat(width,height);
        System.out.println("Your Rectangle \n"+ hinhChuNhat.display());
        System.out.println("Perimeter of the Rectangle: "+ hinhChuNhat.getPerimeter());
        System.out.println("Area of the Rectangle: "+ hinhChuNhat.getArea());

    }
}
