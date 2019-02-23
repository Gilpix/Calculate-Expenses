/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expense.calculator;
import java.util.Calendar;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author temp
 */
public class User extends Person {
    
    
    Calendar calendar = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("yy-MMM-dd");
	Calendar cal = Calendar.getInstance();
	
       
    
    
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
    
    public String getcurrentDate()
    {
        //System.out.println(dateFormat.format(cal.getTime())); //2016/11/16 12:08:43   
        return dateFormat.format(cal.getTime()); //2016/11/16 12:08:43   
    }
    
    
    
    
}
