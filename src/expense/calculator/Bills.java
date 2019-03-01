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
public class Bills {
    String bill_type;
    String bill_description;
    double bill_amount;
    String bill_date;
    String bill_member;
    private User us;
    private GroupAdmin gad;
    private GroupMember gmem;
    
    public Bills(String bt,String bdes,double bamt,String bdt,String bmem)
    {
        bill_type = bt;
        bill_description = bdes;
        bill_amount = bamt;
        bill_date = bdt;
        bill_member = bmem;
    }
    //anju
    public void User(User newUsr)
    {
        this.us = newUsr;
    }
    public void GroupAdmin(GroupAdmin newgad)
    {
        this.gad = newgad;
    }
    public void GroupMember(GroupMember newgmem)
    {
        this.gmem = newgmem;
    }
    
  public void setBName(String btyp)
    {
        bill_type = btyp;
    }
     public void setBDes(String bdescription)
    {
        bill_description = bdescription;
    }
      public void setBAmount(double bamount)
    {
        bill_amount = bamount;
    } 
      public void setBDate(String bdate)
    {
        bill_date = bdate;
    }
     public void setBMember(String bmember)
    {
        bill_member = bmember;
    }
      
    public String getBName()
      {
          return bill_type;
         
      }
       public String getBDes()
      {
          return bill_description;
         
      }
           public double getBAmount()
      {
          return bill_amount;
         
      }
           public String getBDate()
      {
          return bill_date;
         
      }
       public String getBMember()
      {
          return bill_member;
         
      }
         
       
}
