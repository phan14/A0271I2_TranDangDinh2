package thi.modles;

import java.io.Serializable;

public abstract class quanLy implements Serializable {
    private int id;
    private String tenDt;
    private float giaBan;
    private int soLuong;
    private String nSX;

    public quanLy() {
    }

    public quanLy(int id, String tenDt, float giaBan, int soLuong, String nSX) {
        this.id = id;
        this.tenDt = tenDt;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nSX = nSX;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenDt() {
        return tenDt;
    }

    public void setTenDt(String tenDt) {
        this.tenDt = tenDt;
    }

    public float getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(float giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getnSX() {
        return nSX;
    }

    public void setnSX(String nSX) {
        this.nSX = nSX;
    }

    @Override
    public String toString() {
        return
                +id + '|' +
                        tenDt + '|' +
                        giaBan + '|' +
                        soLuong + '|' +
                        nSX + '|'
                ;
    }
}
