package ss5_access_modifier.bai_tap.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student.getName() + "học ở lớp" + student.getClasses());
        Student student1 = new Student();
        student1.setClasses("C0721G1");
        student1.setName("Thanh");
        System.out.println(student1.getName() + " học ở lớp " + student1.getClasses());
    }
}
