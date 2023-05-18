package personal.views;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateData {

    String patternName = "^\\S+$";
    Pattern pattern = Pattern.compile(patternName, Pattern.MULTILINE);

    public boolean checkFirstName(String firstName){
        Matcher matcher = pattern.matcher(firstName);
        return !matcher.find();
    }
    public boolean checkLastName(String firstName){
        Matcher matcher = pattern.matcher(firstName);
        return !matcher.find();
    }

    String patternPhone = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7,10}$";
    Pattern patternSecond = Pattern.compile(patternPhone, Pattern.MULTILINE);
    
    public boolean checkPhoneNumber(String phoneNumber){
        Matcher matcher = patternSecond.matcher(phoneNumber);
        return !matcher.find();
    }



}