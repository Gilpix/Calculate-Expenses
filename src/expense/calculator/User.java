/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expense.calculator;

/**
 *
 * @author temp
 */
public class User extends Person {
    
    String uEmail;
    int uMobileNo;
    
    public User(String email, int mobNo, String fName, String lName)
    {
        super(fName,lName);
        uEmail = email;
        uMobileNo = mobNo;
    }
    
    
    
}
