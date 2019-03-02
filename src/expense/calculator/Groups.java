/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expense.calculator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author temp
 */
public class Groups {
    
    
    Calendar calendar = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("yy-MMM-dd");
    Calendar cal = Calendar.getInstance();
    
    
    
    String groupname;
    String groupmember;
    String date;
    
      private String id;
  private GroupAdmin gpa;
   public Groups (String Gname,String Gmember,String GDate) 
   {
       groupname = Gname;
       groupmember = Gmember;
       date = GDate;
     
   }
   
   public void GroupAdmin(GroupAdmin newgpa)
   {
       this.gpa = newgpa;
   }
     public void setname(String Gname)
     {
       groupname =  Gname; 
     }
    public void setmember(String Gmember)
    {
       groupmember  = Gmember;
    }
    public void setDate(String GDate)
    {
        date = GDate;
    }
    public String getgname()
            {
                return groupname;
            }
    public String getgmember()
    {
        return groupmember;
    }
    public String getgdate()
    {
        return date;
    }
    
}
