
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
            us = JOptionPane.showInputDialog(Mensajes.MENSAJE_INGRESAR_USUARIO);
            if (User1.getUser().equals(us) == false) {
                JOptionPane.showMessageDialog(null, Mensajes.MENSAJE_ERROR_USUARIO, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        while (User1.getPassword().equals(pass) == false) {
            pass = JOptionPane.showInputDialog( Mensajes.MENSAJE_INGRESAR_PASSWORD);
            if (User1.getPassword().equals(pass) == false) {
                JOptionPane.showMessageDialog(null, Mensajes.MENSAJE_ERROR_PASSWORD, "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, Mensajes.MENSAJE_DE_BIENVENIDA+User1.getUser());
    }
}
