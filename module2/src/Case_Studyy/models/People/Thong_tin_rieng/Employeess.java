package Case_Studyy.models.People.Thong_tin_rieng;

import Case_Studyy.models.People.Person;

public class Employeess extends Person {
    private AcademicLevel academicLevel;// (Trung cấp, Cao đẳng, Đại học và sau đại học)  Note: có thể để data-type: là String or AcademicLevel
    private String position;   //(Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giám đốc.)
    private double salary;

    public Employeess() {
    }

    public Employeess(AcademicLevel academicLevel, String position, double salary) {
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employeess(int id, String hoTen, String ngaySinh, String CMND, int soDT, String email, AcademicLevel academicLevel, String position, double salary) {
        super(id, hoTen, ngaySinh, CMND, soDT, email);
        this.academicLevel = academicLevel;
        this.position = position;
        this.salary = salary;
    }

    public AcademicLevel getAcademicLevel() {
        return academicLevel;
    }

    public void setAcademicLevel(AcademicLevel academicLevel) {
        this.academicLevel = academicLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employeess{" +
                "academicLevel=" + academicLevel +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}';
    }
}