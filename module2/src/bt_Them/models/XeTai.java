package bt_Them.models;

public class XeTai extends QuanLy{
    private float trongTai;

    public XeTai() {
    }

    public XeTai(String bienKiemSoat, String tenHang, int namSX, String chuSH, float trongTai) {
        super(bienKiemSoat, tenHang, namSX, chuSH);
        this.trongTai = trongTai;
    }

    public float getTrongTai() {
        return trongTai;
    }

    public void setTrongTai(float trongTai) {
        this.trongTai = trongTai;
    }

    @Override
    public String toString() {
        return "XeTai{" +
                "trongTai=" + trongTai +
                '}';
    }
    public void display(){
        System.out.println(toString());
    }
}
