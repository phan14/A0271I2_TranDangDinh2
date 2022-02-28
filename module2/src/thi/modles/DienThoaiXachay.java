package thi.modles;

import java.io.Serializable;

public class DienThoaiXachay extends quanLy implements Serializable {
    private String quocGia;
    private String trangThai;

    public DienThoaiXachay() {
    }

    public DienThoaiXachay(int id, String code, String tenDt, float giaBan, int soLuong, String nSX, String quocGia, String trangThai) {
        super(id, tenDt, giaBan, soLuong, nSX);
        this.quocGia = quocGia;
        this.trangThai = trangThai;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public String getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(String trangThai) {
        this.trangThai = trangThai;
    }

    @Override
    public String toString() {
        return
                super.toString()
                        + quocGia + '|' +
                        trangThai + '|'
                ;
    }
}
