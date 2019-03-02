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
    
      public String getGroupCurrentId()
    {
       
          char f;
          char l;
              char hyphen='-';
        if(getgname().charAt(0)==' ')
            f='X';
            else
             f=getgname().charAt(0);
     
         if(getgname().charAt(0)==' ')
            l='X';
            else
             l=getgname().charAt(0);
        
         
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
        return getGroupCurrentId();
    }

    public void setId(String id) {
        this.id = id;
    }
    

    
}
