package bt_Them.models;

import java.io.Serializable;

public class QuanLy implements Serializable {
    private String bienKiemSoat;
    private  String tenHang;
    private  int namSX;
    private String chuSH;

    public QuanLy() {
    }

    public QuanLy(String bienKiemSoat, String tenHang, Integer namSX, String chuSH) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHang = tenHang;
        this.namSX = namSX;
        this.chuSH = chuSH;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public Integer getNamSX() {
        return namSX;
    }

    public void setNamSX(Integer namSX) {
        this.namSX = namSX;
    }

    public String getChuSH() {
        return chuSH;
    }

    public void setChuSH(String chuSH) {
        this.chuSH = chuSH;
    }

    @Override
    public String toString() {
        return "QuanLy{" +
                "bienKiemSoat='" + bienKiemSoat + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", namSX='" + namSX + '\'' +
                ", chuSH='" + chuSH + '\'' +
                '}';
    }
    public void display(){
        System.out.println(toString());
    }
}
