package ss11_stack_queue.bai_tap;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class DaoNguocMang {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Stack<Integer> stackInt = new Stack<>();
        System.out.print("Hãy nhập size của mảng: ");
        int sizeArray = Integer.parseInt(scanner.nextLine());
        int[] arrayInteger = new int[sizeArray];

        for (int i = 0; i < arrayInteger.length; i++) {
            System.out.print("Hãy nhập phần tử có index = " + i + " : ");
            arrayInteger[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("Trước khi đảo mảng: "+ Arrays.toString(arrayInteger));
        for (int i = 0; i < arrayInteger.length; i++) {
            stackInt.push(arrayInteger[i]);
        }

// lấy giá trị
        for (int i = 0; i < arrayInteger.length; i++) {
            arrayInteger[i] = stackInt.pop();
        }
        System.out.println("mảng sau khi đảo ngược:\t"+Arrays.toString(arrayInteger));


    }

}


