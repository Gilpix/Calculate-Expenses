/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expense.calculator;

/**
 *
 * @author temp
 */
public class Groups {
    String groupname;
    String groupmember;
    String date;
 
   public Groups (String Gname,String Gmember,String GDate) 
   {
       groupname = Gname;
       groupmember = Gmember;
       date = GDate;
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
