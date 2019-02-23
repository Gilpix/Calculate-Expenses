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
public class Person {
    String lastName, firstName, pEmail;
    
    public Person(String fName, String lName, String email)
    {
        
        firstName = fName;
        lastName = lName;
        pEmail = email;
    }
    
    public void setLastName(String lName)
    {
        lastName = lName;
    }
    
    public void setFirstName(String fName)
    {
        firstName = fName;
    }
     public void setPEmail(String email)
    {
        pEmail = email;
    }
    
    public String getFName()
    {
        return firstName;
    }
    public String getLName()
    {
        return lastName;
    }
    
}
