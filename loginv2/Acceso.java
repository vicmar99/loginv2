package loginv2;

import javax.swing.JOptionPane;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 

public class Acceso {

    String email = "";
    String password = "";
    User user = new User();
    Mensajes ms = new Mensajes();
    
    Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    Matcher mather = pattern.matcher(user.getEmail());

    public void Acceder() {

        while (user.getEmail().equals(email) == false ) {
            email = JOptionPane.showInputDialog(ms.EMAIL);
            if (mather.find() == false ) {
                JOptionPane.showMessageDialog(null, ms.ERR_FORMAT_EMAIL, "Error", JOptionPane.ERROR_MESSAGE);
            }else if(user.getEmail().equals(email) == false){
                JOptionPane.showMessageDialog(null, ms.ERROR_EMAIL, "Error", JOptionPane.ERROR_MESSAGE);
            }
                
            }

            while (user.getPassword().equals(password) == false) {
                password = JOptionPane.showInputDialog(ms.PASSWORD);
                if (user.getPassword().equals(password) == false) {
                    JOptionPane.showMessageDialog(null, ms.ERROR_PASSWORD, "Error", JOptionPane.ERROR_MESSAGE);
                }
            }

            JOptionPane.showMessageDialog(null, ms.BIENVENIDA);

        }

    }


