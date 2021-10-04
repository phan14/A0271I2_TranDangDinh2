package ss1_Introduction.bai_tap;

import java.util.Scanner;

public class chuyen_doi_tien_te {
    public static void main(String[] args) {
        double VND = 23000.0d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào số USD:");
        double USD = scanner.nextDouble();
        double rate = USD * VND;
        System.out.print("giá trị quy đổi là : " + rate);
    }
}


