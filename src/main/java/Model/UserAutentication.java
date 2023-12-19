
package Model;

import Model.LoginException.ErrorInputUser;
import Model.LoginException.ErrorInputPassword;

public class UserAutentication {
    
    private final String USER = "Angel";
    private final String PASSWORD = "Angel123";
    private final String inputUser;
    private final String inputPassword;
    
    public UserAutentication(String inputUser, String inputPassword){
        
        this.inputUser = inputUser;
        this.inputPassword = inputPassword;
            
    }
    
    public boolean verificacion() throws ErrorInputUser, ErrorInputPassword{
        
        if(this.verificacionUser()){
            
            if(this.verificacionPassword()){
                return true;
            }else{
                throw new ErrorInputPassword();
            }   
            
        }else{
            throw new ErrorInputUser();
        }
 
    }
    
    private boolean verificacionUser(){
        
        return (this.USER.equals(this.inputUser) ? true : false);
         
    }
    
     private boolean verificacionPassword(){
         
         return (this.PASSWORD.equals(this.inputPassword) ? true : false);
        
    }
}
