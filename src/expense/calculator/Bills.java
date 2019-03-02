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
public class Bills {
    
   
    
    String bill_type;
    String bill_description;
    double bill_amount;
    String bill_date;
    String bill_member;
    
    private String id;
    
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
        id= getBillCurrentId(bmem);
        
    }
    
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
         
       public static String getBillCurrentId(String bMnane)
    { 
        Calendar calendar = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("yy-MMM-dd");
    Calendar cal = Calendar.getInstance();
        
        char f;
          char l;
              char hyphen='-';
        if(bMnane.charAt(0)==' ')
            f='X';
            else
             f=bMnane.charAt(0);
     
       
        if(bMnane.indexOf(" ")>0 &&bMnane.indexOf(" ")<bMnane.length())
        {
             int index1 =bMnane.indexOf(" ");
                 l=bMnane.charAt(index1+1);
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

    public String getId() {
        return id;
       // return getBillCurrentId();
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public  void BillsDisplay()
    {
        System.out.println("Bill Current ID : "+getId());
        System.out.println("Bill Type : "+getBName());
        System.out.println("Bill Description : "+getBDes());
        System.out.println("Bill Amount : "+getBAmount());
        System.out.println("Bill Creation Date : "+getBDate());
        System.out.println("Bill Member : "+getBMember());
    }
}
