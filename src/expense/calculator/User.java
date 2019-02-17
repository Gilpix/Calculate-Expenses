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
    
    
    int uMobileNo;
    
    public User( int mobNo, String fName, String lName, String pEmail)
    {
        super(fName,lName, pEmail);
       
        uMobileNo = mobNo;
    }
    
    
    
    public void setUserMobNo(int number)
    {
        uMobileNo = number;
    }
    
    
    
    public int getUserMobNo()
    {
        return uMobileNo;
    }
    
    
    
    
}
