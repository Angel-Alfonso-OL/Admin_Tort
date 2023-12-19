
package Controller;

import Model.LoginException.ErrorInputPassword;
import Model.LoginException.ErrorInputUser;
import Model.UserAutentication;
import Vista.Login;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginController implements ActionListener{
    
    private final Login LOGIN;
    private final UserAutentication AUTH;
    
    public LoginController(Login login){
        
        this.LOGIN= login;
        AUTH = new UserAutentication(LOGIN.UserTextField.getText(), new String (LOGIN.PasswordUserField.getPassword()));
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
         try {
                    
                    AUTH.verificacion();
                    
                    LOGIN.jLabel5.setText("Todo Correcto");
                    
                } catch (ErrorInputUser ex) {
                    
                   LOGIN. jLabel5.setText("Incorrecto usuario o contraseña");
           
                } catch (ErrorInputPassword ex) {
                    LOGIN.jLabel5.setText("Incorrecto usuario o contraseña");
                }
     }
    
}
