import org.junit.Assert;
import org.junit.Test;
import javax.swing.*;



public class PasswordTester {

        @Test
        public void isValidMethod() {
            String password= JOptionPane.showInputDialog("ENTER PASSWORD");
            Assert.assertEquals(true,PasswordChecker.isValid(password));

        }
        @Test
        public void isOkayMethod() {
            String password= JOptionPane.showInputDialog("ENTER PASSWORD");
            PasswordChecker.isValid(password);
            Assert.assertEquals(true,PasswordChecker.passwordIsOk());
        }
        @Test
        public void isNeverOkMethod() {
            String password=JOptionPane.showInputDialog("Enter password");
            PasswordChecker.isValid(password);
            Assert.assertEquals(true,PasswordChecker.PasswordNeverOk(password));

    }
}
