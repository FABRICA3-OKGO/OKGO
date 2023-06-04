package main;
import com.formdev.flatlaf.FlatDarkLaf;
import javax.swing.UIManager;
import telas.Login;

/**
 *
 * @author Alves
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         try {
            UIManager.setLookAndFeel(new FlatDarkLaf());
        } catch (Exception e) {
            System.out.println(e);
        }
         
        telas.Login login = new Login();
        login.setVisible(true);
        
        
    }
    
}
