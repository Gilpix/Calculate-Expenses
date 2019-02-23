/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expense.calculator;

import java.util.Calendar;

/**
 *
 * @author temp
 */
public class GroupAdmin extends Person {

    String groupName;

    public GroupAdmin(String gName, String fName, String lName, String pEmail,Calendar newId)
    {
        super(fName,lName, pEmail,newId);
        groupName = gName;
    }

    public void setAdminGroupName(String gName)
    {
        groupName = gName;
    }
    public String getAdminGroupName()
    {
        return groupName;
    }
    
     public  void groupAdminDisplay()
    {
         System.out.println("Group Admin Group name : "+getAdminGroupName());
        System.out.println("Group Admin Name : "+getFName()+" "+getLName());
        System.out.println("Group Admin Email : "+getPEmail());
    }




}
