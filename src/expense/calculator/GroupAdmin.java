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
public class GroupAdmin extends Person {

    String groupName;
     private String id;
    
     

    public GroupAdmin(String gName, String fName, String lName, String pEmail,Calendar newId)
    {
        super(fName,lName, pEmail,newId);
        groupName = gName;
        id=getGroupAdminCurrentId(gName);
    }

    public void setAdminGroupName(String gName)
    {
        groupName = gName;
    }
    public String getAdminGroupName()
    {
        return groupName;
    }
    
     public  void groupAdminDisplay()
    {
        System.out.println("Admin Id :"+getId());
         System.out.println("Group Admin Group Name : "+getAdminGroupName());
        System.out.println("Group Admin Email : "+getPEmail());
        super.personDisplay();
       
    }
     
     
         public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
     
     
      public static String getGroupAdminCurrentId(String gAname)
    {
        Calendar calendar = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("yy-MMM-dd");
    Calendar cal = Calendar.getInstance();
          char f;
          char l;
              char hyphen='-';
        if(gAname.charAt(0)==' ')
            f='X';
            else
             f=gAname.charAt(0);
     
       
        if(gAname.indexOf(" ")>0 &&gAname.indexOf(" ")<gAname.length())
        {
             int index1 =gAname.indexOf(" ");
                 l=gAname.charAt(index1+1);
        }
        else
            l='X';
  
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

}
