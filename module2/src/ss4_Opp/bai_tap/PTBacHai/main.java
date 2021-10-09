package ss4_Opp.bai_tap.PTBacHai;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("nhập hệ số a:");
        double a=Double.parseDouble(input.nextLine());
        System.out.println("nhập hệ số b:");
        double b=Double.parseDouble(input.nextLine());
        System.out.println("nhập hệ số c:");
        double c=Double.parseDouble(input.nextLine());

        QuadraticEquation quadraticEquation =new QuadraticEquation(a,b,c);
        quadraticEquation.getRoot();
    }
}
