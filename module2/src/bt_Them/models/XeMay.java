package bt_Them.models;

public class XeMay extends QuanLy {
    private float congSuat;

    public XeMay() {
    }

    public XeMay(String bienKiemSoat, String tenHang, int namSX, String chuSH, float congSuat) {
        super(bienKiemSoat, tenHang, namSX, chuSH);
        this.congSuat = congSuat;
    }

    public float getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(float congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return "XeMay{" +
                "congSuat=" + congSuat +
                '}';
    }
    public void display(){
        System.out.println(toString());
    }
}
