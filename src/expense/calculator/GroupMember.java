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
public class GroupMember {
    
    Calendar calendar = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("yy-MMM-dd");
    Calendar cal = Calendar.getInstance();
    
    String member_name;
    String member_email;
    
    private String id;
    
    private Groups gp;
    private GroupAdmin gad;
    
    public GroupMember(String mn,String me)
    {
        member_name = mn;
        member_email = me;
    }
    public void Groups(Groups newgp)
    {
        this.gp = newgp;
    }
    public void GroupAdmin(GroupAdmin newgad)
    {
        this.gad = newgad;
    }
    
    public void setMName(String mname)
    {
        member_name = mname;
    }
     public void setMEmail(String memail)
    {
        member_email = memail;
    }
      
    public String getMName()
      {
          return member_name;
         
      }
       public String getMEmail()
      {
          return member_email;
         
      }
    
}
