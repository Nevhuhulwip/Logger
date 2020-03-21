import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.regex.Pattern;
public class PasswordChecker {
    static final Logger logger = LogManager.getLogger(PasswordChecker.class.getName());
    static ArrayList<String> listOfErrors = new ArrayList<>();

    public static boolean isValid(String yourPassword) {
        Pattern specialCharPatten = Pattern.compile("[$&+,:;=?@#|'<>.^*()%!-]", Pattern.CASE_INSENSITIVE);
        Pattern digitCasePatten = Pattern.compile("[0-9]");
        Pattern UpperCasePatten = Pattern.compile("[A-Z]");
        Pattern lowerCasePatten = Pattern.compile("[a-z]");

        boolean flag = true;

        if (yourPassword.isEmpty()) {
            logger.error("password does not exist ");
            flag = false;

        }
        if (yourPassword.length() < 8) {
            logger.error("Password length must have at least 8 character ");
            flag = false;

        }
        if (!specialCharPatten.matcher(yourPassword).find()) {
            logger.error("Password must have at least one special character ");
            flag = false;

        }
        if (!UpperCasePatten.matcher(yourPassword).find()) {
            logger.error("Password must have at least one uppercase character ");
            flag = false;

        }
        if (!lowerCasePatten.matcher(yourPassword).find()) {
            logger.error("Password must have at least one lowercase character ");
            flag = false;

        }
        if (!digitCasePatten.matcher(yourPassword).find()) {
            logger.error("Password must have at least one digit character ");
            flag = false;

        }
        return flag;
    }

    public static boolean passwordIsOk() {
        boolean flag = false;
        if (listOfErrors.size() <= 3) {
            flag = true;
        }
        return flag;
    }

    public static boolean PasswordNeverOk(String password) {
        boolean flag = false;
        if (password.isEmpty() && password.length() < 8) {
            return flag;

       }
            return flag;

    }
}