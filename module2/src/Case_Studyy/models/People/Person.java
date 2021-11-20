package Case_Studyy.models.People;

public class Person {
    int id;
    String hoTen;
    String NgaySinh;
    String CMND;
    int soDT;
    String Email;

    public Person() {
    }

    public Person(int id, String hoTen, String ngaySinh, String CMND, int soDT, String email) {
        this.id = id;
        this.hoTen = hoTen;
        NgaySinh = ngaySinh;
        this.CMND = CMND;
        this.soDT = soDT;
        Email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return NgaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        NgaySinh = ngaySinh;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public int getSoDT() {
        return soDT;
    }

    public void setSoDT(int soDT) {
        this.soDT = soDT;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", hoTen='" + hoTen + '\'' +
                ", NgaySinh='" + NgaySinh + '\'' +
                ", CMND='" + CMND + '\'' +
                ", soDT=" + soDT +
                ", Email='" + Email + '\'' +
                '}';
    }
}