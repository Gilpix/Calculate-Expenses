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
    
      
    public User( int mobNo, String fName, String lName, String pEmail, Calendar newId)
    {
        super(fName,lName, pEmail,newId);
       // id=this.getUserCurrentId();

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
        
         
         f = Character.toUpperCase(f);
         l = Character.toUpperCase(l);
         
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
        return getUserCurrentId();
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public  void userDisplay()
    {
         System.out.println("User Current ID : "+getId());
        System.out.println("User First Name : "+getFName());
        System.out.println("User Last Name : "+getLName());
        System.out.println("User Mob No : "+getUserMobNo());
        System.out.println("User Email : "+getPEmail());
        super.personDisplay();
    }
    
    
    
    
}
