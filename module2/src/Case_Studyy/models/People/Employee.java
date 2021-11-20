package Case_Studyy.models.People;

import java.io.Serializable;

public class Employee extends Person implements Serializable {
    String trinhDO;
    String viTri;
    float luong;

    public Employee() {
    }

    public Employee(int id, String hoTen, String ngaySinh, String CMND, int soDT, String email, String trinhDO, String viTri, float luong) {
        super(id, hoTen, ngaySinh, CMND, soDT, email);
        this.trinhDO = trinhDO;
        this.viTri = viTri;
        this.luong = luong;
    }

    public String getTrinhDO() {
        return trinhDO;
    }

    public void setTrinhDO(String trinhDO) {
        this.trinhDO = trinhDO;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public float getLuong() {
        return luong;
    }

    public void setLuong(float luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "trinhDO='" + trinhDO + '\'' +
                ", viTri='" + viTri + '\'' +
                ", luong=" + luong +
                ", id=" + id +
                ", hoTen='" + hoTen + '\'' +
                ", NgaySinh='" + NgaySinh + '\'' +
                ", CMND='" + CMND + '\'' +
                ", soDT=" + soDT +
                ", Email='" + Email + '\'' +
                '}';
    }
}
