package ss11_stack_queue.Optonin.bai_tap;
import java.util.*;

public class ThapPhanSangNhiPhan {
    public static void main(String[] args) {
        Stack<String> myStack= new Stack<>();
        Scanner sc= new Scanner(System.in);
        System.out.println("Nhập 1 số nguyên dương từ bàn phím");
        int x =sc.nextInt();

        while (x>0){
            int soDu= x%2;
            System.out.println(soDu);
            myStack.push(soDu+"");
            x= x/2;
        }

        System.out.println("Số nhị phân là:");
        int n =myStack.size();
        for (int i=0 ;i<n ;i++){
            System.out.print(myStack.pop());
        }


    }
}
