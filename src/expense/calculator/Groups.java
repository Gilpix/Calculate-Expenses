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
public class Groups {

    String groupname;
    String groupmember;
    String date;

    private String id;
    private GroupAdmin gpa;

    public Groups(String Gname, String Gmember, String GDate) {
        groupname = Gname;
        groupmember = Gmember;
        date = GDate;
        id = getGroupCurrentId(Gname);

    }

    public void GroupAdmin(GroupAdmin newgpa) {
        this.gpa = newgpa;
    }

    public void setname(String Gname) {
        groupname = Gname;
    }

    public void setmember(String Gmember) {
        groupmember = Gmember;
    }

    public void setDate(String GDate) {
        date = GDate;
    }

    public String getgname() {
        return groupname;
    }

    public String getgmember() {
        return groupmember;
    }

    public String getgdate() {
        return date;
    }

    public static String getGroupCurrentId(String gname) {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("yy-MMM-dd");
        Calendar cal = Calendar.getInstance();
        char f;
        char l;
        char hyphen = '-';
        if (gname.charAt(0) == ' ') {
            f = 'X';
        } else {
            f = gname.charAt(0);
        }

        if (gname.indexOf(" ") > 0 && gname.indexOf(" ") < gname.length()) {
            int index1 = gname.indexOf(" ");
            l = gname.charAt(index1 + 1);
        } else {
            l = 'X';
        }

        f = Character.toUpperCase(f);
        l = Character.toUpperCase(l);

        String dte = dateFormat.format(cal.getTime());
        String year, month, oe;
        int index = 0;
        index = dte.indexOf("-");
        year = dte.substring(0, index);
        index++;
        int sv = index;
        index = dte.indexOf("-", index);
        month = dte.substring(sv, index).toUpperCase();
        index++;

        oe = dte.substring(index).toUpperCase();
        int oE = Integer.parseInt(oe);
        if (oE % 2 == 0) {
            oe = "E";
        } else {
            oe = "O";
        }
        return year + hyphen + month + hyphen + oe + hyphen + f + l;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void GroupDisplay() {
        System.out.println("Group Current ID : " + getId());
        System.out.println("Group Name : " + getgname());
        System.out.println("Group Member " + getgmember());
        System.out.println("Group Creation Date : " + getgdate());

    }

}
