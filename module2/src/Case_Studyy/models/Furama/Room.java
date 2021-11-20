package Case_Studyy.models.Furama;

public class Room extends Servicesss {
    String dichVuMienPhi;

    public Room() {
    }

    public Room(String name, int area, int moneyRend, int maxPeople, String rentalType, String dichVuMienPhi) {
        super(name, area, moneyRend, maxPeople, rentalType);
        this.dichVuMienPhi = dichVuMienPhi;
    }

    public String getDichVuMienPhi() {
        return dichVuMienPhi;
    }

    public void setDichVuMienPhi(String dichVuMienPhi) {
        this.dichVuMienPhi = dichVuMienPhi;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVuMienPhi='" + dichVuMienPhi + '\'' +
                '}';
    }

    @Override
    public void showInfor() {
        System.out.println(toString());

    }
}
