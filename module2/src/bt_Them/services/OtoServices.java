package bt_Them.services;

import bt_Them.models.OTo;
import bt_Them.utils.ReadAndWriteFile;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OtoServices implements services , Serializable {
    private Scanner scanner = new Scanner(System.in);
    List<OTo> oToList = new ArrayList<>();


    static final String path = "src\\bt_Them\\data\\oto.csv";
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    @Override
    public void add() {
        System.out.print("Biển kiểm soát :");
        String bienKSoat = scanner.nextLine();
        System.out.print("Tên hãng sản xuất :");
        String tenSX = scanner.nextLine();
        System.out.print("Năm sản xuất :");
        Integer namSX = Integer.parseInt(scanner.nextLine());
        System.out.print("Chủ sở hữu : ");
        String chuSH = scanner.nextLine();
        System.out.print("Số chỗ ngồi :");
        Integer soCho = Integer.parseInt(scanner.nextLine());
        System.out.print("Kiểu xe: ");
        String kieuXe = scanner.nextLine();

        OTo newoto = new OTo(bienKSoat, tenSX, namSX, chuSH, soCho, kieuXe);
        oToList.add(newoto);
        System.out.println("nhập xong dữ liệu ");
        readAndWriteFile.writeFileByteStream(oToList, path);
    }

    @Override
    public void display() {
        oToList = readAndWriteFile.readFileByteStream(path);
        for (OTo o : oToList) {
            System.out.println(o.toString());

        }

    }


    @Override
    public void remove() {
        oToList = readAndWriteFile.readFileByteStream(path);

        if (!oToList.isEmpty()) {
            System.out.println("Nhập bien số cần xóa");
            String bienKX =scanner.nextLine();
            boolean b = false;
            for (int i = 0; i < oToList.size(); i++) {
                oToList.remove(i);
                break;
            }
        }

        readAndWriteFile.writeFileByteStream(oToList,path);

    }
}
