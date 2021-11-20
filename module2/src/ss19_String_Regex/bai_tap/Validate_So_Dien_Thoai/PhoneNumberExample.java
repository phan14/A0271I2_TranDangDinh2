package ss19_String_Regex.bai_tap.Validate_So_Dien_Thoai;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String Phone_REGEX =   "^\\(\\d{2}\\)-\\([0]\\d{9}\\)";

    public PhoneNumberExample() {
        pattern = Pattern.compile(Phone_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}