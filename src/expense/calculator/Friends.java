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
public class Friends {
     
  
       
    
    String friendName;
    String friendEmail;
    int    FriendMobileno;
    private String friendId;
    
    private User us;
    
    public Friends(String fname,String fEmail,int fmobilenumber)
    {
        friendId=getFriendsCurrentId(fname);
        friendName = fname;
        friendEmail = fEmail;
        FriendMobileno = fmobilenumber;
    }
    public void User(User newUsr)
    {
        this.us = newUsr;
    }
    public void setFname(String name)
    {
        friendName = name;
    }
     public void setFemail(String email)
    {
        friendEmail = email;
    }
      public void setFmobile(int mobile)
    {
        FriendMobileno = mobile;
    }
      public String getFname()
      {
          return friendName;
         
      }
       public String getFemail()
      {
          return friendEmail;
         
      }
           public int getFmobile()
      {
          return FriendMobileno;
         
      }
             public static String getFriendsCurrentId(String name)
    {
        
        
            Calendar calendar = Calendar.getInstance();
             DateFormat dateFormat = new SimpleDateFormat("yy-MMM-dd");
             Calendar cal = Calendar.getInstance();
       
            char f;
          char l;
              char hyphen='-';
        if(name.charAt(0)==' ')
            f='X';
            else
             f=name.charAt(0);
     
       
        if(name.indexOf(" ")>0 && name.indexOf(" ")<name.length())
        {
             int index1 =name.indexOf(" ");
                 l=name.charAt(index1+1);
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
        return friendId;
    }

    public void setId(String id) {
        this. friendId= id;
    }
     public  void FriendDisplay()
    {
        System.out.println("Friend Id : "+getId());
        System.out.println("Friend Name : "+getFname());
        System.out.println("Friend Email : "+getFemail());
        System.out.println("Friend Mobileno  : "+getFmobile());
      
       
    }
    
}
