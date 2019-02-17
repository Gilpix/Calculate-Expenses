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
public class GroupAdmin extends Person {

    String groupName;

    public GroupAdmin(String gName, String fName, String lName, String pEmail)
    {
        super(fName,lName, pEmail);
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




}
