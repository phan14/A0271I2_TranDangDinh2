package thi.modles;

import java.io.Serializable;

public class DienThoaiChinhHang extends quanLy implements Serializable {
    private String thoiGianBH;
    private String PhamVi;


    public DienThoaiChinhHang(int id, String code, String tenDt, float giaBan, int soLuong, String nSX, String thoiGianBH, String phamVi) {
        super(id, tenDt, giaBan, soLuong, nSX);
        this.thoiGianBH = thoiGianBH;
        PhamVi = phamVi;
    }

    public String getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(String thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }

    public String getPhamVi() {
        return PhamVi;
    }

    public void setPhamVi(String phamVi) {
        PhamVi = phamVi;
    }

    @Override
    public String toString() {
        return super.toString() +
                thoiGianBH + '|' +
                PhamVi + '|'
                ;
    }
}
