package ss19_String_Regex.bai_tap.Validate_So_Dien_Thoai;

public class PhoneNumberExampleText {
    private static PhoneNumberExample phoneNumber;

    public static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)", "(84)-(0648978489)", "(84)-(0123489648)"};
    public static final String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)", "(aa)-(02222222)", "(84)-(22222222)"};

    public static void main(String[] args) {
        phoneNumber = new PhoneNumberExample();
        for (String phoneNumber1 : validPhoneNumber) {
            boolean isvalid = phoneNumber.validate(phoneNumber1);
            System.out.println("Phone number is " + phoneNumber1 + " is valid: " + isvalid);
        }
        for (String phoneNumber2 : invalidPhoneNumber) {
            boolean isvalid = phoneNumber.validate(phoneNumber2);
            System.out.println("Phone number is " + phoneNumber2 + " is valid: " + isvalid);
        }
    }
}