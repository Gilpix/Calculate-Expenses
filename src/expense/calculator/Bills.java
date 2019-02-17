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
