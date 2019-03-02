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
public class Person {
    String lastName, firstName, pEmail;
    public static String id;
    

    public String getPId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public Person(String fName, String lName, String email, Calendar newid)
    {
        this.id = getPersonCurrentId(fName,lName,newid);
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
    
    public String getPEmail()
    {
        return pEmail;
    }
    
    
    public void personDisplay()
    {
         
        System.out.println("Person First Name : "+getFName());
        System.out.println("Person Last Name : "+getLName());
        System.out.println("Person Email : "+getPEmail());
        System.out.println("Person Id : "+getPId());
    }
    
     public String getPersonCurrentId(String fname, String lName, Calendar id)
    {
        Calendar calendar = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("yy-MMM-dd");
	Calendar cal = Calendar.getInstance();
       
          char f;
          char l;
              char hyphen='-';
        if(fname.charAt(0)==' ')
            f='X';
            else
             f=fname.charAt(0);
     
         if(lName.charAt(0)==' ')
            l='X';
            else
             l=lName.charAt(0);
        
         
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
          
          String finalId =year+hyphen+month+hyphen+oe+hyphen+f+l;
         return  finalId;

    }
}
