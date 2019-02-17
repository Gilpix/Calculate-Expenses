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
 
   public Groups (String Gname,String Gmember) 
   {
       groupname = Gname;
       groupmember = Gmember;
       
   }
     public void setname(String Gname)
     {
       groupname =  Gname; 
     }
    public void setmember(String Gmember)
    {
       groupmember  = Gmember;
    }
    public String getgname()
            {
                return groupname;
            }
    public String getgmember()
    {
        return groupmember;
    }
    
}
