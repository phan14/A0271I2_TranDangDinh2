package thi.services;

import thi.lib.CheckChoice;
import thi.modles.DienThoaiChinhHang;
import thi.utils.ReadAndWriteByteStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiChinhHangService implements ChinhHangService {
    static Scanner sc = new Scanner(System.in);
    private static List<DienThoaiChinhHang> ChinhHangs = new ArrayList<>();

    ReadAndWriteByteStream<DienThoaiChinhHang> readAndWrite = new ReadAndWriteByteStream<>();
    static final String path = "src\\thi\\data\\mobiles.csv";


    @Override
    public void addNew() {
        ChinhHangs = readAndWrite.readFileByteStream(path);

        int id = 0;
        if (ChinhHangs.isEmpty()) {
            id = 1;
        } else {
            id = ChinhHangs.get(ChinhHangs.size() - 1).getId() + 1;
        }
        System.out.println("Mã Id");
        String code = sc.nextLine();

        System.out.println("Tên ");
        String name = sc.nextLine();

        System.out.println("Gía");
        int gia = CheckChoice.soNguyen();

        System.out.println("Số lương");
        int soLuong = CheckChoice.soNguyen();

        System.out.println("Nhà sản xuất");
        String nhaXuatBan = sc.nextLine();

        System.out.println("Thời gian bảo hành");
        String thoigian = sc.nextLine();

        System.out.println("Phạm vi bảo hành");
        String phamVi = sc.nextLine();

        DienThoaiChinhHang newChinhHang = new DienThoaiChinhHang(id, code, name, gia, soLuong, nhaXuatBan, thoigian, phamVi);
        ChinhHangs.add(newChinhHang);
        System.out.println("Nhập dữ liệu thành công");
        readAndWrite.writeFileByteStream(ChinhHangs, path);

    }

    @Override
    public void xoa() {
        ChinhHangs = readAndWrite.readFileByteStream(path);
        if (!ChinhHangs.isEmpty()) {
            System.out.println("Nhập id muốn xóa");
            int id = sc.nextInt();
            boolean check = false;
            for (int i = 0; i < ChinhHangs.size(); i++) {
                if (id == ChinhHangs.get(i).getId()) {
                    check = true;
                    ChinhHangs.remove(i);
                    break;
                }
            }
            if (check) {
                System.out.println("bạn đã xóa thành công");
            } else {
                System.out.println("id không có");
            }
            readAndWrite.writeFileByteStream(ChinhHangs, path);
        }
    }

    @Override
    public void displayList() {
        ChinhHangs = readAndWrite.readFileByteStream(path);
        for (DienThoaiChinhHang hang : ChinhHangs) {
            System.out.println(hang.toString());
        }
    }

    @Override
    public void timKiem() {
        ChinhHangs = readAndWrite.readFileByteStream(path);
        if (!ChinhHangs.isEmpty()) {
            System.out.println("Nhập Id cần tìm ");
            int id = sc.nextInt();
            boolean check = false;
            for (int i = 0; i < ChinhHangs.size(); i++) {
                if (id == ChinhHangs.get(i).getId()) {
                    check = true;
                    break;
                }
            }
            if (check) {
                System.out.println("Điện thoại bạn muốn tìm :" + ChinhHangs.get(id));
            } else {
                System.out.println("id không có");
            }
            readAndWrite.writeFileByteStream(ChinhHangs, path);
        }
    }
}


