package ss2_loop.bai_tap;

import java.util.Scanner;

public class songuyento20 {
    public static void main(String[] args) {

        System.out.println("NHập số nguyên ");
        Scanner input=new Scanner(System.in);

       int num=input.nextInt();

       int count=0;
        for(int n = 2; count < num; ++n) {
            int i = 2;

            boolean check;
            for(check = true; (double)i <= Math.sqrt((double)n); ++i) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }

            if (check) {
                System.out.println(n);
                ++count;
            }
        }

    }
}