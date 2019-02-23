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
        
        
         System.out.println("\n---------------------");
        
        
        User u = new User(992386513,"Kuldeep"," ","kul@gmail.com");
        u.setUserMobNo(514292151);
        u.setFirstName("Anju");
        u.setLastName("Paul");
        u.setPEmail("Kuldeep@gmail.com");
        System.out.println("user Current ID : "+u.getId());
        System.out.println("User First Name : "+u.getFName());
        System.out.println("User Last Name : "+u.getLName());
        System.out.println("User Mob No : "+u.getUserMobNo());
        System.out.println("User Email : "+u.getPEmail());
        
        
        
         System.out.println("\n---------------------");
        
        
        GroupAdmin ga = new GroupAdmin("Apartment","Kuldeep"," ","kul@gmail.com");
        ga.setAdminGroupName("Niagra Falls");
        ga.setFirstName("Raminder");
        ga.setLastName("Singh");
        ga.setPEmail("raminder@gmail.com");
        System.out.println("Group Admin Group name : "+ga.getAdminGroupName());
        System.out.println("Group Admin Name : "+ga.getFName()+" "+ga.getLName());
        System.out.println("Group Admin Email : "+ga.getPEmail());
        
         System.out.println("\n---------------------");
        
        GroupMember gm=new GroupMember("Kamaldeep","kamal@gmail.com");
        gm.setMName("Kamal Padda");
        gm.setMEmail("kamala@gmail.com");
        System.out.println("Group member name :"+gm.getMName());
        System.out.println("Group Member Email : "+gm.getMEmail());
        
         System.out.println("\n---------------------");
        
        Friends f= new Friends("Kamaldeep","kamal@gmail.com",99238651);
        f.setFname("Kul Singh");
        f.setFemail("kul@gmail.com");
        f.setFmobile(514292151);
        System.out.println("Add Friend : "+f.getFname());
        System.out.println("Friend Email"+f.getFemail());
        System.out.println("Friend Mobile No : "+f.getFmobile());
        
         System.out.println("\n---------------------");
        
        Bills b=new Bills("Grocery","Niagra fall eating bill",1544,"2019-02-21","Kamala");
        b.setBName("travel");
        b.setBDes("Travel bill for Niagra Falls");
        b.setBAmount(1521);
        b.setBMember("Kamala");
        b.setBDate("2019-02-15");
        System.out.println("Bill Type : "+b.getBName());
        System.out.println("Bill Discription : "+b.getBDes());
        System.out.println("Bill Amount : "+b.getBAmount());
        System.out.println("Bill Member Name : "+b.getBMember());
        System.out.println("Bill Date : "+b.getBDate());
        
        System.out.println("\n---------------------");
        
        Details d=new Details("2019-02-15");
        d.setDdate("2019-02-15");
        System.out.println("Date Details of bill : "+d.getddate());
        
        
    }
    
}
