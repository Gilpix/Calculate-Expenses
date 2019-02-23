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
public class ExpenseCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        
        
        Person p = new Person("Kuldeep"," ","kul@gmail.com");
        p.setFirstName("Kamal");
        p.setLastName("Padda");
        p.setPEmail("kamal@1212");
        
        
        
        
        
        User u = new User(9923,"Kuldeep"," ","kul@gmail.com");
        u.setFirstName("Anju");
        u.setLastName("Paul");
        System.out.println("user Current ID : "+u.getId());
        
        
        GroupAdmin ga = new GroupAdmin("Apartment","Kuldeep"," ","kul@gmail.com");
        ga.setAdminGroupName("Niagra Falls");
        ga.setFirstName("Raminder");
        ga.setLastName("Singh");
        ga.setPEmail("raminder@gmail.com");
        
        
        
        GroupMember gm=new GroupMember("Kamaldeep","kamal@gmail.com");
        gm.setMName("Kamal Padda");
        gm.setMEmail("kamala@gmail.com");
        
        
        
        Friends f= new Friends("Kamaldeep","kamal@gmail.com",99238651);
        f.setFname("Kul Singh");
        f.setFemail("kul@gmail.com");
        f.setFmobile(514292151);
        
        
        Bills b=new Bills("Grocery","Niagra fall eating bill",1544,"2019-02-21","Kamala");
        b.setBName("travel");
        b.setBDes("Travel bill for Niagra Falls");
        b.setBAmount(1521);
        b.setBMember("Kamala");
        b.setBDate("2019-02-15");
        
        Details d=new Details("2019-02-15");
        d.setDdate("2019-02-15");
        
        
        
    }
    
}
