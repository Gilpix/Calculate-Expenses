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
        
        
        User u = new User(9923,"Kuldeep","Singh","kul@gmail.com");
        char f=u.getFName().charAt(0);
        //char l=u.getLName().charAt(0);
         System.out.println("Today's date : "+u.getcurrentDate()+"-"+f);
        
    }
    
}
