/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.LoginException;

/**
 *
 * @author angel
 */
public class ErrorInputUser extends Exception{
    
    

    @Override
    public String getMessage() {
        return "Error: Usuario Inocrrecto";
    }

    
}
