package Case_Studyy.models.Furama;

public class Villa extends Servicesss {
    String tieuChuanPhong;
    String moTa;
    float dienTich;
    int soTang;

    public Villa() {
    }

    public Villa(String name, int area, int moneyRend, int maxPeople, String rentalType, String tieuChuanPhong, String moTa, float dienTich, int soTang) {
        super(name, area, moneyRend, maxPeople, rentalType);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTa = moTa;
        this.dienTich = dienTich;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String


    toString() {
        return "Room{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", moTa='" + moTa + '\'' +
                ", dienTich=" + dienTich +
                ", soTang=" + soTang +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(toString());
    }
}
