package main;
import com.formdev.flatlaf.FlatLightLaf;
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
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            System.out.println(e);
        }
         
        telas.Login login = new Login();
        login.setVisible(true);
        
        
    }
    
}
