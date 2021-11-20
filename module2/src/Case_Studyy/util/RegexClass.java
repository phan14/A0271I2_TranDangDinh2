package Case_Studyy.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexClass {
    public boolean regexNameService(String nameService) {
        final String REGEX_SERVICE = "^(SVVL|SVRO|SVHO)-[0-9]{4}$";
        return Pattern.matches(REGEX_SERVICE,nameService);
    }
    public boolean dayOfBirth(String dayOfBirth) {
        final String REGEX_DD_MM_YY = "^(0[1-9]|[12][0-9]|3[01])[- /.](0[1-9]|1[012])[- /.](19|20)\\d\\d$";
        Pattern pattern = Pattern.compile(REGEX_DD_MM_YY);
        Matcher matcher = pattern.matcher(dayOfBirth);
        boolean result = matcher.matches();
        return result;
    }
}
