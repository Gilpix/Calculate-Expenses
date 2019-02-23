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
    private String id;
   
    
    public User( int mobNo, String fName, String lName, String pEmail)
    {
        super(fName,lName, pEmail);
        id=this.getUserCurrentId();
       
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
    
    public String getUserCurrentId()
    {
        //System.out.println(dateFormat.format(cal.getTime())); //2016/11/16 12:08:43   
          char f;
          char l;
              char hyphen='-';
        if(getFName().charAt(0)==' ')
            f='X';
            else
             f=getFName().charAt(0);
        
         if(getLName().charAt(0)==' ')
            l='X';
            else
             l=getLName().charAt(0);
        
         
         String dte= dateFormat.format(cal.getTime());
         String year,month,oe;
         int index=0;
         index =dte.indexOf("-");
         year=dte.substring(0,index);
         index++;
         int sv =index;
         index = dte.indexOf("-", index);
          month=dte.substring(sv,index).toUpperCase();
          index++;
         
          oe=dte.substring(index).toUpperCase();
          int oE =Integer.parseInt(oe);
          if(oE%2==0)
              oe="E";
          else
              oe="O";  
         return  year+hyphen+month+hyphen+oe+hyphen+f+l;
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
}
