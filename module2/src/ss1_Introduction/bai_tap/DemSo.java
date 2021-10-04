package ss1_Introduction.bai_tap;

import java.util.Scanner;

public class DemSo {
    public DemSo() {
    }

    public static String hangdonvi(int number) {
        String str = "";
        switch(number) {
            case 0:
                str = "không";
                break;
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            case 8:
                str = "eight";
                break;
            case 9:
                str = "nine";
        }

        return str;
    }

    public static String hangchuc(int number) {
        int num = number / 10;
        int num1 = number % 10;
        String str = " ";
        switch(num) {
            case 1:
                switch(num1) {
                    case 0:
                        str = "ten";
                        return str;
                    case 1:
                        str = "eleven";
                        return str;
                    case 2:
                        str = "twelve";
                        return str;
                    case 3:
                        str = "thirteen";
                        return str;
                    case 4:
                        str = " fourteen";
                        return str;
                    case 5:
                        str = "fifteen";
                        return str;
                    case 6:
                        str = "sixteen";
                        return str;
                    case 7:
                        str = "seventeen";
                        return str;
                    case 8:
                        str = "eighteen";
                        return str;
                    case 9:
                        str = "nineteen";
                        return str;
                    default:
                        return str;
                }
            case 2:
                str = "twenty" + hangdonvi(num1);
                break;
            case 3:
                str = "thirty" + hangdonvi(num1);
                break;
            case 4:
                str = "forty " + hangdonvi(num1);
                break;
            case 5:
                str = "fifty" + hangdonvi(num1);
                break;
            case 6:
                str = "sixty " + hangdonvi(num1);
                break;
            case 7:
                str = "seventy" + hangdonvi(num1);
                break;
            case 8:
                str = "eighty " + hangdonvi(num1);
                break;
            case 9:
                str = "ninety" + hangdonvi(num1);
        }

        return str;
    }

    public static String hangtram(int number) {
        int num = number / 100;
        int num1 = number % 100;
        String str = "";
        if (num1 == 0 && num > 0) {
            str = hangdonvi(num) + " hundred";
        } else if (num1 >= 0 && num1 <= 9 && num > 0) {
            str = hangdonvi(num) + " hundred and " + hangdonvi(num1);
        } else {
            str = hangdonvi(num) + " hundred " + hangchuc(num1);
        }

        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập số 1 số ");
        int so = scanner.nextInt();
        if (so < 0) {
            System.out.println("hãy nhập lại 1 số");
        } else if (so <= 9) {
            System.out.println(hangdonvi(so));
        } else if (so <= 99) {
            System.out.println(hangchuc(so));
        } else if (so <= 999) {
            System.out.println(hangtram(so));
        } else {
            System.out.println("chương trình chưa thể đếm được số lớn hơn 1000");
        }

    }
}
