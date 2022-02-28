package bt_Them.models;

import java.io.Serializable;

public class OTo extends QuanLy implements Serializable {
    private int soCho;
    private String kieuXe;

    public OTo() {
    }

    public OTo(String bienKiemSoat, String tenHang, int namSX, String chuSH, int soCho, String kieuXe) {
        super(bienKiemSoat, tenHang, namSX, chuSH);
        this.soCho = soCho;
        this.kieuXe = kieuXe;
    }

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return "OTo{" +
                "soCho=" + soCho +
                ", kieuXe='" + kieuXe + '\'' +
                "} " + super.toString();
    }

}
