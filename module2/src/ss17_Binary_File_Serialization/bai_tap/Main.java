package ss17_Binary_File_Serialization.bai_tap;


import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ReadAndWrite object = new ReadAndWrite();
        List<SanPham> ds = new ArrayList<>();
        ds.add(new SanPham("BCR11", "Bàn chải chà bồn cầu","ToiletCare", (float) 45.5,"bệ sinh bồn cầu chuyên dụng"));
        ds.add(new SanPham("V22", "VIM","ToiletCare", 60,"Nước sát khuẩn bồn cầu"));
        ds.add(new SanPham("LS33", "Sun light","HomeCare", 55,"Nước lau sàn"));
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