import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Regular expressions.
 */
public class RegExp {

    /**
     * Get IP address from text.
     *
     * @param text text to parse
     * @return String with IP address
     */
    public static String getIpAddress(String text) {
        // TODO fill in code here for extracting IP address using Regular Expression
        String ipa = "[0-2]?[0-9]{0,2}[.][0-2]?[0-9]{0,2}[.][0-2]?([0-5]{0,2}|8)[.][0-2]?([0-9]{0,2})";
        Pattern pattern = Pattern.compile(ipa);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            return matcher.group();
        }
        return "";
    }
}