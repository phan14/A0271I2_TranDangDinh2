package thi.services;

import thi.lib.CheckChoice;
import thi.modles.DienThoaiXachay;
import thi.utils.ReadAndWriteByteStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DienThoaiXachTayService implements XachTayService {
    static Scanner sc = new Scanner(System.in);
    private static List<DienThoaiXachay> xachtays = new ArrayList<>();

    ReadAndWriteByteStream<DienThoaiXachay> readAndWrite = new ReadAndWriteByteStream<>();
    static final String path = "src\\thi\\data\\mobiles.csv";

    @Override
    public void addNew() {
        xachtays = readAndWrite.readFileByteStream(path);
        int id = 0;
        if (xachtays.isEmpty()) {
            id = 1;
        } else {
            id = xachtays.get(xachtays.size() - 1).getId() + 1;
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

        System.out.println(" Quốc gia xách tay.");
        String quocGia = sc.nextLine();

        System.out.println("Trạng thái");
        String trangThai = sc.nextLine();

        DienThoaiXachay newXachTay = new DienThoaiXachay(id, code, name, gia, soLuong, nhaXuatBan, quocGia, trangThai);
        xachtays.add(newXachTay);
        readAndWrite.writeFileByteStream(xachtays, path);
    }

    @Override
    public void xoa() {
        xachtays = readAndWrite.readFileByteStream(path);
        if (!xachtays.isEmpty()) {
            System.out.println("Nhập id muốn xóa");
            int id = sc.nextInt();
            boolean check4 = false;
            for (int i = 0; i < xachtays.size(); i++) {
                if (id == xachtays.get(i).getId()) {
                    check4 = true;
                    xachtays.remove(i);
                    break;
                }
            }
            if (check4) {
                System.out.println("bạn đã xóa thành công");
            } else {
                System.out.println("id bạn nhập không tồn tại");
            }
            readAndWrite.writeFileByteStream(xachtays, path);
        }

    }

    @Override
    public void displayList() {
        xachtays = readAndWrite.readFileByteStream(path);
        for (DienThoaiXachay e : xachtays) {
            System.out.println(e.toString());
        }

    }

    @Override
    public void timKiem() {
        xachtays = readAndWrite.readFileByteStream(path);
        if (!xachtays.isEmpty()) {
            System.out.println("Nhập id muốn xóa");
            int id = sc.nextInt();
            boolean check4 = false;
            for (int i = 0; i < xachtays.size(); i++) {
                if (id == xachtays.get(i).getId()) {
                    check4 = true;
                    break;
                }
            }
            if (check4) {
                System.out.println("Diện thoại cần tìm là " + xachtays.get(id));
            } else {
                System.out.println("id bạn nhập không tồn tại");
            }
            readAndWrite.writeFileByteStream(xachtays, path);
        }

    }

}
