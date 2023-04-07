
package loginv2;

import javax.swing.JOptionPane;
import loginv2.Mensajes.Mensajes;


public class Acceso {
    String us = "";
    String pass = "";
    User User1 = new User();
    Mensajes Mensajes = new Mensajes();
     
    public void Acceder(){
        
         while (User1.getUser().equals(us) == false) {
            us = JOptionPane.showInputDialog(Mensajes.msjUs);
            if (User1.getUser().equals(us) == false) {
                JOptionPane.showMessageDialog(null, Mensajes.msjErrorUs, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        while (User1.getPassword().equals(pass) == false) {
            pass = JOptionPane.showInputDialog( Mensajes.msjPass);
            if (User1.getPassword().equals(pass) == false) {
                JOptionPane.showMessageDialog(null, Mensajes.msjErrorPass, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, Mensajes.msjBienvenida+User1.getUser());
    }
}
