package Case_Studyy.models.Furama;

public class House extends Servicesss {
    String tieuChuanPhong;
    String mota;
    int soTang;

    public House() {

    }

    public House(String name, int area, int moneyRend, int maxPeople, String rentalType, String tieuChuanPhong, String mota, int soTang) {
        super(name, area, moneyRend, maxPeople, rentalType);
        this.tieuChuanPhong = tieuChuanPhong;
        this.mota = mota;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String toString() {
        return "House{" +
                "tieuChuanPhong='" + tieuChuanPhong + '\'' +
                ", mota='" + mota + '\'' +
                ", soTang=" + soTang +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(toString());
    }
}
