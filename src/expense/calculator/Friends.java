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
     
    Calendar calendar = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("yy-MMM-dd");
    Calendar cal = Calendar.getInstance();
       
    
    String friendName;
    String friendEmail;
    int    FriendMobileno;
      private String friendId;
    
    private User us;
    
    public Friends(String fname,String fEmail,int fmobilenumber)
    {
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
}
