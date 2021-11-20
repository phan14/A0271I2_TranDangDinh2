package Case_Studyy.models.People;

import java.io.Serializable;

public class Customer extends Person implements Serializable {
    String gioiTinh;
    String loaiKhac;
    String diaChi;

    public Customer() {
    }

    public Customer(int id, String hoTen, String ngaySinh, String CMND, int soDT, String email, String gioiTinh, String loaiKhac, String diaChi) {
        super(id, hoTen, ngaySinh, CMND, soDT, email);
        this.gioiTinh = gioiTinh;
        this.loaiKhac = loaiKhac;
        this.diaChi = diaChi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getLoaiKhac() {
        return loaiKhac;
    }

    public void setLoaiKhac(String loaiKhac) {
        this.loaiKhac = loaiKhac;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "gioiTinh='" + gioiTinh + '\'' +
                ", loaiKhac='" + loaiKhac + '\'' +
                ", diaChi='" + diaChi + '\'' +
                ", id=" + id +
                ", hoTen='" + hoTen + '\'' +
                ", NgaySinh='" + NgaySinh + '\'' +
                ", CMND='" + CMND + '\'' +
                ", soDT=" + soDT +
                ", Email='" + Email + '\'' +
                '}';
    }
}
