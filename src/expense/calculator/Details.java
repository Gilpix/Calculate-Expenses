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
public class Details {
      Calendar calendar = Calendar.getInstance();
    DateFormat dateFormat = new SimpleDateFormat("yy-MMM-dd");
    Calendar cal = Calendar.getInstance();
       
    
    String detailsDate;
    private String detailsId;
    GroupMember gm;
    Groups gp;
    
    
    public Details (String Ddate)
    {
        detailsDate = Ddate;
        
    }
    public void setDdate(String date)
    {
       detailsDate =  date;
    }
    public String getddate()
    {
        return detailsDate;
    }
    
}
