package ss17_Binary_File_Serialization.bai_tap;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ReadAndWrite object = new ReadAndWrite();
        List<SanPham> ds = new ArrayList<>();
        ds.add(new SanPham("A01", "Iphone11","My", (float) 45.5,"bền bỉ"));
        ds.add(new SanPham("A02", "SamSung","HanQuoc", 60,"tầm trung"));
        ds.add(new SanPham("A03", "Nokia","TrungQUoc", 55,"ít người dùng"));
        //tạo file
        File file = new File("src\\ss17_Binary_File_Serialization\\bai_tap\\danhsach.csv");
//        goi ham write
        object.writeToFile(file,ds);
//        gọi hàm đọc
        List<SanPham> result = object.readFile(file); //đã ép kiểu trong hàm
        for (SanPham element: result) {
            System.out.println(element);
        }
//        //goi ham search()
        object.searchProductByName(file);
    }
}