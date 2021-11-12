package ss17_Binary_File_Serialization.bai_tap;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class ReadAndWrite {
    static Scanner sc = new Scanner(System.in);

    //hàm write:
    public void writeToFile(File file, List<SanPham> products) {
        ObjectOutputStream oops = null;
        try {
            if (!file.exists()) {
                System.out.println("Tệp KHÔNG tồn tại! Tạo tệp mới");
                file.createNewFile();
            }
            oops = new ObjectOutputStream(new FileOutputStream(file));
            oops.writeObject(products);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (oops != null) {
                try {
                    oops.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    //hàm read():
    public List<SanPham> readFile(File file) {
        List<SanPham> result = null;
        ObjectInputStream ois = null;
        try {
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            ois = new ObjectInputStream(new FileInputStream(file));
            result = (List<SanPham>) ois.readObject();
        } catch (ClassNotFoundException | IOException e) {
            e.printStackTrace();
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return result;
    }
    //hàm search:
    public void searchProductByName(File file) {
        List<SanPham> list = readFile(file);
        System.out.println("Nhập tên sản phẩm: ");
        String name = sc.nextLine();
        boolean check = false;
        for (SanPham element : list) {
            if (name.equals(element.getTenSanPham())) {
                System.out.println(element.toString());
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Không tìm thấy sản phẩm");
        }
    }
}