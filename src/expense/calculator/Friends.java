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
public class Friends {
    
    String friendName;
    String friendEmail;
    int    FriendMobileno;
    
    public Friends(String fname,String fEmail,int fmobilenumber)
    {
        friendName = fname;
        friendEmail = fEmail;
        FriendMobileno = fmobilenumber;
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
}
