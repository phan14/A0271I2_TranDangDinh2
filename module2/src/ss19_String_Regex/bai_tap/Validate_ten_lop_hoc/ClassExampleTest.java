package ss19_String_Regex.bai_tap.Validate_ten_lop_hoc;

public class ClassExampleTest {

    private static ClassExample classExample;
    public static final  String[] validate = {"C0318G","A0004H","P1234K"};
    public static final  String[] invalidate = {"M0318G","P0323A","CA0123K","C345M","K9876m"};

    public static void main(String args[]) {
        classExample = new ClassExample();
        for (String test: validate) {
            boolean isvalid = classExample.validate(test);
            System.out.println("Class is " + test +" is valid: "+ isvalid);
        }
        for (String tet : invalidate) {
            boolean isvalid = classExample.validate(tet);
            System.out.println("Class is " + tet +" is valid: "+ isvalid);
        }
    }
}