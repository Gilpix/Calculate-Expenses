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
    
     Calendar calendar = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("yy-MMM-dd");
    Calendar cal = Calendar.getInstance();

    public GroupAdmin(String gName, String fName, String lName, String pEmail,Calendar newId)
    {
        super(fName,lName, pEmail,newId);
        groupName = gName;
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
         System.out.println("Group Admin Group name : "+getAdminGroupName());
        System.out.println("Group Admin Name : "+getFName()+" "+getLName());
        System.out.println("Group Admin Email : "+getPEmail());
    }
     
     
         public String getId() {
        return getUserCurrentId();
    }

    public void setId(String id) {
        this.id = id;
    }
     
     
      public String getUserCurrentId()
    {
       
          char f;
          char l;
              char hyphen='-';
        if(getAdminGroupName().charAt(0)==' ')
            f='X';
            else
             f=getAdminGroupName().charAt(0);
     
        int index1 =getAdminGroupName().indexOf(" ");
         if(getAdminGroupName().charAt(index1+1)==' ')
            l='X';
            else
             l=getAdminGroupName().charAt(index1+1);
        
         
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
