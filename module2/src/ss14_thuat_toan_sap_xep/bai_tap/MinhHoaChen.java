package ss14_thuat_toan_sap_xep.bai_tap;

import java.util.Scanner;

public class MinhHoaChen {
    public void insertionSort(int arr[]) {
        int ptChen;
        int vtChen;
        int i;

        // lap qua tat ca cac so
        for (i = 1; i < arr.length; i++) {

            // chon mot gia tri de chen
            ptChen = arr[i];

            // lua chon vi tri de chen
            vtChen = i;

            // kiem tra xem so lien truoc co lon hon gia tri duoc chen khong
            while (vtChen > 0 && ptChen < arr[vtChen - 1]) {
                arr[vtChen] = arr[vtChen - 1];
                vtChen--;
                System.out.println("Di chuyen phan tu: " + arr[vtChen]);
            }

            if (vtChen != i) {
                System.out.println(" Chen phan tu: " + ptChen
                        + ", tai vi tri: " + vtChen);
                // chen phan tu tai vi tri chen
                arr[vtChen] = ptChen;
            }

            System.out.println("Vong lap thu " + i);
            display(arr);
        }
    }

    public void display(int arr[]) {
        int i;
        System.out.print("[");

        // Duyet qua tat ca phan tu
        for (i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("]\n");
    }

    public static void main(String[] args) {
        // khoi tao mang arr
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter arr size:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + arr.length + " values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Your input arr: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        MinhHoaChen insertionSort = new MinhHoaChen();
        System.out.println("Mang du lieu dau vao: ");
        insertionSort.display(arr);
        System.out.println("-----------------------------");
        insertionSort.insertionSort(arr);
        System.out.println("-----------------------------");
        System.out.println("\nMang sau khi da sap xep: ");
        insertionSort.display(arr);
    }
}
