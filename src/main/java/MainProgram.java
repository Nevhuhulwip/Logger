import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class MainProgram {

    public static final Logger logger = LogManager.getLogger(PasswordChecker.class.getName());

    public static void main(String[] args) {
        PasswordChecker password = new PasswordChecker();
        Scanner in = new Scanner(System.in);
        {
            System.out.println("Please enter password : ");
            String yourPassword = in.nextLine();

            try{
                if(password.isValid(yourPassword )){
                    System.out.println("User password ok");
                }
                if(password.passwordIsOk()){
                    logger.debug("Password is okay");
                }

            }
            catch(Exception e){
                logger.error(e.getMessage());
            }
        }
    }
}
