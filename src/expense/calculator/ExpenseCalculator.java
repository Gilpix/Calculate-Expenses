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
public class ExpenseCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\

        
       Person p = new Person("Kuldeep","Singh","kul@gmail.com",Calendar.getInstance());
        p.personDisplay();
        
        System.out.println("\n---------------------");
        
        
       User u = new User("992386513","Anju","Paul","anju@gmail.com", Calendar.getInstance());
       u.userDisplay();
         System.out.println("\n---------------------");
        
        
        GroupAdmin ga = new GroupAdmin("Niagra Falls","Kamaleep","Singh","kamal@gmail.com", Calendar.getInstance());
        ga.groupAdminDisplay();
        
        System.out.println("\n---------------------");
        
        
       Groups g = new Groups("Apartment","Kuldeep","01-Mar-2019");
       g.GroupDisplay();
        
       System.out.println("\n---------------------");
         
         
        GroupMember gm=new GroupMember("Kamaldeep","kamal@gmail.com");
        gm.GroupMemberDisplay();
        
         System.out.println("\n---------------------");
         
        
        Friends f= new Friends("Kamaldeep","kamal@gmail.com",99238651);
        f.FriendDisplay();
        
         System.out.println("\n---------------------");
        
        Bills b=new Bills("Grocery","Niagra fall eating bill",1544.0,"2019-02-21","Raminder");
        b.BillsDisplay();
        
        System.out.println("\n---------------------");
        
        Details d=new Details("2019-02-15",Calendar.getInstance());        
        d.DetailsDisplay();
    }
    
}
