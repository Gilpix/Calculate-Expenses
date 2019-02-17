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
public class Details {
    
    String detailsDate;
    
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
