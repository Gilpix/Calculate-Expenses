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
public class Details {
     
       
    
    String detailsDate;
    private String detailsId;
    GroupMember gm;
    Groups gp;
    
    
    public Details (String Ddate)
    {
        detailsDate = Ddate;
        
    }
    public void setDdate(String date)
    {
       detailsDate =  date;
    }
    public String getddate()
    {
        return detailsDate;
    }
      public static String getDetailsCurrentId()
    {
        
        
         Calendar calendar = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("yy-MMM-dd");
    Calendar cal = Calendar.getInstance();
       
          char f;
          char l;
              char hyphen='-';
      
            f='X';        
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

    public String getId() {
        return getDetailsCurrentId();
    }

    public void setId(String id) {
        this.detailsId = id;
    }
      public  void DetailsDisplay()
    {
        System.out.println("Details Id : "+getId());
        System.out.println("Details date : "+getddate());
      
       
    }
}
